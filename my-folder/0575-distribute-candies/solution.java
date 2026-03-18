class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> set=new HashSet<>();
        for(int candy:candyType){
            set.add(candy);
        }
        int Uniquetype=set.size();
        int allowed=candyType.length/2;
        return Math.min(Uniquetype,allowed);
    }
}
