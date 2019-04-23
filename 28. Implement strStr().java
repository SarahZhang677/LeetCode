class Solution {
    public int strStr(String haystack, String needle) {
        if (haystack.length() < needle.length()){
            return -1;
        } else if (needle == "" || haystack.length() == 1 && needle.length() == 1) {
            return 0;
        } else if (haystack.contains(needle)){
            int need = haystack.indexOf(needle); 
            return need;
        } else {
            return -1;
        }
        
    }
}
