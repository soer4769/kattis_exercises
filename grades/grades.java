import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class grades {
    public static class gradeSorter {
        private enum gradeLevels {
            A,B,C,D,E,FX,F
        }
        private int studentCount;
        private List<String> studentNames, studentGrades;

        public void addStudent(String[] student){
            this.studentNames.add(student[0]);
            this.studentGrades.add(student[1]);
        }

        private void swapStudents(int i, int j){
            String tempName = this.studentNames.get(i);
            String tempGrade = this.studentGrades.get(i);

            this.studentNames.set(i, this.studentNames.get(j));
            this.studentNames.set(j, tempName);
            this.studentGrades.set(i, this.studentGrades.get(j));
            this.studentGrades.set(j, tempGrade);
        }

        public void sort(){
            for(int i = 0; i < this.studentCount; i++){
                for(int j = i+1; j < this.studentCount; j++){
                    gradeLevels student1 = gradeLevels.valueOf(studentGrades.get(i));
                    gradeLevels student2 = gradeLevels.valueOf(studentGrades.get(j));

                    if(student1.compareTo(student2) > 0 || student1.contains){
                        this.swapStudents(i,j);
                    }
                }
            }
        }

        public void printStudents(){
            for(int i = 0; i < this.studentCount; i++){
                System.out.println(this.studentNames.get(i) + "(" + this.studentGrades.get(i) + ")");
            }
        }

        gradeSorter(int n){
            this.studentCount = n;
            this.studentNames = new ArrayList<>();
            this.studentGrades = new ArrayList<>();
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        gradeSorter studentGrades = new gradeSorter(scanner.nextInt());
        scanner.nextLine();

        while(scanner.hasNextLine()){
            studentGrades.addStudent(scanner.nextLine().split(" "));
        }

        studentGrades.sort();
        studentGrades.printStudents();
    }
}
