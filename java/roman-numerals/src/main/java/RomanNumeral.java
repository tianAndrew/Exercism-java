public class RomanNumeral {
    int num;

    RomanNumeral(int num) {
        this.num = num;
    }

    String getRomanNumeral() {
        String res = "";
        for (; num >= 1000; num -= 1000) {
            res += "M";
        }
        if(num >= 900){
            res+="CM";
            num -=900;
            }
        for (; num >= 500; num -= 500) {
            res += "D";
        }
        if (num >= 400) {
            res+="CD";
            num -=400;
        }
        for (; num >= 100; num -= 100) {
            res += "C";
        }

        for (;num >= 90; num += 10) {
            if (num >=100){
                res+="C";
                num -=100;
                break;
            }
            res += "X";
        }
        for (; num >= 50; num -= 50) {
            res += "L";
        }
        for (;num >= 40; num += 10) {
            if (num >=50){
                res+="L";
                num -=50;
                break;
            }
            res += "X";
        }
        for (; num >= 10; num -= 10) {
            res += "X";
        }

        for (;num > 8; num += 1) {
            if (num >=10){
                res+="X";
                num -=10;
                break;
            }
            res += "I";
        }
        for (; num >= 5; num -= 5) {
            res += "V";
        }
        for (;num > 3; num += 1) {
            if (num >=5){
                res+="V";
                num -=5;
                break;
            }
            res += "I";
        }
        for (; num >= 1; num -= 1) {
            res += "I";
        }
        return res;


    }
}
