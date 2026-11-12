import java.util.*;
public class keyboard {

    public String[] findWords(String[] words) {
        char[] a = "qwertyuiop".toCharArray();
        char[] b = "asdfghjkl".toCharArray();
        char[] c = "zxcvbnm".toCharArray();

        List<String> result = new ArrayList<>();

        Set<Character> a1 = new HashSet<>();
        Set<Character> b1 = new HashSet<>();
        Set<Character> c1 = new HashSet<>();

        for (char ch : a) a1.add(ch);
        for (char ch : b) b1.add(ch);
        for (char ch : c) c1.add(ch);

        for (String s : words) {
            String word = s.toLowerCase();
            boolean valid = true;

            if (a1.contains(word.charAt(0))) {
                for (char ch : word.toCharArray()) {
                    if (!a1.contains(ch)) {
                        valid = false;
                        break;
                    }
                }
            } else if (b1.contains(word.charAt(0))) {
                for (char ch : word.toCharArray()) {
                    if (!b1.contains(ch)) {
                        valid = false;
                        break;
                    }
                }
            } else {
                for (char ch : word.toCharArray()) {
                    if (!c1.contains(ch)) {
                        valid = false;
                        break;
                    }
                }
            }

            if (valid) {
                result.add(s);
            }
        }

        return result.toArray(new String[0]);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = in.next();
        }
        keyboard obj = new keyboard();
        String[] result = obj.findWords(words);
        System.out.println(Arrays.toString(result));
    }
}

