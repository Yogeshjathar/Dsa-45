public class Armstrong {


    public static boolean  isArmstrong(int num){
        int originalNum = num;
        int power = String.valueOf(num).length();
        int sum = 0;


        while(num > 0){
            int singleDigit = num % 10;
            sum += Math.pow(singleDigit, power);
            num = num / 10;
        }


        return originalNum == sum;
    }


    public static void main(String[] args) {
        int num = 153;     // 153, 9474
        System.out.println(isArmstrong(num));
    }
}