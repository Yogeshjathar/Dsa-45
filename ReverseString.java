public class ReverseString{

    public static String getReverseString(String str){
        StringBuilder revereseStr = new StringBuilder();
        for(int i=str.length()-1; i>=0; i--){
            revereseStr.append(str.charAt(i));
        }

        return revereseStr.toString();
    }
    public static void main(String args[]){
        String str = "Provatosoft";
        System.out.println(getReverseString(str));
    }
}