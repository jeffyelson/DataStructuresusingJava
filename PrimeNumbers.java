public class PrimeNumbers {
    
    public static boolean isPrime(int n) {
        // TODO: implementation
    	int i; //integer i for iterating through the loop to check if n is prime
    	boolean checkPrime=true;
    	if (n<=1)
    	{
    	    return false;
    	}
    	else
    	{
    	    	for(i=2;i<=n/2;i++)
    	{
    		if(n%i==0) {
    		    checkPrime=false;
    			break;
    		}
    	}
    	}
    
    		return checkPrime;
    }

    public static int nextPrime(int n) {
        // TODO: implementation
    	while (!isPrime(n))
    	{
    		n++;
    	}
    	return n;
    }
    
    public static void main(String[] args) {
        // TODO: test your implementation!
    	boolean check_num;
    	check_num=isPrime(24);
    	if(check_num==false) {
    		int next_prime=nextPrime(24);
    		System.out.println(+next_prime);
    	}
    	
    }

}