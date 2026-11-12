import java.util.HashMap;
import java.util.Scanner;

public class wordpattern {
  
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map = new HashMap<>();
        HashMap<String,Character> reversemap = new HashMap<>();
        String[] x = s.split(" ");
        if(pattern.length()!=x.length)
        return false;
        for(int i=0;i<pattern.length();i++)
        {
            char a = pattern.charAt(i);
            String b = x[i];
            
            if(map.containsKey(a)&&!map.get(a).equals(b))
            {
                return false;
            }

            if(reversemap.containsKey(b)&&reversemap.get(b)!=a)
            {
                return false;
            }

            map.put(a,b);
            reversemap.put(b,a);
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String pattern = in.next();
        String s = in.nextLine();
        wordpattern obj = new wordpattern();
        boolean result = obj.wordPattern(pattern,s);
        System.out.println(result);

    }

}
