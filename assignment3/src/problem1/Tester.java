package problem1;

public class Tester {
	public static void main(String[] args) {
		Credit_card_number_validation credit_card = new Credit_card_number_validation("1234345656456456433");
		System.out.println(credit_card.get_validation());
		credit_card.set_credit_card_number("1230");
		System.out.println(credit_card.get_validation());
	}
}
