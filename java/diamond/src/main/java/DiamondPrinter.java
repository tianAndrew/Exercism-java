import java.util.ArrayList;
import java.util.List;

class DiamondPrinter {

    List<String> printToList(char a) {
        int t = a-'A'+1;
        List<String> list = new ArrayList<>();
        list.add(repeat(t)+String.valueOf('A')+repeat(t));
        if (t==1){
            return list;
        }
        for (int i =1;i<t;i++){
            list.add(repeat(t-i)+String.format("%c",'A'+i)+repeat(2*i)+String.format("%c",'A'+i)+repeat(t-i));
        }
        for (int i =t-2;i>0;i--){
            list.add(repeat(t-i)+String.format("%c",'A'+i)+repeat(2*i)+String.format("%c",'A'+i)+repeat(t-i));
        }
        list.add(repeat(t)+String.valueOf('A')+repeat(t));
        return list;

    }
    String repeat(int m){
        String base = "";
        for (int i =0;i<m-1;i++){
            base+=" ";
        }
        return base;
    }

}
