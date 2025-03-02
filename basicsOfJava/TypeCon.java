package basicsOfJava;


public class TypeCon {
// imnplicit converion
    public static void main(String[] args) {
        int a = 5;
        a = 'A';
        // char A is samller then int its change in asci value 
        System.out.println(a);
        
        byte b = 12;
        // b= 128
        // rhs side is bigger in range as  a int 
        b= 127;
        System.out.println(b);


        double c ;
        c = 25;
        System.out.println(c);

        // int d ;
        // java compiler will  ot acccept becaise
        // double is greater then int 
        // d = 1.45;
        // System.out.println(d);
        long d;
        d = 'C';
        System.out.println(d);


        // expicit conversion or type conversion
        int e ;
        e = (int)1.7;
        System.out.println(e);

        byte f ;
        f = (byte)11.565;
        System.out.println(f);
        
    }
}
