package math.problems;


public class Factorial {
    static int fact(int n)
    {
        int x;
        if(n==1)
        {
            return 1;
        }
        else {
            x = n*fact(n-1);
            return x;
        }
    }


    public static void main(String[] args)
    {
        int number = 27;
        int fact = 1;
        int i;
        for (i=1; i<= number;i++)
        {
            fact = fact * i;


        }
        System.out.println("The factorial of 27 is: " + fact);

    }
}
