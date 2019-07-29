public class House {
    String str[];

    House(){
        String str1[] = {
                "This is the horse and the hound and the horn ",
                "that belonged to the farmer sowing his corn ",
                "that kept the rooster that crowed in the morn ",
                "that woke the priest all shaven and shorn ",
                "that married the man all tattered and torn ",
                "that kissed the maiden all forlorn ",
                "that milked the cow with the crumpled horn ",
                "that tossed the dog ",
                "that worried the cat ",
                "that killed the rat ",
                "that ate the malt ",
                "that lay in the house that Jack built"
        };
        this.str = str1;
    }
    String verse(int num){
        String res = "";
        int index = str[12-num].indexOf("the");
        res += "This is "+str[12-num].substring(index);
        for(int i =num-2;i>=0;i--){
            res += str[11-i];
        }
        res +=".";

        return res;
    }
    String verses(int num,int end){
        String res = "";
        for (int i =num;i<=end;i++){
            res += verse(i);

            if (i != end){
                res += "\n";
            }
        }
        return res;
    }
    String sing(){
        return verses(1,12);
    }
}
