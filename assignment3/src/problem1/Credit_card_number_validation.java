package problem1;

public class Credit_card_number_validation {
	private String credit_card;
	private boolean validation;
    
	
	public  Credit_card_number_validation()
	{
		
	}
	
	
	public  Credit_card_number_validation(String number)
	{
		credit_card = remove_spaces_dashes(number);
	}
	public void set_credit_card_number(String number) {
		credit_card = remove_spaces_dashes(number);
	}

	private String remove_spaces_dashes(String number) {
		for (int i = 0; i < number.length() - 1; i++) {
			if (number.charAt(i) == '-' || number.charAt(i) == ' ') {
				number.replace(number.charAt(i), '\0');
			}
		}
		return number;
	}

	private int sum() {
		int sum = 0;
		for (int i = 0; i < credit_card.length() - 1; i++) {
			int temp = Integer.parseInt(String.valueOf(credit_card.charAt(i)));
			sum += temp;
		}
		return sum;
	}

	private int sum_of_second_digit() {
		int sum = 0;
		for (int i = credit_card.length() - 2; i > 0; i -= 2) {
			int temp = Integer.parseInt(String.valueOf(credit_card.charAt(i)));
			sum += temp;
		}
		return sum;
	}

	private int larger_than_4() {
		int counter = 0;
		for (int i = credit_card.length() - 2; i > 0; i -= 2)
			if (credit_card.charAt(i) >= 4)
				counter++;
		return counter;
	}

	public boolean get_validation() {
		int temp = larger_than_4() + sum_of_second_digit() + sum();
		if (0 == temp % 10)
			validation = true;
		else
			validation = false;
		return validation;
	}

	
	

}
