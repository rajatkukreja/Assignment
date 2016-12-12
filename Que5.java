import java.util.Scanner;
public class Que5 {

    public static void main(String[] ar){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i=0; i<n; i++){
            printLine(n-i-1,' ');
            printLine(2*i+1,'*');
            System.out.println();
        }
        s.close();
    }

    public static void printLine(int n, char ch){
        for(int i=0; i<n; i++)
            System.out.print(ch);
    }
}
