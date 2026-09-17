class Solution {
    public boolean isAnagram(String s, String t) {
        char[] words=s.toCharArray();
        char[] words1=t.toCharArray();
        Arrays.sort(words);
        Arrays.sort(words1);
        if(Arrays.equals(words,words1)){
            return true;
        }
        return false;
        
    }
}