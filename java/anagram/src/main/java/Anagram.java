import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Anagram {
    String a1;
    HashMap<Character, Integer> map = new HashMap<>();

    Anagram(String a1) {
        this.a1 = a1;
        String a = a1.toUpperCase();
        for (int i = 0; i < a.length(); i++) {
            if (map.get(a.charAt(i)) == null) {
                map.put(a.charAt(i), 1);
            } else {
                map.replace(a.charAt(i), map.get(a.charAt(i)) + 1);
            }
        }
    }

    List match(List s) {
        List b = new ArrayList();
        for (int i = 0; i < s.size(); i++) {
            if (isMatch((String) s.get(i))) {
                b.add(s.get(i));

            }
        }
        return b;
    }

    Boolean isMatch(String str1) {
        String str = str1.toUpperCase();
        if(str.equals( a1.toUpperCase()))
            return false;
        HashMap<Character, Integer> map1 = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (map1.get(str.charAt(i)) == null) {
                map1.put(str.charAt(i), 1);
            } else {
                map1.replace(str.charAt(i), map1.get(str.charAt(i)) + 1);
            }
        }
        if (map1.size() != map.size()) {
            return false;
        }
        for (char c : map.keySet()) {
            if (map1.get(c) != map.get(c))
                return false;
        }
        return true;
    }
}
