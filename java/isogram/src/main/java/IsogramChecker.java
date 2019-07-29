class IsogramChecker {

    boolean isIsogram(String phrase) {
        phrase = phrase.toLowerCase().replace(" ","").replace("-","");
        while (phrase.length() > 0) {
            if (!phrase.substring(1).contains(phrase.substring(0,1))) {
                phrase = phrase.substring(1);
            }else return false;
        }
        return true;
    }

}
