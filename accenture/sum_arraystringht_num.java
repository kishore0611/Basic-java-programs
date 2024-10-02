import java.util.Arrays;
import java.util.Scanner;
class sum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i<n; i++) {
            arr[i]=sc.nextInt();
            
        }
        stright(arr,n);
    }
        public static void stright(int[] arr,int n){
        Arrays.sort(arr);
        int sum=0;
        sum=(arr[1]-arr[0])+(arr[n-1]-arr[n-2]);
        int a1,a2;
        for(int i=0;i<=n-1;i++){
            a1=arr[i]-arr[i-1];
            a2=arr[i+1]-arr[i];
            sum=sum+Math.min(a1,a2);
        }
        System.out.println(sum);

    }
}