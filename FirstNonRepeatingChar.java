public class FirstNonRepeatingChar {
    public static char getFirstNonRepeatingChar(String str){
        int freq[] = new int[26];
        for(char ch : str.toCharArray()){
            freq[ch - 'a']++;
        }

        for(char ch : str.toCharArray()){
            if(freq[ch - 'a'] == 1){
                return ch;
            }
        }
        return '\0';
    }
    public static void main(String[] args) {
        String str= "oop";
        System.out.println(getFirstNonRepeatingChar(str));
    }
}
