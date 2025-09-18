public class FindString {
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";
        int n = haystack.length();
        int m = needle.length();

        for(int i=0; i<=n-m; i++){
            if(haystack.substring(i,i+m).equals(needle)){
                System.out.println(i);
            }
        }
    }
}
