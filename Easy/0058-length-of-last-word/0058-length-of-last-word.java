class Solution {
    public int lengthOfLastWord(String s) {
        String[] word=s.split(" ");
        int count=0;
        String a=word[word.length-1];
        for(int i=0;i<a.length();i++){
            count++;
        }
  
    return count;
        
    }
}