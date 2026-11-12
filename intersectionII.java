import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class intersectionII {

    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> map = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<nums1.length;i++)
        {
            map.add(nums1[i]);
        }
        for(int j=0;j<nums2.length;j++)
        {
            if(map.contains(nums2[j]))
            {
                res.add(nums2[j]);
                map.remove(Integer.valueOf(nums2[j]));
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
        intersectionII obj = new intersectionII();
        int[] result = obj.intersect(nums1,nums2);
        System.out.println(Arrays.toString(result));
    }


}
