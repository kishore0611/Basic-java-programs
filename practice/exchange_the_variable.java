import java.util.*;

 class exchange_the_variable{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int size=str.length();
        char[] arr=str.toCharArray();
        int[] arr1=new int[size];
        char[] arr2=new char[size];
int j=0;

        for(int i=0;i<size;i++){
            j++;
            if(Character.isDigit(arr[i]))
            arr1[j]=arr[i];
    }
    for(int i=size-1;i>size-1;i--){
        j=size-1;
        if(Character.isAlphabetic(arr[i]))
        arr2[j]=arr[i];
    }
    for(int i=0;i<size;i++)
    System.out.printf("%c%d",arr1[i],arr2[i]);
}
}