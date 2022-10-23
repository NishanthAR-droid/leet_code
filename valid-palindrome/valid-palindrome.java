class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)>=48 && s.charAt(i)<=57 || s.charAt(i)>=97 && s.charAt(i)<=122){
                str.append(s.charAt(i));
            }
        }
        return isPalin(str);
    }
    
     static boolean isPalin(StringBuilder str){
        int start=0;
        int end=str.length()-1;
        while (start<end){
            if (str.charAt(start)!=str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}