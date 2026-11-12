import java.util.*;
public class Twosumsorted {
    
    public int[] twoSum(int[] numbers, int target) {
        int low=0;
        int high=numbers.length-1;
        
        while(low<high)
        {
            int temp=numbers[low]+numbers[high];
            if(temp==target)
            return new int[]{low+1,high+1};
            else if(temp<target)
            low++;
            else
            high--;
        }
        
        return new int[]{};
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] numbers = new int[n];
        for(int i=0;i<n;i++)
        {
            numbers[i] = in.nextInt();
        }
        int target = in.nextInt();
        Twosumsorted obj = new Twosumsorted();
        int[] result = obj.twoSum(numbers,target);
        System.out.println(Arrays.toString(result));

    }
}
