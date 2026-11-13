import java.util.*;
public class subsequence {

    public boolean isSubsequence(String s, String t) {
        int slow = 0;
        int fast = 0;
        while(fast<t.length()&&slow<s.length())
        {
            if(s.charAt(slow)==t.charAt(fast))
            {
                slow++;
                fast++;
            }
            else
            {
                fast++;
            }
        }
        if(slow==s.length())
        return true;
        return false;
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        subsequence obj = new subsequence();
        boolean result = obj.isSubsequence(s,t);
        System.out.println(result);

    }

}
