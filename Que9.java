import java.util.ArrayList;
import java.util.Scanner;
public class Que9 {

    public static void main(String[] ar){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] list = generate(n);
        for(int i=0; i<list.length; i++)
            System.out.print(list[i] + " ");
        s.close();
    }

    public static int[] generate(int n){
        if(n == 1)
            return new int[] {1};
        List primeFactors = new List();
        for(int i=2; i<=n; i++){
            if(n % i == 0 && isPrime(i))
                primeFactors.add(i);
        }
        return primeFactors.toArray();
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

class List {
    private ArrayList list = new ArrayList();

    public void add(int n){
        list.add(new Integer(n));
    }

    public int[] toArray(){
        int[] arr = new int[list.size()];
        for(int i=0; i<arr.length; i++)
            arr[i] = ((Integer)list.get(i)).intValue();
        return arr;
    }
}
