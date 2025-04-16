package bai2_2;

public class Bai2_2 {
	public static void main(String[] args) {
		int ageFather = 35;
		int ageSon = 5;
		int year = 0;

		while (true) {
			if (ageFather == 2 * ageSon) {
				break;
			} else {
				ageFather++;
				ageSon++;
				year++;
			}

		}
		System.out.println("Sau bao " + year + " năm nữa thì tuổi cha gấp đôi tuổi con ");
		System.out.println("Tuổi cha là: " + ageFather + "\nTuổi con là: " + ageSon);

	}

}
