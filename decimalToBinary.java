/*
Conversion of a decimal number to a binary using recursion.
The script could be executed at an online compiler.

https://www.tutorialspoint.com/compile_java_online.php
*/

public class HelloWorld{

     public static void main(String []args){
        //System.out.println("Hello World");
        decimalToBinary(43);
     }
     
	public static void decimalToBinary(int iDecimal) {
		
		if(iDecimal < 2)
			System.out.print(iDecimal);
		else
		{
			decimalToBinary(iDecimal/2);
			System.out.print(iDecimal%2);
		}
		
	}     
}
