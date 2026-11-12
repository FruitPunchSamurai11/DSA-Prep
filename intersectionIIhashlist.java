import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class intersectionIIhashlist {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<nums1.length;i++)
        {
            freq.put(nums1[i],freq.getOrDefault(nums1[i],0)+1);
        }
        for(int j=0;j<nums2.length;j++)
        {
            if (freq.getOrDefault(nums2[j], 0) > 0) {
                res.add(nums2[j]);
                freq.put(nums2[j], freq.get(nums2[j]) - 1);
            }
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
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
        intersectionIIhashlist obj = new intersectionIIhashlist();
        int[] result = obj.intersect(nums1,nums2);
        System.out.println(Arrays.toString(result));
    }

}
