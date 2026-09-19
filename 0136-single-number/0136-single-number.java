class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> seen=new HashSet<>();
        HashSet<Integer> dublicate=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!seen.add(nums[i])){
                dublicate.add(nums[i]);
            }
        }
        for(int i=0;i<nums.length;i++){
            if(!dublicate.contains(nums[i])){
                return nums[i];
            }
        }
        return -1;
        
    }
}