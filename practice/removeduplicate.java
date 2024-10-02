import java.util.*;
class removeduplicate {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        ArrayList <Integer> m=new ArrayList<>();
        while(true){
            int val=sc.nextInt();
            if(val==-1){
                break;
            }
            m.add(val);
        }
        for(int i=0;i<m.size();i++){
            for(int j=0;j<m.size();j++){
                if(m.get(i)==m.get(j)&&(i!=j)){
                    m.remove(j);
                }
            }
        }
        System.out.print(m);
    }
}
