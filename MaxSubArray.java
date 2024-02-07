public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int ms=Integer.MIN_VALUE;
        int cs=0;
        for (int i=0;i<nums.length;i++)
        {
            cs = cs+nums[i];
            if (cs<nums[i])
            cs=nums[i];
            if (ms<cs)
            ms=cs;
            ms=Math.max(cs,ms);
        }
        
        return ms;
}
