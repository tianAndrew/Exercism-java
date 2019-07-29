class IsbnVerifier {

    static boolean isValid(String stringToVerify) {
        int num = 10;
        int sum = 0;
        for(int i = 0; i<stringToVerify.length();i++){
            String b = stringToVerify.substring(i,i+1);
             if(b.compareTo("0")<=9&&b.compareTo("0")>=0){
                sum += num * Integer.valueOf(b).intValue();
                num--;
            }
            if(b .equals("X") && num==1){
                sum += num * 10;
                 num--;
            }
        }
        if(num!=0){
            return false;
        }
        if(sum%11 == 0 ){
            return true;
        }
        return false;
    }

}
