class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandy = 0; 
        
      
        for (int candy : candies) {
            if (candy > maxCandy) {
                maxCandy = candy;
            }
        }

       
        List<Boolean> result = new ArrayList<>();
       
        for (int c : candies) {
            result.add(c + extraCandies >= maxCandy);
        }

        return result;
    }
}