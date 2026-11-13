import java.util.HashMap;
import java.util.Scanner;


public class uniquechar {

    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
        }
        for(int j=0;j<s.length();j++)
        {
            if(map.get(s.charAt(j))==1)
            {
                return j;
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        uniquechar obj = new uniquechar();
        int result = obj.firstUniqChar(s);
        System.out.println(result);

    }

}
