class Solution {
    public int reverse(int x) {
        String result = "";
        int dividend = x;
        boolean positive = true;
        int remainder = 0;
        //negative check
        if(x < 0){
            positive = false;
            dividend = -dividend;
        }
        while(dividend != 0){
            remainder = dividend % 10;
            result = result + remainder;
            dividend = dividend / 10;
        }
        if(result == ""){
            return positive?0:-0;
        }

        //Zero check
        while(result.charAt(0) == '0'){
            result = result.substring(1);
        }
        //size check
        long longResult = Long.parseLong(result);
        if(!positive){
            longResult = -longResult;
        }
        if(longResult > Math.pow(2, 31) - 1 || longResult < - Math.pow(2, 31)){
            return 0;
        }
        int intResult = (int)longResult;
        return intResult;
    }
}