public class RandomIntArray {

 public static int[] createRandom(int n) {
    // TODO: implementation
	  int[] newarray = new int[n];
	  int random_number=0;
	  for(int i=0;i<n;i++) //i for traversing the position of the array
	  {
		  random_number=(int)(94*Math.random() + 5);
		  newarray[i]=random_number ;
		  
	  }
	  return newarray;
  }

  public static String toString(int[] a) {
    // TODO: implementation  
	  int array_length = a.length;
	  String empty_string="";
	  int j; //for traversing through through the array
	  for (j=0;j<array_length;j++)
	  {
		  String string_convert= Integer.toString(a[j]);
		  empty_string=empty_string+string_convert;
	  }
	  return empty_string;
  }

  public static int posMin(int[] a) {
    // TODO: implementation
    int minimum = a[0];
    int position = 0;
    int i=0; // for traversing through the array
    
    while(i<a.length)
    {
        if(a[i]<=minimum)
        {
            minimum=a[i];
            position = i;
        }
        i++;
    }
    
   return position; 
  }

 public static void swap(int[] a) {
    // TODO: implementation
    int first=a[0];
    int last=a[a.length-1];
    a[0]=last; //swapping last value to the zeroth index
    a[a.length-1]=first; // swapping first value to the last index
    for(int i=0; i<a.length ; i++)
    {
       System.out.print(a[i]); 
    }
  }


 public static void main(String[] args) {
    // TODO: include tests here
    int[] random_out = {8,71,3,4,5,2,7,60,4,10};
    String string_out=toString(random_out);
    System.out.println(string_out);
    int post = posMin(random_out);
    System.out.println(post);
    System.out.println();
    swap(random_out); 
    int[] random = new int[10];
    random = createRandom(10);
    for(int i=0;i<10;i++)
    {
        System.out.println(random[i]);
    }
    

 }
}
