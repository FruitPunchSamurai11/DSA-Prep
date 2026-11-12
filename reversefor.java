import java.util.*;

public class reversefor {

    public void reverseString(char[] s) {
        int l = s.length;
        for(int i = 0 ; i<l/2 ; i++){
            char temp = s[i];
            s[i] = s[l-1-i];
            s[l-1-i] = temp;
        }
        
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        char[] c = s.toCharArray();
        reversefor obj = new reversefor();
        obj.reverseString(c);
        System.out.println(c);

    }

}
