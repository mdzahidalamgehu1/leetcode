class Solution {
    public int[] getConcatenation(int[] nums) {
        int array[] = new int [2*nums.length];
        int j=0;
        for(int i=0; i<array.length;i++){
            array[i]=nums[j];
            if(j==nums.length-1){
                j=0;
            }
            else{
                j++;
            }
            
        }
        return array;
    }
}