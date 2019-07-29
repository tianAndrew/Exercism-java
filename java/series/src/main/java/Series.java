import java.util.ArrayList;
import java.util.List;

public class Series {
    String num;
    Series(String str){
        this.num = str;
    }
    List slices(int len){
        if(len <= 0){
            throw new IllegalArgumentException("Slice size is too small.");
        }
        if(len > num.length()){
            throw new IllegalArgumentException("Slice size is too big.");
        }
        List res = new ArrayList();
        for (int i = 0; i<=num.length()-len;i++){
            res.add(num.subSequence(i,i+len));
        }
        return res;
    }
}
