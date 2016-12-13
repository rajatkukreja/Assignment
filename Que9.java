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
        List primeFactors = new List();
        getSmallerPrimeFactors(n, primeFactors);
        getLargerPrimeFactors(n, primeFactors);
        return primeFactors.toArray();
    }

    private static void getLargerPrimeFactors(int n, List primeFactors) {
        if(primeFactors.size() == 0) {
            primeFactors.add(n);
            return;
        }
        for(int i=primeFactors.size()-1; i>=0; i--){
            int fact = n/primeFactors.get(i);
            if(isPrime(fact))
                primeFactors.add(fact);
        }
    }

    private static void getSmallerPrimeFactors(int n, List primeFactors) {
        for(int i=2; i<=maxPossibleSmallerFactor(n); i++){
            if(n % i == 0 && isPrime(i))
                primeFactors.add(i);
        }
    }

    public static boolean isPrime(int n){
        for(int i=2; i<=maxPossibleSmallerFactor(n); i++){
            if(n % i == 0)
                return false;
        }
        return true;
    }

    public static int maxPossibleSmallerFactor(int n){
        return (int)Math.sqrt(n);
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

    public int size(){
        return list.size();
    }

    public int get(int index){
        return ((Integer)list.get(index)).intValue();
    }
}
