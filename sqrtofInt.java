class Solution {
    public int mySqrt(int x) {
        if(x == 0) return 0;
        int res = x/2;int left = 0; int right = x;
        if(res == 0) return 1;
        while(res * res > x || res > 65536){
            res = res / 2;
            System.out.println("res1: " + res + ", res * res:" + res * res);
        }
        while(res * res < x){
            res = res + 1;
            System.out.println("res2: " + res + ", res * res:" + res * res);
        }
        return res - 1;
    }
}
