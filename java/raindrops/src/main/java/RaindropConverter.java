class RaindropConverter {

    String convert(int number) {
        String str = "";
        if(number%3==0){
            str = str+"Pling";
        }
        if(number%5==0){
            str = str+"Plang";
        }
        if(number%7==0){
            str = str+"Plong";
        }
        if(str ==""){
            str = String.format("%d", number);
        }
        return str;
    }

}
