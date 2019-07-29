import java.util.regex.*;

public class PhoneNumber {
    String number;

    PhoneNumber(String number) {
        number = number.replaceAll("[().\\s+-]", "");
        number = number.toLowerCase();
        if (!Pattern.matches("[0-9]*", number)) {
            if (Pattern.matches("[a-z0-9]*", number)) {
                throw new IllegalArgumentException("letters not permitted");
            } else {
                throw new IllegalArgumentException("punctuations not permitted");
            }
        }
        if (number.length() > 11) {
            throw new IllegalArgumentException("more than 11 digits");
        } else if (number.length() < 10) {
            throw new IllegalArgumentException("incorrect number of digits");
        }
        if (number.charAt(0) == '1' && number.length() == 11) {
            number = number.substring(1, 11);
        }

        if (number.length() == 11) {
            throw new IllegalArgumentException("11 digits must start with 1");
        }


        if (number.charAt(0) == '0') {
            throw new IllegalArgumentException("area code cannot start with zero");
        } else if (number.charAt(0) == '1') {
            throw new IllegalArgumentException("area code cannot start with one");
        } else if (number.charAt(3) == '0') {
            throw new IllegalArgumentException("exchange code cannot start with zero");
        } else if (number.charAt(3) == '1') {
            throw new IllegalArgumentException("exchange code cannot start with one");
        }
        this.number = number;
    }


    String getNumber() {
        return number;
    }
}
