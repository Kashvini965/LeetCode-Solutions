// Last updated: 7/14/2026, 2:04:04 PM
class Solution {
    public String largestNumber(int[] nums) {
        String[] str=new String[nums.length];
        for(int i=0;i<nums.length;i++){
            str[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(str,(a,b)->(b+a).compareTo(a+b));
        if(str[0].equals("0")){
            return "0";
        }
        StringBuilder result=new StringBuilder();
        for(int i=0;i<str.length;i++){
            result.append(str[i]);
        }
        return result.toString();
    }
}