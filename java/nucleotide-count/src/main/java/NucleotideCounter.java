import java.util.HashMap;
import java.util.Map;

public class NucleotideCounter {
    String str;
    NucleotideCounter(String str){
        this.str = str;
        char[] c = str.toCharArray();
        for(int i =0;i<c.length;i++) {
            if (c[i] != 'A' && c[i] != 'C' && c[i] != 'G' && c[i] != 'T') {
                throw new IllegalArgumentException();
            }
        }
    }
    Map<Character, Integer> nucleotideCounts(){
        Map<Character, Integer> map = new HashMap<>();
        map.put('A',0);
        map.put('C',0);
        map.put('T',0);
        map.put('G',0);
        char[] c = str.toCharArray();
        for(int i =0;i<c.length;i++){
            map.replace(c[i],map.get(c[i])+1);
        }
        return map;
    }
}
