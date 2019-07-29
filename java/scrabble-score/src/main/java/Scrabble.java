import java.util.HashMap;
import java.util.Map;

class Scrabble {
    private String word;
    private String[] alphaList;
    private Map scoreMap = new HashMap();
    Scrabble(String word) {
        String[] str = {"A, E, I, O, U, L, N, R, S, T","D, G","B, C, M, P","F, H, V, W, Y","K","J, X","Q, Z"};
        this.alphaList = str;
        this.word = word.toUpperCase();
        for(int i =0;i<alphaList.length;i++){
            String[] temp = alphaList[i].split(", ");
            int t = i+1;
            if(i>4){
                t = 2*(i-1);
            }
            for(int j =0;j<temp.length;j++){
                scoreMap.put(temp[j],t);
            }
        }
    }

    int getScore() {
        int num =0;

        for(int i =0;i<word.length();i++){
            num += (int)scoreMap.get(word.substring(i,i+1));
        }
        return num;
    }
}
