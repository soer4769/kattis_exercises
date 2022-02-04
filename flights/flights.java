import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class flights {
    public static class timeTable {
        private Map<Integer, String> flights;
        private int n, m;

        private int timeToSeconds(String time){
            String[] timeStr = time.split(":");
            int hourSec = Integer.parseInt(timeStr[0])*3600;
            int minSec  = Integer.parseInt(timeStr[1])*60;
            int seconds = Integer.parseInt(timeStr[2]);

            return (hourSec + minSec + seconds);
        }

        private String secondsToTime(int time){
            String hourSec = String.format("%02d", time/3600);
            String minSec = String.format("%02d", (time % 3600) / 60);
            String seconds = String.format("%02d", time % 60);

            return (hourSec + ":" + minSec + ":" + seconds);
        }

        public void newOperation(String[] operation){
            int time1 = this.timeToSeconds(operation[1]);
            boolean boolKey = this.flights.containsKey(time1);

            switch(operation[0]){
                case "destination":
                    System.out.println(boolKey ? this.flights.get(time1) : "-");
                    break;
                case "cancel":
                    if(boolKey){
                        this.flights.remove(time1);
                    }
                    break;
                case "count":
                    int time2 = this.timeToSeconds(operation[2]);
                    int count = 0;

                    for(int depTime : this.flights.keySet()){
                        if(depTime >= time1 && depTime <= time2){
                            count++;
                        }
                    }

                    System.out.println(count);
                    break;
                case "delay":
                    String destination = this.flights.get(time1);
                    int delay = Integer.parseInt(operation[2]);
                    int newTime = time1 + delay;

                    this.flights.remove(time1);
                    this.flights.put(newTime, destination);
                    break;
                case "reroute":
                    this.flights.put(time1, operation[2]);
                    break;
                case "next":
                    int nextTime = 99999;

                    for(int depTime : this.flights.keySet()){
                        if(depTime >= time1 && depTime < nextTime){
                            nextTime = depTime;
                        }
                    }

                    System.out.println(this.secondsToTime(nextTime) + " " + this.flights.get(nextTime));
                    break;
            }
        }

        public void addFlight(String[] flightInfo){
            this.flights.put(this.timeToSeconds(flightInfo[0]), flightInfo[1]);
        }

        timeTable(int numFlights, int numOperations){
            this.n = numFlights;
            this.m = numOperations;
            this.flights = new HashMap<>();
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), m = scanner.nextInt();
        timeTable flights = new timeTable(n,m);
        scanner.nextLine();

        while(n-- > 0){
            flights.addFlight(scanner.nextLine().split(" "));
        }

        while(m-- > 0){
            flights.newOperation(scanner.nextLine().split(" "));
        }
    }
}
