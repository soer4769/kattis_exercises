import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;

public class hoest_problem_m {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        HashMap<String,String> talord_tabel = new HashMap();
        talord_tabel.put("en", "1");
        talord_tabel.put("et", "1");
        talord_tabel.put("to", "2");
        talord_tabel.put("tre", "3");
        talord_tabel.put("fire", "4");
        talord_tabel.put("fem", "5");
        talord_tabel.put("seks", "6");
        talord_tabel.put("syv", "7");
        talord_tabel.put("otte", "8");
        talord_tabel.put("ni", "9");
        talord_tabel.put("ti", "10");
        talord_tabel.put("elleve", "11");
        talord_tabel.put("tolv", "12");
        talord_tabel.put("tretten", "13");
        talord_tabel.put("fjorten", "14");
        talord_tabel.put("femten", "15");
        talord_tabel.put("seksten", "16");
        talord_tabel.put("sytten", "17");
        talord_tabel.put("atten", "18");
        talord_tabel.put("nitten", "19");
        talord_tabel.put("tyve", "20");
        talord_tabel.put("tredive", "30");
        talord_tabel.put("fyrre", "40");
        talord_tabel.put("halvtreds", "50");
        talord_tabel.put("tres", "60");
        talord_tabel.put("halvfjerds", "70");
        talord_tabel.put("firs", "80");
        talord_tabel.put("halvfems", "90");
        
        HashMap<String,String> talord_nuller = new HashMap();
        talord_nuller.put("hundrede", "00");
        talord_nuller.put("tusinde", "000");
        talord_nuller.put("millioner", "000000");
        
        while(scanner.hasNext()){
            ArrayList<String> talord = new ArrayList(Arrays.asList(scanner.nextLine().split(" ")));
            String heltal = "000000000";
            int length = 0;
            
            for(int i = 0; i < talord.size(); i++){
                if(talord.get(i).contains("og")){
                    String[] tal_split = talord.get(i).split("og");
                    talord.set(i, tal_split[0]);
                    talord.add(i, tal_split[1]);
                }
                
                for(var map : talord_tabel.entrySet()){
                    if(map.getKey().equals(talord.get(i))){
                        heltal = heltal.substring(0, heltal.length() - map.getValue().length()) + map.getValue();
                        length = Math.max(map.getValue().length(),length);
                        break;
                    }
                }
                
                for(var map : talord_nuller.entrySet()){
                    if(map.getKey().contains(talord.get(i))){
                        heltal = heltal.substring(0,9-length-map.getValue().length()) + heltal.substring(9-length, 9) + map.getValue();
                        length = (map.getKey().equals("hundrede") ? 3 : 0);
                        break;
                    }
                }
                
                System.out.println(talord.get(i) + " " + heltal);
            }
            
            System.out.println(Integer.valueOf(heltal));
        }
    }
}