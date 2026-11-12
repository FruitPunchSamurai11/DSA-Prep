import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Scanner;

public class disappearednumberssuboptimal {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> map = new HashSet<>();
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            map.add(nums[i]);
        }
        for(int j=1;j<=nums.length;j++)
        {
            if(!map.contains(j))
            {
                res.add(j);
            }
        }
        return res;
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
        disappearednumberssuboptimal obj = new disappearednumberssuboptimal();
        List<Integer> result = obj.findDisappearedNumbers(nums);
        System.out.println(result);
    }

}
