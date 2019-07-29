class ArmstrongNumbers {

	boolean isArmstrongNumber(int numberToCheck) {

		int num = numberToCheck;
		int i=0;
		int j=0;
		while(numberToCheck>0){
			i++;
			numberToCheck = numberToCheck/10;
		}
		numberToCheck = num;
		while(numberToCheck>0){
			j+=Math.pow(numberToCheck%10,i);
			numberToCheck = numberToCheck/10;
		}
		return j==num;
	}



}
