class Solution {
    public String addBinary(String a, String b) {
        int refa = a.length() - 1;
        int refb = b.length() - 1;
        String res = "";String temp = "";boolean carry = false;
        while(refa >= 0 || refb >= 0 ){
            if(refa < 0){
                for(int i = 0; i < refb; i++){
                    b = "0" + b;
                }
                refa = refb;
                // return b.substring(0, refb + 1) + res;
            }
            if(refb < 0){
                for(int i = 0; i < refa; i++){
                    a = "0" + a;
                }
                refb = refa;
                // return a.substring(0, refa + 1) + res;
            }
            if(a.charAt(refa) == '0' && b.charAt(refb) == '0'){
                temp = "0";
                if(carry) temp = "1";
                carry = false;
            } else if(a.charAt(refa) == '0' && b.charAt(refb) == '1' || a.charAt(refa) == '1' && b.charAt(refb) == '0'){
                temp = "1";
                if(carry){
                    temp = "0";
                    carry = true;
                } else {
                    carry = false;
                }
            } else if(a.charAt(refa) == '1' && b.charAt(refb) == '1'){
                temp = "0";
                if(carry) temp = "1";
                carry = true;
            }
            res = temp + res;
            refa = refa - 1;
            refb = refb - 1;
        }
        if(carry) res = "1" + res;
        return res;
    }
}
