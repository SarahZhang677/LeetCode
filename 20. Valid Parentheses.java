class Solution {
    public boolean isValid(String s) {
        char[] charA = s.toCharArray(); // change string to char array
        if (s.length() == 0){ // empty string is vaild
            return true;
        }else if (s.length() == 1) { // not closed so not vaild
            return false;
        } else if (s.length()%2 != 0){ // odd numbers wont be valid because means not closed
            return false;
        }
        else if (charA[charA.length-1] == '(' ||charA[charA.length-1] == '['||charA[charA.length-1] == '{'){
            return false; //strings ending in (, { or [ are not vaild because its not closed.
        }else {
            Stack<Character> stack = new Stack<>(); // create a char stack
            
            for (int i = 0; i < s.length(); i++) {
                char current = s.charAt(i); //current character of index i of the string
                if (current == '(' || current == '[' || current == '{') {
                    stack.push(current); // pushes element on stack
                    
                } else {
                    if(stack.isEmpty()) { // checks if stack is empty, if it is return false. e.g if started with }, ]or)
                          return false;
                    }
                    char peekChar = stack.peek(); //returns element on top but doesnt remove it
                    if ((current == ')' && peekChar != '(')
                            || (current == '}' && peekChar != '{')
                            || (current == ']' && peekChar != '[')) {
                        return false;  // for a valid input, a close brackets must have an open brackets
                    } else {
                        stack.pop(); // removes and returns top element. 
                        
                    }
                }
            }
            return true; 
        }
                    
                     
            }
        } 
       
