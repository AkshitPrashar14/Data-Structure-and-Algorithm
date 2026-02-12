class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        getPermutations(nums,result,0);
        return result;
    }
    void getPermutations(int[] nums,List<List<Integer>> result,int idx){
        if(idx==nums.length){
            List<Integer> temp=new ArrayList<>();
            for(int i:nums)temp.add(i);
            for(List<Integer> list:result){
                if(list.equals(temp)){
                    return;
                }
            }
            result.add(temp);
        }
        for(int i=idx;i<nums.length;i++){
            swap(nums,i,idx);
            getPermutations(nums,result,idx+1);
            swap(nums,i,idx);
        }
    }
    void swap(int[] nums,int i,int idx){
        int temp=nums[i];
        nums[i]=nums[idx];
        nums[idx]=temp;
    }
}
