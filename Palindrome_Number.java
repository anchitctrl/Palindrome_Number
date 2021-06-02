class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        String s=String.valueOf(x);
        int l=s.length();
        for(int i=0;i<l;i++){
            if(s.charAt(i)!=s.charAt(l-1-i)){
                return false;
            }
        }
        return true;    
    }
}
