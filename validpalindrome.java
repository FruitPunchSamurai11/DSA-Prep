import java.util.*;
public class validpalindrome {
  
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        char[] c = s.toCharArray();
        int low =0;
        int high = c.length-1;
        while(low<=high)
        {
           if(!Character.isLetterOrDigit(c[low]))
            {
                low++;
            }
            else if(!Character.isLetterOrDigit(c[high]))
            {
                high--;
            }
            else
            {
                if(c[low]!=c[high])
                {
                    return false;
                }
                low++;
                high--;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        validpalindrome obj = new validpalindrome();
        boolean result = obj.isPalindrome(s);
        System.out.println(result);

    }

}
