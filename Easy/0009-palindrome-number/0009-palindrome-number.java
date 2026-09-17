class Solution {
    public boolean isPalindrome(int x) {
        String s1=String.valueOf(x);
        StringBuilder s=new StringBuilder(s1);
        String rev=s.reverse().toString();
        if(s1.equals(rev)){
            return true;
        }
        return false;
    }
}