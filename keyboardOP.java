import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class keyboardOP {

    public static boolean validateString(String word, String row){
        for(char ch : word.toCharArray()){
            if(row.indexOf(ch) == -1) return false;
        }
        return true;
    }

    public String[] findWords(String[] words) {
        String row1= "qwertyuiopQWERTYUIOP";
        String row2= "ASDFGHJKLasdfghjkl";
        String row3 = "ZXCVBNMzxcvbnm";
        List<String> lst = new ArrayList<>();

        for(int i = 0 ; i < words.length ; i++){
            String temp = words[i];
            char first = temp.charAt(0);
            boolean val = false;
            if(row1.indexOf(first) != -1){
                 val = validateString(temp, row1);
            }
            else if(row2.indexOf(first) != -1){
                 val = validateString(temp, row2);
            }
            else if(row3.indexOf(first) != -1){
                 val = validateString(temp, row3);
            }

            
            if(val){lst.add(temp);}
        }

        return lst.toArray(new String[0]);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = in.next();
        }
        keyboardOP obj = new keyboardOP();
        String[] result = obj.findWords(words);
        for (String word : result) {
            System.out.println(word);
        }
    }
}

