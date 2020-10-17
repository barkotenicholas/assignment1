public class Number1 {


    public int findmissingnumber(int[] a, int n)
    {
        //declaring ints
        int i;
        int sum;

        sum = (n + 1) * (n + 2) / 2;

        for (i = 0; i < n; i++) {
            sum -= a[i];
        }
        return sum;
    }

    public static void main(String[] args)
    {

        //declaring an array

        int[] a = { 1, 2, 4, 5, 6 };
        int n = 5 ;
        Number1 number1 = new Number1();

        //printout the missing number
        System.out.println( number1.findmissingnumber(a, 5));
    }
}
