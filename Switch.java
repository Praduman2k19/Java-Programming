import java.util.Scanner;

public class Switch {

   public static void main(String[] str) {
       
    Scanner sc=new Scanner(System.in);
    
    int n=sc.nextInt();

    switch(n)
    {
        case 1 : 
        System.out.println("One");
        break;
        case 2:
        System.out.println("Two");
        break;
        case 3:
        System.out.println("Three");
        break;
        default:
        System.out.println(n);
    }

   }
    
}
