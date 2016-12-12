import java.util.*;
public class Que4 {
    public static void main(String[] ar){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i=0; i<n; i++)
            printLine(i+1);
        s.close();
    }

    public static void printLine(int n){
        for(int i=0; i<n; i++)
            System.out.print("*");
        System.out.println();
    }
}
