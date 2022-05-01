
public class PerfectShuffle {


  public static int[] interleave(int[] a1, int[] a2) {
    // TODO: implementation
	  int[] new_array= new int[2* a1.length];
	  
	  for(int j=0; j<a1.length ; j++ )
	  {
	      
	          new_array[2*j]=a1[j];
		      new_array[(2*j)+1]=a2[j];
	      
	     
	  }
	  return new_array;
  }

  public static int[] perfectShuffle(int[] a) {
    // TODO: implementation
	  int[] output_array = new int[a.length];
	  if(a.length%2==0)
	  {
		  int[] split_array1 = new int[a.length/2];
		  int[] split_array2 = new int[a.length/2];
		  for (int i=0; i<a.length ;  i++)
		  {
			  if(i<a.length/2)
			  {
				  split_array1[i]=a[i];
			  }
			  else
			  {
				  split_array2[i-split_array2.length]=a[i];
			  }
			 
		  }
		  output_array=interleave(split_array1,split_array2);
		}
	  else
	  {
		  output_array=a;
	  }
	  return output_array;
  }

  public static int shuffleNumber(int n) {
    // TODO: implementation
    int power ;
    int modulo= n-1;
    int k=1;
    int output=0;
    if(n>0 && n%2==0)
    {
       while(output!=1)
    {
        power = (int)Math.pow(2,k);
        output = power%modulo;
        k++;
    } 
    }
    else
    {
        return -1;
    }
    
    return (k-1);
    
  }

  public static void main(String[] args) {
    // TODO: implementation
    int[] output_array1 = new int[12];
    int b[] = {1,2,3,4,5,6,7,8,9,10,11,12};
    output_array1=perfectShuffle(b);
    int shuffle=shuffleNumber(52);
    System.out.println(shuffle);
    for (int z = 0; z < output_array1.length; z++) {  
            System.out.print(output_array1[z] + " ");  
        }  
  }
}
