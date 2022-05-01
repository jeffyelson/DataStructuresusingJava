public class PrimeTwins {

  public static int[][] primeTwins(int number) {
    // TODO: implementation
	  int[][] primetwins = new int[number][2];
	  int p=2;
	  int i=0;
	  while(number>0){
	     
	     if(isPrime(p) && isPrime(p+2))
	     {
	         int q = p+2;
	          primetwins[i][0]=p;
		      primetwins[i][1]=q;
		      i++;
		      number--;
		      p++;
	     }
	     else
	     {
	         p++;
	     }
		
	  }
	     

	  
	  return primetwins;
  }
  
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


  public static int[][] primeTriplets(int number) {
    // TODO: implementation
	 int[][] primetriplets = new int[number][3];
	 int p=2;
	  int i=0;
	  int q;
	  while(number>0){
	     
	     if((isPrime(p) && isPrime(p+6)) && (isPrime(p+2) || isPrime(p+4)))
	     {
	         int r = p+6;
	         if(isPrime(p+2)){
	             q=p+2;
	             primetriplets[i][1]=q;
	         }
	         else {
	             q=p+4;
	             primetriplets[i][1]=q;
	         }
	   
	          primetriplets[i][0]=p;
		      primetriplets[i][2]=r;
		      i++;
		      number--;
		      p++; 
	     }
	     else
	     {
	         p++;
	     }
		
	  }
	     
return primetriplets;
 }
  
 

 public static void main(String[] args) {
    // TODO: include tests here
    	  int[][] output = new int[5][2];
    	  output=primeTriplets(5);
    	  for (int x = 0; x < 5; x++) {
        for (int y = 0; y < 2; y++) {
            System.out.printf("%d ", output[x][y]);
        }
        System.out.println();
    }

 }

}