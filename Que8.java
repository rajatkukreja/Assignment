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
            boolean fizz = isDivisible(i,3,"Fizz");
            boolean buzz = isDivisible(i,5,"Buzz");
            System.out.println(fizz || buzz ? "" : i + "");
        }
    }

    public static boolean isDivisible(int number,int divisor, String str){
        if(number % divisor == 0) {
            System.out.print(str);
            return true;
        }
        return false;
    }
}