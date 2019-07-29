class Proverb {
    String words[];
    Proverb(String[] words) {
        this.words = words;
    }

    String recite() {
        String str="";
        for(int i =0;i<words.length-1;i++){
            str+=String.format("For want of a %s the %s was lost.\n",words[i],words[i+1]);
        }
        if(words.length>0) {
            str += String.format("And all for the want of a %s.", words[0]);
        }
        return str;
    }

}
