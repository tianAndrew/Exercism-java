class LargestSeriesProductCalculator {
    String inputNumber;

    LargestSeriesProductCalculator(String inputNumber) {
        for (int i =0;i<inputNumber.length();i++){
            if(inputNumber.charAt(i)-'0'>9 ||inputNumber.charAt(i)-'0'<0)
                throw new IllegalArgumentException("String to search may only contain digits.");
        }
        this.inputNumber = inputNumber;
    }

    long calculateLargestProductForSeriesLength(int numberOfDigits) {
        if (numberOfDigits < 0)
            throw new IllegalArgumentException("Series length must be non-negative.");
        if (numberOfDigits > inputNumber.length())
            throw new IllegalArgumentException("Series length must be less than or equal to the length of the string to search.");

        long max = 0;
        int flag,ii;

        for (int i = 0; i < inputNumber.length() - numberOfDigits; i++) {
            if (inputNumber.charAt(i) <= inputNumber.charAt(i + numberOfDigits))
                continue;
         /*   for (ii=1;ii<inputNumber.length() - numberOfDigits-i;ii++){
                if (inputNumber.charAt(ii+i) <= inputNumber.charAt(i+ii + numberOfDigits))
                    break;
            }*/
            flag = 1;
            for (int j = 0; j < numberOfDigits; j++) {
                String num = inputNumber.substring(i + j, i + j + 1);
                flag *= Integer.parseInt(num);
            }
            if (flag > max) {
                max = flag;
            }
       //     i = i+ii-1;
        }
        flag = 1;
        for (int j = 0; j < numberOfDigits; j++) {
            String num = inputNumber.substring(inputNumber.length() - numberOfDigits + j, inputNumber.length() - numberOfDigits + j + 1);
            flag *= Integer.parseInt(num);
        }
        if (flag > max) {
            max = flag;
        }
        return max;
    }
}

