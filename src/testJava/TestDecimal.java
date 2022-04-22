package testJava;

import java.math.BigDecimal;

public class TestDecimal {

	public static void main(String[] args) {
		BigDecimal val = new BigDecimal(5.33328E7);
		System.out.println("val = " + val);
		System.out.println("toPlainString() = " + val.toPlainString());
		System.out.println("toString() = " + val.toString());

	}

}
