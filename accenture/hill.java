import java.util.Scanner;
public class hill {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String f=sc.nextLine();
        f=f.toLowerCase();
        int c=0,v=0;
        for(int i=0;i<f.length();i++){
            if(f.charAt(i)=='u'){
               v+=1;
            }
            else if(f.charAt(i)=='d'){
                v-=1;
            }
            if((v==-1)&& (f.charAt(i+1)=='u')){
               c++;
            }
        }
        System.out.println(c);
    }
}
