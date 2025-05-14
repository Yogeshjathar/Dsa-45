public class convertCase {

    private static String convertToUpperCase(String str) {
        int i=0;
        StringBuilder sb = new StringBuilder();

        while(i < str.length()){
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch)){
                sb.append(Character.toLowerCase(ch));
            }else{
                sb.append(Character.toUpperCase(ch));
            }
            i++;
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "hELLO bROTHER";
        System.out.println(convertToUpperCase(str));
    }

}