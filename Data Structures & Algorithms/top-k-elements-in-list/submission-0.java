class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
       
        
        for (int i=0 ; i<nums.length; i++) {
        	
        	if (!hm.containsKey(nums[i])) {
        		hm.put(nums[i],1);
        	} 
        	else {
        		hm.put(nums[i], hm.get(nums[i]) + 1);
        	}
        }
        int n[]=new int[hm.size()];
        int count=0;
        for (int key : hm.keySet()) {
        	n[count++]=key;
        }
        for (int i=0; i < n.length;i++) {
            for (int j=i+1;j<n.length; j++) {
                if (hm.get(n[i]) < hm.get(n[j])) {
                    int temp = n[i];
                    n[i]=n[j];
                    n[j]=temp;
                }
            }
        }
        int [] arr=new int[k];
        for (int i=0; i<k; i++) {
        	arr[i]=n[i];
        }
        return arr;
    }
}
