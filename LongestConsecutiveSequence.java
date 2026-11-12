import java.util.Arrays;
import java.util.Scanner;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)
        return 0;
        Arrays.sort(nums);
        int max=0;
        int count=1;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i+1]==nums[i])
            continue;
            else if(nums[i+1]-nums[i]==1)
            {
                count++;
            }
            else
            {
                if(count>max)
                {max=count;}
                count=1;
            }
        }
        if(count>max)
        max=count;
        return max;
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i] = in.nextInt();
        }
        LongestConsecutiveSequence obj = new LongestConsecutiveSequence();
        int result = obj.longestConsecutive(nums);
        System.out.println(result);

    }
}
