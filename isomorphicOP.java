import java.util.Scanner;   

public class isomorphicOP {

    public boolean isIsomorphic(String s, String t) {
        int []map1=new int[256];
        int[]map2=new int[256];
        for(int i=0;i<s.length();i++){
            char ch1=s.charAt(i);
            char ch2=t.charAt(i);

            if(map1[ch1]!=map2[ch2]){
                return false;
            }
            map1[ch1]=i+1;
            map2[ch2]=i+1;
        }

        return true;
    
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        isomorphicOP obj = new isomorphicOP();
        boolean result = obj.isIsomorphic(s,t);
        System.out.println(result);

    }


}
