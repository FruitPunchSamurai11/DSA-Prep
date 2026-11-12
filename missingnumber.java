import java.util.*;

public class missingnumber {

    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        if(nums[0]!=0)
        return 0;
        if(nums[nums.length-1]!=nums.length)
        return nums.length;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i+1]-nums[i]!=1)
            return nums[i+1]-1;
        }
        return 0;
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
        missingnumber obj = new missingnumber();
        int result = obj.missingNumber(nums);
        System.out.println(result);

    }

}
