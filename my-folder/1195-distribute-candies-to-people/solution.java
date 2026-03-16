class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int []result=new int [num_people];
        int i=0;
        int give=1;
        while(candies>0){
            int index=i%num_people;
            int current=Math.min(give,candies);
            result[index]+=current;
            candies-=current;
            give++;
            i++;
        }
        return result;
    }
}
