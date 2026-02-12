class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        getPermutations(nums,result,0);
        return result;
    }
    void getPermutations(int[] nums,List<List<Integer>> result,int idx){
        
        if(idx==nums.length){
            List<Integer> temp=new ArrayList<>();
            for(int i:nums)temp.add(i);
            result.add(temp);
            return;
        }
        for(int i=idx;i<nums.length;i++){
            swap(nums,i,idx);
            getPermutations(nums,result,idx+1);
            swap(nums,i,idx);
        }
    }
    void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
