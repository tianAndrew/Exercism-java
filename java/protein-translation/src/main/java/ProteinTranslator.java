import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ProteinTranslator {
    static HashMap<String,String> map = new HashMap <String, String>(){{
        put("AUG","Methionine");
        put("UUU","Phenylalanine");
        put("UUC","Phenylalanine");
        put("UUA","Leucine");
        put("UUG","Leucine");
        put("UCU","Serine");
        put("UCC","Serine");
        put("UCA","Serine");
        put("UCG","Serine");
        put("UAU","Tyrosine");
        put("UAC","Tyrosine");
        put("UGU","Cysteine");
        put("UGC","Cysteine");
        put("UGG","Tryptophan");
        put("UAA","STOP");
        put("UAG","STOP");
        put("UGA","STOP");
    }};

    static List<String> translate(String rnaSequence) {

        List<String> list = new ArrayList<>();
        if(rnaSequence.length()%3!=0){
            throw new IllegalArgumentException();
        }
        for(int i =0;i<=rnaSequence.length()-3;i+=3){
            if(map.get(rnaSequence.substring(i,i+3)) == null || map.get(rnaSequence.substring(i,i+3)) =="STOP")
                break;
            else list.add(map.get(rnaSequence.substring(i,i+3)));
        }
        return list;

    }
}