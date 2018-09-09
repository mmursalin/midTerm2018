package math.problems;

public class Fibonacci {


    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
         */

        int i = 4;
        int n = 1;
    System.out.println("40 Fibonacci numbers are; ");
    for (int t = 1; t<= 40; t++){
        int sum = i + n;
        n = sum;
        System.out.print(sum + " ");
    }
    }
}
