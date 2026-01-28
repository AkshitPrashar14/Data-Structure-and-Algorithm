class Solution {
    public int[] searchRange(int[] nums, int target) {
        int arr[]=new int[2];
        int fOcc=firstOcc(nums,target);
        int lOcc=lastOcc(nums,target);
        arr[0]=fOcc;
        arr[1]=lOcc;
    
        return arr;
    }
    public int firstOcc(int[] arr,int k){
        int l=0;
        int r=arr.length-1;
        int ans=-1;
        while(l<=r){
            int m=(l+r)/2;
            if(arr[m]==k){
                ans=m;
                r=m-1;
            }else if(arr[m]>k){r=m-1;}
            else {l=m+1;}
        }
        return ans;
    }
    public int lastOcc(int[] arr,int k){
        int l=0;
        int r=arr.length-1;
        int ans=-1;
        while(l<=r){
            int m=(l+r)/2;
            if(arr[m]==k){
                ans=m;
                l=m+1;
            }else if(arr[m]>k)r=m-1;
            else l=m+1;
        }
        return ans;
    }
}

