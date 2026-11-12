import java.util.*;

public class palindromewhile {

    public void reverseString(char[] s) {
        int low =0;
        int high = s.length-1;
        char c;
        while(low<high)
        {
            c=s[low];
            s[low]=s[high];
            s[high]=c;
            low++;
            high--;
        }
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        char[] c = s.toCharArray();
        palindromewhile obj = new palindromewhile();
        obj.reverseString(c);
        System.out.println(c);

    }

}
