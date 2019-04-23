class Solution {
    public int reverse(int x) {
        long reversed = 0; // use long to monitor overflow // they tested num that cant fit in int so use long
        while (x != 0){
            int dig = x % 10;
            //if (dig % 2 != 0){
                reversed = reversed * 10 + dig;
            //}
            x /= 10;
            
        }
        if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) //method in the int class. it represents the range
        {
        return 0;
    } else {
        return (int) reversed; // type cast
    }
    }
}
