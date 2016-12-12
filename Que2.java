import java.util.Scanner;
public class Que2 {
    public static void main(String[] ar){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i=0; i<n; i++)
            System.out.print("*");
        s.close();
    }
}
