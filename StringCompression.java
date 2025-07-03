public class StringCompression {
    public static int compress(char[] chars) {
        int n = chars.length;
        int idx = 0;    // Track index to store element in char array

        // Iterate
        for(int i=0; i<n; i++){

            char ch = chars[i]; //curr char
            int count = 0;  // curr frequency

            // get Count of char
            while(i < n && chars[i]==ch){
                count++;
                i++;
            }

            // put back in char arr
            // if count==1 then add char
            if(count == 1){
                chars[idx++] = ch;
            }else{
                // else add char with frequency
                chars[idx++] = ch;
                String str = String.valueOf(count);
                for(char c : str.toCharArray()){
                    chars[idx++] = c;
                }
            }
            i--;    // take one step back
        }

        return idx;
    }

    public static void main(String[] args) {
        char chars[] = {'a','a','b','b','c','c','c'};
        System.out.println(compress(chars));
    }
}
