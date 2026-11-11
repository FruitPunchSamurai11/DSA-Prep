import java.util.*;

public class ContainDuplicateSort {
    public boolean containsDuplicate(int[] nums) {
    Arrays.sort(nums);
    for(int i=0;i<nums.length-1;i++)
    {
        if(nums[i]==nums[i+1])
        {
            return true;
        }
    }
    return false;
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
        ContainDuplicateSort obj = new ContainDuplicateSort();
        boolean result = obj.containsDuplicate(nums);
        System.out.println(result);

    }
}
