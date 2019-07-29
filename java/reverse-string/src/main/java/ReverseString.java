class ReverseString {

    String reverse(String inputString) {

        if(inputString.length()<=1)
            return inputString;
        return inputString.substring(inputString.length()-1)+reverse(inputString.substring(0,inputString.length()-1));
}
  
}