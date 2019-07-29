public class Bob {
    String hey(String str){
        if(str.replace(" ","").replace("\t","")
                .replace("\n","").replace("\r","").equals("")){
            return "Fine. Be that way!";
        }
        if(str.equals(str.toUpperCase())&&!str.equals(str.toLowerCase())){
            if(str.contains("?")){
                return "Calm down, I know what I'm doing!";
            }else return "Whoa, chill out!";
        }else {
            if(str.trim().endsWith("?")){
                return "Sure.";
            }
            return "Whatever.";
        }
    }
}
