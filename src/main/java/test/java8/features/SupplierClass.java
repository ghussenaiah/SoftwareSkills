package test.java8.features;

import java.util.ArrayList;
import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class SupplierClass {

	public static void main(String args[]) {

		Supplier<Date> d = () -> new Date();

		System.out.println("supplier exaplme" + "---> " + d.get());

		Supplier<String> otpdata = () -> {

			String otp = "";
			for (int i = 0; i < 6; i++) {

				otp = otp + (int) (Math.random() * 10);
			}
			return otp;
		};

		System.out.println("otp" + "---> " + otpdata.get());
	}

}
