// import java.util.Scanner;
import java.util.*;


public class input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int myNum = 5;               // Integer (whole number)
        float myFloatNum = 5.99f;    // Floating point number
        char myLetter = 'D';         // Character
        boolean myBool = true;       // Boolean
        String myText = "Hello";     // String


        // int nextInt()	It is used to scan the next token of the input as an integer.
        // float nextFloat()	It is used to scan the next token of the input as a float.
        // double nextDouble()	It is used to scan the next token of the input as a double.
        // byte nextByte()	It is used to scan the next token of the input as a byte.
        // String nextLine()	Advances this scanner past the current line.
        // boolean nextBoolean()	It is used to scan the next token of the input into a boolean value.
        // long nextLong()	It is used to scan the next token of the input as a long.
        // short nextShort()	It is used to scan the next token of the input as a Short.
        // BigInteger nextBigInteger()	It is used to scan the next token of the input as a BigInteger.
        // BigDecimal nextBigDecimal()	It is used to scan the next token of the input as a BigDecimal.


        int x=sc.nextInt();
        sc.nextLine(); //ignore current line.
        String s=sc.nextLine();

        System.out.println(s);

        System.out.print(x*x +" "+ s);
    }
    
}
