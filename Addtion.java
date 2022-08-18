package Week1.Day2;

public class Addtion {
    public static void main(String[] args) {

        short num1 = 10;
        short num2 = 12;
        //short num3 = num1 + num2;  // Error
        // java: incompatible types: possible lossy conversion from int to short

        int num4 = 10;
        int num5 = 12;
        int num6 = num4 + num5; // Successfull Execution

        byte num7 = 10;
        byte num8 = 12;
        //byte num9 = num7 + num8;  // Error
        // java: incompatible types: possible lossy conversion from int to byte

        long num10 = 10;
        long num11 = 12;
        long num12 = num10 + num11; // Successfull execution.

        float f1 = 10.00f;
        float f2 = 12.00f;
        float f3 = f1 + f2;    // Successfull execution

        double d1 = 10.00;
        double d2 = 12.00;
        double d3 = d1 + d2;     // Sucessfull execution


    }
}
