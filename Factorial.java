public class Factorial {

    public static int getFactorial(int n){
        int fac = 1, i=1;
        while(i <= n){
            fac = fac*i;
            i++;
        }
        return fac;
    }
    public static void main(String[] args) {
        int num = 10;
       System.out.println(getFactorial(num));
    }
}