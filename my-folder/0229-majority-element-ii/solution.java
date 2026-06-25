import java.util.*;
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int count1=0;
        int count2=0;
        int ele1=-1;
        int ele2=-1;
        int c1=0;
        int c2=0;
        int len=nums.length;
        int deslen=len/3;
        List<Integer> result=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int ele=nums[i];
            if(ele1==ele){
                count1++;
            }else if(ele2==ele){
                count2++;
            }else if(count1==0){
                ele1=ele;
                count1=1;
            }else if(count2==0){
                ele2=ele;
                count2=1;
            }else{
                count1--;
                count2--;
            }
        }
        for(int num:nums){
            if(num==ele1){
                c1++;
            }else if(num==ele2){
                c2++;
            }
        }
        if(c1>deslen)result.add(ele1);
        if(c2>deslen)result.add(ele2);
        return result;
    }
}
