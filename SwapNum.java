public class SwapNum {

    public static void swapUsing_Variables(int a, int b){
        // Swapping 
        int tmp = a;
        a= b;
        b= tmp;
        System.out.println("a : "+a+"   b:"+b);

    }

    public static void swapUsing_AriOpeartor(int a, int b){
        a= a+b;
        b= a-b;
        a= a-b;

        System.out.println("a : "+a+"   b:"+b);
    }

    public static void swapUsing_BitWiseOpeartor(int a, int b){
        // XOR bit wise operator
        // for same value result is same wlse it is 1
        a= a^b;
        b= a^b;
        a= a^b;

        System.out.println("a : "+a+"   b:"+b);
    }

    public static void main(String[] args) {
        int a=10;
        int b=15;

        System.out.println("Before Swapping");
        System.out.println("a : "+a+"   b:"+b);
        System.out.println();

        System.out.println("After Swapping");
        System.out.println("Swap Using Variables");
        swapUsing_Variables(a, b);
        System.out.println();

        System.out.println("Swap Using Arithmetic Operator");
        swapUsing_AriOpeartor(a,b);
        System.out.println();

        System.out.println("Swap Using XOR Bitwise Variables");
        swapUsing_BitWiseOpeartor(a,b);
        System.out.println();
    }
}
