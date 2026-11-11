import java.util.*;

class TwoSumOP {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int compliment = target - nums[i];
            if(map.containsKey(compliment))
            {
                return new int[]{map.get(compliment),i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1,-1};
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
        int target = in.nextInt();
        TwoSumOP obj = new TwoSumOP();
        int[] result = obj.twoSum(nums,target);
        System.out.println(Arrays.toString(result));

    }
}