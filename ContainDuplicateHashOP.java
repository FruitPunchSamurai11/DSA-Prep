import java.util.*;

public class ContainDuplicateHashOP {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> map = new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            if(!map.add(nums[i]))
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
        ContainDuplicateHashOP obj = new ContainDuplicateHashOP();
        boolean result = obj.containsDuplicate(nums);
        System.out.println(result);

    }
}
