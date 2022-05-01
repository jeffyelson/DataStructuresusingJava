public class MedianOfThree {

  public static int median(int a, int b, int c) {
    // TODO: add implementation
	  int [] medianArray= new int[3]; //array to sort the three numbers
	  //sorting elements in an array in ascending order
	  if (a>=b)
	  {
		  if(a>=c) {
			  medianArray[2]=a;
			  if(b>=c) {
				  medianArray[1]=b;
				  medianArray[0]=c;
			  }
			  else
			  {
				  medianArray[1]=c;
				  medianArray[0]=b; 
			  }
		  }
		  else
		  {
			  medianArray[2]=c;
			  medianArray[1]=a;
			  medianArray[0]=b;
		  }
	  }
	  else
	  {
		  if(b>=c) {
			  medianArray[2]=b;
			  if(c>=a) {
				  medianArray[1]=c;
				  medianArray[0]=a;
			  }
			  else
			  {
				  medianArray[1]=a;
				  medianArray[0]=c;
			  }
		  }
		  else
		  {
			  medianArray[2]=c;
			  medianArray[1]=b;
			  medianArray[0]=a;
		  }
	  }
	  return medianArray[1]; //returning the middle element of the array
  }

  public static int median2(int a, int b, int c) {
    // TODO: add implementation
	  if(a==b||a==c) //checking if any two numbers are the same
	    {
	        return a;
	    }
	    else if(b==c)
	    {
	        return b;
	    }
    else //if two numbers are not the same,we need to check which number is closer to the mean
    {
    	int mean=(a+b+c)/3;
        int diff_mean_a=Math.abs(a-mean); //difference between the mean and a 
        int diff_mean_b=Math.abs(b-mean); //difference between the mean and b
        int diff_mean_c=Math.abs(c-mean); //difference between the mean and c
        if(diff_mean_a<diff_mean_b && diff_mean_a<diff_mean_c)
        {
        	return a;
        }
        else if(diff_mean_b<diff_mean_a && diff_mean_b<diff_mean_c)
        {
        		return b;
        }
        else
        {
        	return c;
        }
    }
    
    
  }

  public static void main(String[] args) {
    // TODO: add test cases
	  
	  int median_num=median(351,81,785);
	  System.out.println(+median_num);
	  
	  int median_num2=median2(133,9991,745);
	  System.out.println(+median_num2);
  }
}
