import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Allergies {
    String binaryStr;
    String fList[] = {"EGGS","PEANUTS", "SHELLFISH" , "STRAWBERRIES" , "TOMATOES" , "CHOCOLATE" ,"POLLEN" , "CATS"};
    Allergies(int score){
        this.binaryStr = Integer.toBinaryString(score);
    }

   boolean isAllergicTo(Allergen allergen){
        String num = Integer.toBinaryString(allergen.getScore());
        if (num.length()>binaryStr.length())
            return false;
        if(binaryStr.substring(binaryStr.length()-num.length(),binaryStr.length()-num.length()+1).equals(num.substring(0,1))){
            return true;
        }
        return false;

    }

    List getList(){
        List list = new ArrayList();
        if(binaryStr.length()>8) {
            binaryStr = binaryStr.substring(binaryStr.length() - 8);
        }

            for (int i = 0; i < binaryStr.length(); i++) {
                if (binaryStr.substring(binaryStr.length() - i - 1, binaryStr.length() - i).equals("1")) {
                    list.add(Allergen.valueOf(fList[i]));
                }
            }

        return list;
    }
}


