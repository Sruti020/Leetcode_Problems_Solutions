class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> result=new ArrayList<>();
        int n=candies.length;
        int max=Integer.MIN_VALUE;
        for(int c : candies){
            max=Math.max(c, max);
        }
       
        for(int i=0;i<n;i++){
            if(candies[i]+extraCandies >= max)
                result.add(true);
            else
                result.add(false);
        }
        return result;


        
    }
}
