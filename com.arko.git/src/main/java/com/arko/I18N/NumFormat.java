package com.arko.I18N;

import java.text.NumberFormat;
import java.util.Locale;

public class NumFormat {

	public static void main(String[] args) {
		long l = 122344567;
		NumberFormat nf1 = NumberFormat.getInstance(Locale.UK);
		NumberFormat nf2 = NumberFormat.getInstance(Locale.US);
		NumberFormat nf3 = NumberFormat.getInstance(Locale.FRANCE);
		System.out.println(nf1.format(l));
		System.out.println(nf2.format(l));
		System.out.println(nf3.format(l));

	}

}
