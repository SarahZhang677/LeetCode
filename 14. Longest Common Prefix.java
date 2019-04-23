class Solution {
    public String longestCommonPrefix(String[] strs) {
    if(strs.length == 0){ // check if theres anything in the array
        return "";
    }   
     
    
    for (int i = 0; i < strs[0].length(); i++) { //loops through the length of the first word
        char character = strs[0].charAt(i); //gets a character of first word. Ends up going through all characters of first                                               word due to for loop 
        for (int j = 1; j < strs.length; j++) { // loops through rest of words in array
            if ( i >= strs[j].length() || strs[j].charAt(i) != character ) { //check if i (the first word) is greater or                                                                                    equal to the word j length OR check if the                                                                                  character in word "j" at indicies i (to check                                                                                same indicies as first word) is different to                                                                                what the character variable is holding. 
                
                return strs[j].substring(0, i); //returns word j's substring, where it is a new strng that returns substring                                                   of a string. returns the starting indiex and end index. returns "" is no                                                     common prefix (0, 0). substring doesnt include end index.
            }
        }
    }
    return strs[0]; // returns one letters arrays
}
}
