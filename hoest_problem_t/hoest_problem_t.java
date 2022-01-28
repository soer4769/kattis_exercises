import java.util.Scanner;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.regex.*;

public class hoest_problem_t {
    static Scanner scanner = new Scanner(System.in);
    
    public static class minkGrave {
        int h, b, d;
        StringBuilder grave;
        TreeMap<Integer,ArrayList<Integer>> minks_dirt;
        TreeMap<Integer,Integer> minks_relations;
        
        public minkGrave(){
            this.h = scanner.nextInt();
            this.b = scanner.nextInt();
            this.d = scanner.nextInt();
            this.grave = new StringBuilder();
            this.minks_dirt = new TreeMap();
            this.minks_relations = new TreeMap();
            
            for(int i = 0; i < this.h; i++){
                this.grave.append(scanner.next());
            }
        }
        
        public void dataGathering(){
            Pattern.compile("=").matcher(this.grave).results().forEach(result -> {
                this.minks_dirt.put(result.start(), new ArrayList());
                this.minks_relations.put(result.start(),-1);
            });
            
            for(int k = 1; k < (this.b-1); k++){
                ArrayList<Integer> dirt = new ArrayList();
                int pre_mink = -1;
                
                for(int l = 0; l < (this.h-1); l++){
                    int cell = k+l*this.b;
                    char character = this.grave.charAt(cell);
                    int add = ((character == '<' || character == '>') ? 61-(int)character : 0);
                    
                    if(character == '#'){
                        dirt.add(cell);
                        continue;
                    }
                    
                    this.minks_dirt.get(cell+add).addAll(dirt);
                    dirt.clear();
                    
                    if(pre_mink > -1){
                        this.minks_relations.put(cell+add, pre_mink);
                    }
                    
                    pre_mink = cell+add;
                }
            }
        }
        
        public void relationsTreeOrdering(){
            this.minks_relations.entrySet().stream().filter(entry -> entry.getValue() != -1).forEach(entry -> {
                int temp = entry.getValue();
                this.minks_relations.replace(entry.getKey(),this.minks_relations.get(temp));
                this.minks_relations.replace(temp,entry.getKey());
            });
        }
        
        public void removeOptimalMinks(){
            ArrayList<Integer> minks_tree = new ArrayList();
            System.out.println("before: " + this.minks_relations.toString());
            
            for(int m = 0; m < this.minks_relations.size(); m++){
                Object mink_key = this.minks_relations.keySet().toArray()[m];
                int mink_value = this.minks_relations.get(mink_key);
                
                if(mink_value != -1){
                    minks_tree.add(Integer.valueOf(mink_key.toString()));
                    minks_relations.remove(mink_key);
                    m = Math.max(0, new ArrayList(this.minks_relations.keySet()).indexOf(mink_value)-1);
                    System.out.println("m: " + m);
                    
                    if(this.minks_relations.get(this.minks_relations.keySet().toArray()[m]) == -1){
                        mink_key = this.minks_relations.keySet().toArray()[m];
                        minks_tree.add(Integer.valueOf(mink_key.toString()));
                        minks_relations.remove(mink_key);
                        System.out.println("End of tree: " + minks_tree);
                        m = 0;
                    }
                }
                
                //System.out.println("key: " + mink_key.toString() + ", value: " + mink_value);
                
                /*if(minks_tree.size() == 0 && (mink_value == -1 || !minks_tree.contains(mink_key))){
                    System.out.println("id: " + mink_key + ", cost: " + this.minks_dirt.get(mink_key).size() + ", difference: " + (this.d-this.minks_dirt.get(mink_key).size()));
                    
                    if(mink_value != -1){
                        minks_tree.add(mink_value);
                    }
                }*/
                
                /*
                if(mink_value != -1 || minks_tree.size() != 0){
                    minks_relations.remove(mink_key);
                    m = new ArrayList(this.minks_relations.keySet()).indexOf(mink_value)-2;
                    continue;
                }
                
                else {
                    
                }*/
            }
        }
        
        public void printGrave(){
            for(int j = 0; j < this.h; j++){
                System.out.println(this.grave.substring(j*this.b, j*this.b+this.b));
            }
        }
        
        public void debugData(){
            System.out.println("\ndata: ");
            System.out.println("h: " + h + ", b: " + b + ", d: " + d);
            System.out.println("\nRelations: " + minks_relations.toString() + "\nDirt: " + minks_dirt.toString() + "\n" + "-".repeat(50));
        }
    }
    
    public static void main(String[] args){
        while(scanner.hasNext()){
            minkGrave mg = new minkGrave();
            mg.dataGathering();
            mg.relationsTreeOrdering();
            mg.removeOptimalMinks();
            mg.printGrave();
            mg.debugData();
        }
    }
}