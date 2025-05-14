public class WhiteSpace {

    public static String removeWhiteSpace(String str){
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(!Character.isWhitespace(ch)){
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static String removeWhiteSpace_BruteForce(String str){
        return str.replace(" ", "");
    }

    public static void main(String[] args) {
        String str = "How Are You Brother";

        System.out.println("Using replace : ");
        System.out.println(removeWhiteSpace_BruteForce(str));

        System.out.println("\nWithout Using replace : ");
        System.out.println(removeWhiteSpace(str));
    }  
}