class TwelveDays {
    String beginStr;
    String str1[],str2[];
    TwelveDays() {
        String str = "On the first day of Christmas my true love gave to me:";
        String strList[] = {
                " a Partridge in a Pear Tree.\n", " two Turtle Doves,", " three French Hens,", " four Calling Birds,", " five Gold Rings,", " six Geese-a-Laying,", " seven Swans-a-Swimming,", " eight Maids-a-Milking,", " nine Ladies Dancing,", " ten Lords-a-Leaping,", " eleven Pipers Piping,", " twelve Drummers Drumming,"
        };
        this.beginStr = str;
        this.str1 = strList;
        String strL[] = {"first","second","third","fourth","fifth","sixth","seventh","eighth","ninth","tenth","eleventh","twelfth"};
        this.str2 = strL;
    }

    String v(int verseNumber){
        if (verseNumber == 0)
            return " and"+str1[0];
        return str1[verseNumber]+v(verseNumber-1);
    }

    String verse(int verseNumber) {
        if (verseNumber==1)
            return beginStr+str1[0];
        return beginStr.replace("first",str2[verseNumber-1])+v(verseNumber-1);
    }

    String verses(int startVerse, int endVerse) {
        String str = "";
        for(int verseNumber = startVerse;verseNumber<=endVerse;verseNumber++){
            str+=verse(verseNumber);
            if (verseNumber !=endVerse){
                str+="\n";
            }
        }
        return str;
    }

    String sing() {
        return verses(1,12);
    }
}
