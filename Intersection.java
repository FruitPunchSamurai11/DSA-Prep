import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class Intersection {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> map = new HashSet<>();
        Set<Integer> res = new HashSet<>();
        for(int i=0;i<nums1.length;i++)
        {
            map.add(nums1[i]);
        }
        for(int j=0;j<nums2.length;j++)
        {
            if(map.contains(nums2[j]))
            {
                res.add(nums2[j]);
            }
        }
        int[] result = res.stream().mapToInt(Integer::intValue).toArray();
        return result;
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int[] nums1 = new int[n1];
        for(int i=0;i<n1;i++)
        {
            nums1[i] = in.nextInt();
        }
        int n2 = in.nextInt();
        int[] nums2 = new int[n2];
        for(int j=0;j<n2;j++)
        {
            nums2[j] = in.nextInt();
        }
        Intersection obj = new Intersection();
        int[] result = obj.intersection(nums1,nums2);
        System.out.println(Arrays.toString(result));
    }
}
