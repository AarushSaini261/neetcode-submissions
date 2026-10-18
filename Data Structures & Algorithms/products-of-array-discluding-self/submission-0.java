class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] prod=new int[nums.length];
        int left=1;
        int right=1;
        prod[0]=left;
        for (int i=1 ; i < nums.length ; i++) {
        	left=left*nums[i-1];
        	prod[i]=left;
        		
        }
        for (int i=nums.length-1; i>=0 ; i --) {
        	prod[i]=prod[i]*right;
        	right=right*nums[i];
        }
        return prod;
    }
}