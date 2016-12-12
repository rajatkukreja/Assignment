import java.util.Scanner;
public class Que6 {

    public static void main(String[] ar){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        printUpperTriangle(n);
        printLowerTriangle(n-1);
        s.close();
    }

    public static void printLine(int n, char ch){
        for(int i=0; i<n; i++)
            System.out.print(ch);
    }

    public static void printUpperTriangle(int n){
        for(int i=0; i<n; i++){
            printLine(n-i-1,' ');
            printLine(2*i+1,'*');
            System.out.println();
        }
    }

    public static void printLowerTriangle(int n){
        for(int i=0; i<n; i++){
            printLine(i+1,' ');
            printLine(2*(n-i)-1,'*');
            System.out.println();
        }
    }
}
