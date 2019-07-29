class Acronym {
    String phrase;

    Acronym(String phrase) {
        this.phrase = phrase;
    }

    String get() {
        String phrase = this.phrase.toUpperCase();
        String[] list1, list2;
        list1 = phrase.split("-");
        String res = "";
        for (int i = 0; i < list1.length; i++) {
            list2 = list1[i].split(" ");
            for (int j = 0; j < list2.length; j++) {
                int a = 0;
                if(list2[j].length()==0)
                    continue;
                while (!(list2[j].substring(a, a + 1).compareTo("A") < 25 && list2[j].substring(a, a + 1).compareTo("A") >= 0)) {
                    a += 1;
                }
                res += list2[j].substring(a, a + 1);
            }
        }
        return res;
    }
}
