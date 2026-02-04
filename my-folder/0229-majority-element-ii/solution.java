class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list=new ArrayList<>();
        int n=nums.length;
        int num=nums[0];
        int count=1;
        int a=n/3;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                count++;
            }else{
                if(count>a)list.add(nums[i-1]);
                num=nums[i];
                count=1;
            }
        }
        if(count>a)list.add(nums[n-1]);
        return list;
    }
}
