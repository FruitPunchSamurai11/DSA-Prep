import java.util.*;

public class ContainDuplicateHash {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            {
                return true;
            }
            map.put(nums[i],i);
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
        ContainDuplicateHash obj = new ContainDuplicateHash();
        boolean result = obj.containsDuplicate(nums);
        System.out.println(result);

    }
}
