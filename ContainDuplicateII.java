import java.util.*;

public class ContainDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            {
                if(i-map.get(nums[i])<=k)
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
        int k = in.nextInt();
        ContainDuplicateII obj = new ContainDuplicateII();
        boolean result = obj.containsNearbyDuplicate(nums,k);
        System.out.println(result);

    }

}
