class Main
{
    public static void main(String args[])
    {
        try
        {
            int d=60/0;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Bad request");
        }
        try
        {
            int d=60/0;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Catch block is running");
        }
        finally
        {
            System.out.println("Finally is running");
        }
    }
}