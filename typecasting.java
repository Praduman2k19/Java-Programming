public class typecasting {
    public static void main(String[] args) {
        
        // Widening Casting (automatically) - converting a smaller type to a larger type size
        // byte -> short -> char -> int -> long -> float -> double

        // Narrowing Casting (manually) - converting a larger type to a smaller size type
        // double -> float -> long -> int -> char -> short -> byte

        int a=5;
        double b=(double)a;
        System.out.println(a);
        System.out.println(b);

        double c=5.6;
        int d=(int) c;
        System.out.println(c);
        System.out.println(d);
    }
    
}
