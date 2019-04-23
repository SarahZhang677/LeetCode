class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        s = s + ' ';
        char[] convertedArray = s.toCharArray();
        for (int i = 0; i < convertedArray.length; i++){
            //for (int j = i+1; j < i+1;){
                if (convertedArray[i] == 'I'){
                    if (convertedArray[i+1] == 'V'){
                        sum += 4;
                        i++;
                        //System.out.println(sum);
                    } else if (convertedArray[i+1] == 'X'){
                        sum += 9;
                       i++;
                        //System.out.println(sum);
                    } else {
                    sum += 1;
                        
                       //System.out.println(sum);
                    }
                } else if (convertedArray[i] == 'V'){
                    sum += 5;
                } else if (convertedArray[i] == 'X') {
                    if (convertedArray[i+1] == 'L'){
                        sum += 40;
                        i++;
                    } else if (convertedArray[i+1] == 'C'){
                        sum += 90;
                        i++;
                    } else {
                    sum += 10;
                    }
                } else if (convertedArray[i] == 'L'){
                    sum += 50;
                    //System.out.println(sum);
                } else if (convertedArray[i] == 'C'){
                    if (convertedArray[i+1] == 'D'){
                        sum += 400;
                        i++;
                    } else if (convertedArray[i+1] == 'M'){
                        sum += 900;
                        i++;
                    } else {
                    sum += 100;
                    }
                } else if (convertedArray[i] == 'D'){
                    sum += 500;
                } else if (convertedArray[i] == 'M') {
                    sum += 1000;
                }
    
            //} 
        }return sum;
    } 
}
