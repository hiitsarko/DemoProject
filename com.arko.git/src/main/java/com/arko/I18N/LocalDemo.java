package com.arko.I18N;

import java.util.Locale;

public class LocalDemo {

	public static void main(String[] args) {
		 Locale l = Locale.getDefault();
		 System.out.println(l.getDisplayCountry()+"  "+l.getDisplayLanguage());
		 Locale.setDefault(Locale.UK);
		 System.out.println(Locale.getDefault().getDisplayCountry()+"  "+Locale.getDefault().getDisplayLanguage());
		 
		 String[] isoCountries = Locale.getISOCountries();
		 for(String country:isoCountries) {
			 System.out.println(country);
		 }
	}

}
