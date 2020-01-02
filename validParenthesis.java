class Solution {
    public boolean isValid(String s) {
        // Stack
        /**
            Data type:
            1. Array with half the elements
            2. Linked List
        */
        // Array
        int len = s.length();
        int pos = 0;
        char[] stack = new char[len/2];
        for(int i = 0; i < len; i++){
            if(pos >= len){
                return false;
            }
            if(pos > 0 && compare(stack[pos - 1], s.charAt(i)) ){
                stack[pos - 1] = '\u0000';
                pos = pos - 1;
            } else {
                System.out.println("pos: " + pos + ", stack: " + Arrays.toString(stack));
                try{
                    stack[pos] = s.charAt(i);
                    pos = pos + 1;
                }catch(Exception e){
                    return false;
                }
            }
        }
        if(stack.length > 0 && stack[0] != '\u0000'){
            return false;
        }
        return true;
    }
    boolean compare(char a, char b){
        switch(a){
            case '(': return b == ')';
            case '{': return b == '}';
            case '[': return b == ']';
            default:  return false;
        }
    }
}
