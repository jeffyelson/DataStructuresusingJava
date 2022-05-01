public class DecimalToDual {

  public static String transformDual(int dec) {
    // TODO: Implement your solution here
	  String binary_str="";
	  String reversed_binary_str="";
	  while(dec>1) {
		  int remainder=dec%2; //remainder when the integer is divided by 2
		  dec=dec/2; //quotient to proceed with conversion to binary
		  String int_to_str=Integer.toString(remainder); //conversion from integer to string
		  binary_str=binary_str+int_to_str;
	  }
	  for(int i=binary_str.length();i>0;i--){ // i is for traversing backwards through each character to reverse the string
		  reversed_binary_str=reversed_binary_str+binary_str.charAt(i-1);
	  }
	  reversed_binary_str="1"+reversed_binary_str;
	 return reversed_binary_str;
  }

  public static void main(String[] args) {
    // TODO: Test your solution with appropriate test cases
	  String binary=transformDual(13);
	  System.out.println(""+binary);
  }
}
