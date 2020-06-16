package section5;

public class CommonExceptions {

    public static void main(String[] args) {

        divideByZero(5,0);
        arrayOutOfBounds();
    }


    public static void divideByZero(int a, int b)
    {
        double aVar;
        try {
            aVar = a / b;
            System.out.println(aVar);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Cannot divide by zero");
            System.out.println(e.toString());
        }
    }

    public static void arrayOutOfBounds()
    {
        String[] states = { "aa", "bb", "cc"};

        for (int i=0; i<=states.length; i++)
        try{
            System.out.println(states[i]);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Error: Index outside of array domain");
            System.out.println(e.toString());
        }
        finally {
            System.out.println("iterating through array");
        }
    }


}
