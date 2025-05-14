public class CountOccurance {

    public static void printCountOfChar(String str){
        int freq[] = new int[256];

        // for(int i=0; i<str.length(); i++){
        //     char ch = str.charAt(i);
        //     freq[ch]++;
        // }

        for(char ch: str.toCharArray()){
            freq[ch]++;
        }

        for(int i=0; i<256; i++){
            if(freq[i] > 0){
                char ch = (char)i;
                System.out.println(ch+" = "+freq[i]);
            }
        }

    }
    public static void main(String[] args) {
        String str= "Java Hungry";
        printCountOfChar(str);
    }
}
