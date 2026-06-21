public class helloWorld
{
    public static void main(String[] args)
    {
        System.out.println("hello world!");
        String name = "meow codes";
        System.out.println("Hello,"+name);
        System.out.println(10+90);
        int age = 19;
        if(age>18){
            System.out.println("Coding!");

        }
        else{
            System.out.println("watching cartoons");
        }

        int x = 10;
        int y = 90;
        System.out.println(x+y);
        System.out.println(y-x);
        System.out.println(x*y);
        System.out.println(y/x);

// data types - primitive & non - primitive 
// primitive - byte,short, int, long ; float, double; char; boolean

byte b = 120; // 1 byte
short s = 258; // 2 bytes
int i = 255; // 4 bytes
long l = 1080l; //end with L, 8 bytes
float f= 3.14F; //end with f, 4 bytes
double d = 3.1459; //8 bytes - default for floating point numbers
char c = '$'; //2 bytes, unicode
boolean bi = true; //

int bin = 0b1000;
int hex = 0xFF;
double big = 13E9;
System.out.println(b+" "+s+" "+i+" "+l+" "+f+" "+d+" "+c+" "+bi+" "+bin+" "+hex+" "+big);
//char 
char ch = 'a';
ch++;
System.out.println(ch);



    }
}