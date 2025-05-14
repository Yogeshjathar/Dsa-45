public class DuplicateChar {
    public static void main(String[] args) {
        String str= "successfully";
        int[] freq = new int[26];

        for(char ch : str.toCharArray()){
            freq[ch - 'a']++;
        }

        System.out.println("DuplicateChar in string : ");
        for(int i=0; i<26; i++){
            char ch = (char) (i+'a');
            if(freq[i] > 1){
                System.out.println(ch + " : "+freq[i]);
            }
        }
    }
}
