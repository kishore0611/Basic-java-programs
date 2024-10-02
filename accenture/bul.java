import java.util.Scanner;

public class bul{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); 
        String s = sc.nextLine();
        String h = repeat(s, n);
        System.out.println(h);
    }

    public static String repeat(String s, int n) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < n; i++) {
            str.append(s);
        }
        return str.toString();
    }
}