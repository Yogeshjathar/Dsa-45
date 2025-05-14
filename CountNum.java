public class CountNum {

    public static int getCount(String str){
        // Time complexity - O(n)
        // Space complexity - O(1)
        if(str == null || str.isEmpty()){
            return 0;
        }
        int count=0;
        str+=' ';

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == ' '){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String str = "hello brother";
        System.out.println(getCount(str));
    }
}