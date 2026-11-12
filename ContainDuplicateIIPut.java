import java.util.*;

public class ContainDuplicateIIPut {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            Integer previous = map.put(nums[i], i);

            if (previous != null && i - previous <= k) {
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
        int k = in.nextInt();
        ContainDuplicateIIPut obj = new ContainDuplicateIIPut();
        boolean result = obj.containsNearbyDuplicate(nums,k);
        System.out.println(result);

    }
}
