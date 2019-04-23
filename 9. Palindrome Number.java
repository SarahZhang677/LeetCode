class Solution {
    public boolean isPalindrome(int x) {
        int pal = x; // have to do this cause you have divided it in line 11. Wont be the same as original num x.
        int reversed = 0;
        if (pal < 0){
            return false;
        }
        while (pal != 0){
            int dig = pal % 10;
            reversed = reversed * 10 + dig;
            pal /= 10;
        } 
        return x == reversed;
    }
}
