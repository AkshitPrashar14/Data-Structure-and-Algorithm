class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack=new Stack<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        int result[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            while(!stack.isEmpty() && nums[stack.peek()]<nums[i]){
                map.put(stack.peek(),nums[i]);
                stack.pop();
            }
            stack.push(i);
        }
        for(int i=0;i<nums.length;i++){
            while(!stack.isEmpty() && nums[stack.peek()]<nums[i]){
                map.put(stack.peek(),nums[i]);
                stack.pop();
            }
        }
        for(int i=0;i<nums.length;i++){
            while(!stack.isEmpty()){
                map.put(stack.peek(),-1);
                stack.pop();
            }
        }
        for(int i=0;i<nums.length;i++){
            result[i]=map.get(i);
        }
        return result;
    }
}
