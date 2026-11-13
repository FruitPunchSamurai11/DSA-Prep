import java.util.Scanner;
public class removeelement {

    public int removeElement(int[] nums, int val) {
        int slow=0;
        int fast=0;
        while(fast<nums.length)
        {
            if(nums[fast]!=val)
            {
                nums[slow]=nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;

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
        int val = in.nextInt();
        removeelement obj = new removeelement();
        int result = obj.removeElement(nums,val);
        System.out.println(result);

    }

}
