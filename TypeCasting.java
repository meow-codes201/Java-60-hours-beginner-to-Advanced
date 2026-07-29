public class TypeCasting{
    public static void main(String[] args){
        // Typecasting
        byte b = 100;
        int a = 20;
        b = (byte) a;
        // System.out.println(b);
        
        // IMPLICIT typecasting
        int x = 100;
        float f = x; //no error
        // System.out.println(f);

        //  error: incompatible types: possible lossy conversion from float to int
        float pi = 3.14159f;
        // int x = pi; ERROR!
        // System.our.ptinltn(x); 
        // EXPLICIT typecasting
        int y = (int) pi;
        // System.out.println(y); outputs 3, the decimal part .14159 is removed!

        // TYPE PROMOTION
        byte a1 = 10;
        byte b1= 50;
        // byte c1 = a1*b1; incompatible types: possible lossy conversion from int to by

        int d1 = a1*b1;
        // System.out.println(c1);
        System.out.println(d1);
        


        

    }
}