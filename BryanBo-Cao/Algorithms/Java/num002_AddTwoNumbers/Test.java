package algorithms.num002_AddTwoNumbers;

import java.util.Date;

import javax.xml.crypto.Data;

public class Test {

	public static void main(String[] args) {
		int sum = 13;
		int carry = 0;
		int div = 0;
		long time1 = System.currentTimeMillis();
		int a = sum / 3;
		long time2 = System.currentTimeMillis();
		if (sum >= 10) {
			carry = 1;
		}
		long time3 = System.currentTimeMillis();
		if (sum >= 10) {
			carry++;
		}
		long time4 = System.currentTimeMillis();
		div = sum - 10;
		long time5 = System.currentTimeMillis();
		div = sum % 10;
		long time6 = System.currentTimeMillis();
		System.out.println(time2 - time1);
		System.out.println(time3 - time2);
		System.out.println(time4 - time3);
		System.out.println(time5 - time4);
		System.out.println(time6 - time5);
	}

}
