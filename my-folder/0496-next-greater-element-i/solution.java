class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        Stack<Integer> stack=new Stack<>();
        int[] nums3=new int[nums1.length];
        for(int i=0;i<nums2.length;i++){
            while(!stack.isEmpty() && stack.peek()<nums2[i]){
                map.put(stack.peek(),nums2[i]);
                stack.pop();
            }
            stack.push(nums2[i]);
        }
        while(!stack.isEmpty()){
                map.put(stack.peek(),-1);
                stack.pop();
            }
        for(int i=0;i<nums1.length;i++){
            nums3[i]=map.get(nums1[i]);
        }
        return nums3;
    }
}
