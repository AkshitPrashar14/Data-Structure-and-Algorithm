class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(piles[i]>max){
                max=piles[i];
            }
        }
        int result=totalHours(piles,1,max,h);
        return result;
    }
    int totalHours(int[] piles,int low,int high,int h){
        int ans=0;
        while(low<=high){
        int mid=(low+high)/2;
        if(canFinish(piles,mid,h)){
            ans=mid;
            high=mid-1;
        }else{
            low=mid+1;
        }
        }
        return ans;
    }
    boolean canFinish(int[] piles,int speed,int h){
        long hours=0;
        for(int p:piles){
            hours+=(p+speed-1)/speed;
            if(hours>h)return false;
        }
        return true;
    }
}
