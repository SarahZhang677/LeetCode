class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 0;
        for (int i = 1; i < nums.length; i++){
            if (nums[i] != nums[count]){
                count++;
                nums[count] = nums[i];
            }
           
            
        }return count + 1;
    }
}
/*
Here you are shuffling the array along and setting that index to another index.
e.g [1,1,2]
i j
1,1,2
i   j
1,1,2
  i j
1,2  

*/
