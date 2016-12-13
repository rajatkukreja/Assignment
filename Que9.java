import java.util.ArrayList;
import java.util.Scanner;
public class Que9 {

    public static void main(String[] ar){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Integer[] list = generate(n);
        for(int i=0; i<list.length; i++)
            System.out.print(list[i] + " ");
        s.close();
    }

    public static Integer[] generate(int n){
        if(n == 1)
            return new Integer[] {new Integer(1)};
        ArrayList list = new ArrayList();
        for(int i=2; i<=n; i++){
            if(n % i == 0 && isPrime(i))
                list.add(new Integer(i));
        }
        return (Integer[])list.toArray(new Integer[1]);
    }

    public static boolean isPrime(int n){
        int end = (int)Math.sqrt(n);
        for(int i=2; i<=end; i++){
            if(n % i == 0)
                return false;
        }
        return true;
    }
}
