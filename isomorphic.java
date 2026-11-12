import java.util.HashMap;
import java.util.Scanner;

public class isomorphic {

    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            char b = t.charAt(i);

            if (map1.containsKey(a) && map1.get(a) != b)
                return false;

            if (map2.containsKey(b) && map2.get(b) != a)
                return false;

            map1.put(a, b);
            map2.put(b, a);
        }

        return true;
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        isomorphic obj = new isomorphic();
        boolean result = obj.isIsomorphic(s,t);
        System.out.println(result);

    }


}
