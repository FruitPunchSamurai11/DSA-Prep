import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class intersectionIIOP {

    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap <Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            map.put(nums1[i],map.getOrDefault(nums1[i],0)+1);
        }
        int[] arr = new int[nums2.length];int count=0;
        for(int i=0;i<nums2.length;i++){
            if(map.containsKey(nums2[i]) && map.get(nums2[i])>0){
                arr[count]=nums2[i];
                count++;
                map.put(nums2[i],map.get(nums2[i])-1);

            }
        }
        int[] result = new int[count];
        for(int i=0;i<count;i++){
            result[i]=arr[i];
        }
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
        intersectionIIOP obj = new intersectionIIOP();
        int[] result = obj.intersect(nums1,nums2);
        System.out.println(Arrays.toString(result));
    }

}
