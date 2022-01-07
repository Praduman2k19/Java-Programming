import java.util.Scanner;

public class IfElse {
    public static void main(String[] arr) {
        Scanner sc=new Scanner(System.in);

        int num=sc.nextInt();

        if(num>100)
        System.out.println("Over Smart");
        else if(num>80)
        System.out.println("Smart");
        else if(num>50)
        System.out.println("Normal");
        else
        System.out.println("Low");
    }
}
