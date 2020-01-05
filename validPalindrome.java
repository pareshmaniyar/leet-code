class Solution {
    public boolean isPalindrome(String s) {
        int len = s.length();
        if(len == 0) return true;
        int left = 0; int right = len - 1;
        while(left != right){
            while(left < len - 2 && !Character.isLetter(s.charAt(left))){
                left = left + 1;
            }
            while(right > 0 && !Character.isLetter(s.charAt(right))){
                right = right - 1;
            }
            System.out.println(left + ": 1");
            if(left < len && right >= 0 && Character.toLowerCase(s.charAt(left)) == Character.toLowerCase(s.charAt(right))){
                left = left + 1;
                right = right - 1;
            } else {
                System.out.println(left + ": ");
                System.out.println(left + ": " + Character.toLowerCase(s.charAt(left)) + ", "+right+":" + Character.toLowerCase(s.charAt(right)));
                System.out.println(", len: "+ len + " ," + (Character.toLowerCase(s.charAt(left)) == Character.toLowerCase(s.charAt(right))) );
                return false;
            }
        }
        return true;
        
    }
}