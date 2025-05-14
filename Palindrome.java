public class Palindrome {

    public static boolean isPalindrome_Word(String str){

        for(int i=0; i<str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-i-1)){
                return false;
            }
        }
        return  true;
    }

    public static boolean isPalindrome(String str){

        StringBuilder sb = new StringBuilder(str.replaceAll("[a-z][A-Z][0-9]",""));

        for(int i=0; i<sb.length()/2; i++){
            if(sb.charAt(i) != sb.charAt(sb.length()-i-1)){
                return false;
            }
        }
        return  true;
    }
    public static void main(String[] args) {
        String str1 = "oppo";
        String str2 = "hey1 1yeh";
        System.out.println(isPalindrome_Word(str1));
        System.out.println(isPalindrome(str2));
    }
}
