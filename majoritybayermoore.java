import java.util.Scanner;
public class majoritybayermoore {

    public int majorityElement(int[] nums) {
        int cnt=0;
        int el=0;
        for(int i=0;i<nums.length;i++){
            if(cnt==0){
                cnt=1;
                el=nums[i];
            }
            else if(nums[i]==el){
                cnt++;
            }
            else{
                cnt--;
            }
        }
        return el;

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
        majoritybayermoore obj = new majoritybayermoore();
        int result = obj.majorityElement(nums);
        System.out.println(result);

    }

}
