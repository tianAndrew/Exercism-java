public class PangramChecker {

    public boolean isPangram(String input) {
        input = input.toLowerCase();
        char al = 'a';
        while (al<='z'){
            if(input.contains(String.valueOf(al))){
                al++;
            }else
                return false;
        }
        return true;
    }

}
