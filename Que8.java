import java.util.Scanner;
public class Que8 {

    public static void main(String[] ar){
        Scanner s = new Scanner(System.in);
        int start = s.nextInt();
        int end = s.nextInt();
        FizzBuzz(start,end);
        s.close();
    }

    public static void FizzBuzz(int start,int end){
        for(int i=start; i<= end; i++){
            boolean fizz = isDivisibleBy3(i);
            boolean buzz = isDivisibleBy5(i);
            System.out.println(fizz || buzz ? "" : i + "");
        }
    }

    public static boolean isDivisibleBy3(int n){
        if(n % 3 == 0) {
            System.out.print("Fizz");
            return true;
        }
        return false;
    }

    public static boolean isDivisibleBy5(int n){
        if(n % 5 == 0) {
            System.out.print("Buzz");
            return true;
        }
        return false;
    }
}
