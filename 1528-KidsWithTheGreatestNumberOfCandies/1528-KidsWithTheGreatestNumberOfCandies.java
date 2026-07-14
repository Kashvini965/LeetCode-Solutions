// Last updated: 7/14/2026, 2:02:57 PM
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extracandies) {
        List<Boolean> li=new LinkedList();
        int max=0;
        for(int i:candies){
            if(i>max) max=i;
        }
        for(int i:candies){
          if(i+extracandies>=max) li.add(true);
          else li.add(false);
        }
        return li;
    }
}