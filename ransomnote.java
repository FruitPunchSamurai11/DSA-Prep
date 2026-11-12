import java.util.*;
public class ransomnote {

    public boolean canConstruct(String ransomNote, String magazine) {
        int[] freq = new int[26];
        for(int i=0;i<magazine.length();i++)
        {
            freq[magazine.charAt(i)-'a']++;
        }
        for(int k=0;k<ransomNote.length();k++)
        {
            if(--freq[ransomNote.charAt(k)-'a']<0)
            return false;
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String ransomNote = in.next();
        String magazine = in.next();
        ransomnote obj = new ransomnote();
        boolean result = obj.canConstruct(ransomNote,magazine);
        System.out.println(result);
    }

}
