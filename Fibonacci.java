public class Fibonacci {

    public static void getFibonacciSeries(int num){
        // Time complexity = O(n)
        // Space complexity = O(1)
        int first = 0;
        int second = 1;

        for(int i=0; i<num; i++){
            if(i == 0){
                System.out.print(0+", ");
            }else if(i == 1){
                System.out.print(1+", ");
            }else{
                int nextNum = first + second;
                // System.out.print(nextNum+", ");
                System.out.print(nextNum + (i < num-1 ? " ,": " "));
                first = second;
                second = nextNum;
            }
        }
        System.out.println();
    }

    public static int  fibonacci_Series(int n){
        // Time complexity = O(2^n)  // exponential Time complexity 
        // Space complexity = O(n)  // Dur to ecursion depth of each function call
        if(n<=1){
            return  n;
        }
        return fibonacci_Series(n-2) + fibonacci_Series(n-1);
    }
    public static void main(String[] args) {
        int num = 10;
        getFibonacciSeries(num);
        System.out.println("Number at "+num+" location is "+fibonacci_Series(num));
    }
}