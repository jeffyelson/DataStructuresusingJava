public class GCD {

    public static int gcdint(int a, int b)
    {
        int output;
        if (a == 0)
        {
            output=b;
        }
        else if ( b == 0)
        {
            output=a;
        }
        else if (a>b)
        {
           output=gcdint(a-b,b);
        }
        else
        {
            output=gcdint(a,b-a);
        }
        return output;
    }

    public static void main(String[] args)
    {
        int final_gcd = gcdint(18,76);
        System.out.println(final_gcd);
    }


}
