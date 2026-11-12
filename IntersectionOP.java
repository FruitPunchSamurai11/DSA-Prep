import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class IntersectionOP {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set=new HashSet<>();
        int[] arr=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }
        int idx=0;
        for(int i=0;i<nums2.length;i++){
            if(set.contains(nums2[i])){
                arr[idx]=nums2[i];
                idx++;
                set.remove(nums2[i]);
            }
        }
        return Arrays.copyOf(arr,idx);
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
        IntersectionOP obj = new IntersectionOP();
        int[] result = obj.intersection(nums1,nums2);
        System.out.println(Arrays.toString(result));
    }
}

