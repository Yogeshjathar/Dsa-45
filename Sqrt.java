public class Sqrt {

    public static double getSqrt(double  num){

        double sqrtOfNum= Math.sqrt(num);
        return  sqrtOfNum;
    }
    public static void main(String[] args) {
        double num = 121;
        System.out.println(getSqrt(num));
    }
}