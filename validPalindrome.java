class Solution {
    public boolean isPalindrome(String s) {
        int len = s.length();
        if(len == 0) return true;
        int left = 0; int right = len - 1;
        while(left < len && right >= 0){
            while(left < len - 1 && !Character.isLetterOrDigit(s.charAt(left))){
                left = left + 1;
            }
            while(right > -1 && !Character.isLetterOrDigit(s.charAt(right))){
                right = right - 1;
            }
            // System.out.println(left + ":: " + right);
            if(left < len && right >= 0){
                if(Character.toLowerCase(s.charAt(left)) == Character.toLowerCase(s.charAt(right))){
                    left = left + 1;
                    right = right - 1;
                } else {
                    // System.out.println(left + ": " + right);
                    // System.out.println(left + ": " + Character.toLowerCase(s.charAt(left)) + ", "+right+":" + Character.toLowerCase(s.charAt(right)));
                    // System.out.println(", len: "+ len + " ," + (Character.toLowerCase(s.charAt(left)) == Character.toLowerCase(s.charAt(right))) );
                    return false;
                }
            } else {
                // System.out.println(left + ": " + right);
                return true;
            }
        }
        return true;
    }
}
