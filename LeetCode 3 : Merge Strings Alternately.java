class Solution {
    public static String mergeAlternately(String word1, String word2) {
        String result = "";
        int m = word1.length();
        int n = word2.length();
        int maxLength = Math.max(m, n);
        for(int i = 0; i<maxLength ; i++)
        {
            if(i<m){
                result += word1.charAt(i);
            }
            if(i<n){
                result += word2.charAt(i);
            }
        }
        return result;
    }
    public static void main(String[] args){
        System.out.println(mergeAlternately("abc" , "pqr"));
    }
}
