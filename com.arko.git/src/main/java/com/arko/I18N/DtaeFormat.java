package com.arko.I18N;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DtaeFormat {

	public static void main(String[] args) throws ParseException {
		DateFormat df = DateFormat.getDateTimeInstance(0,0,Locale.US);
		System.out.println(df.format(new Date()));
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String date = sdf.format(new Date());
		System.out.println(date);
		
		String dateasstring ="10-12-2019";
		SimpleDateFormat sdf2 = new SimpleDateFormat("MM-dd-yyyy");
		System.out.println(sdf2.parse(dateasstring));
	}

}
