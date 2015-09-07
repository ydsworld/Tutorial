package com.ydsworld.ApacheCommon;

import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang.time.DateFormatUtils;
import org.apache.commons.lang.time.DateUtils;

public class DateUtilTrunc {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		
		System.out.println(DateFormatUtils.ISO_DATE_FORMAT.format(now));
		//2007-05-09
		
		System.out.println("MM/dd/yy HH:mm >>>" +
		          DateFormatUtils.formatUTC(System.currentTimeMillis(),
		              "MM/dd/yy HH:mm"));
		
		Date truncYear = DateUtils.truncate(now, Calendar.YEAR);
		Date truncMonth = DateUtils.truncate(now, Calendar.MONTH);
		
		System.out.println("Now : " + DateFormatUtils.ISO_DATETIME_TIME_ZONE_FORMAT.format(now));
		System.out.println("TruncYear : " + DateFormatUtils.ISO_DATETIME_TIME_ZONE_FORMAT.format(truncYear));
		System.out.println("TruncMonth : " + DateFormatUtils.ISO_DATETIME_TIME_ZONE_FORMAT.format(truncMonth));
		
		System.out.println("now: " + DateFormatUtils.ISO_DATETIME_TIME_ZONE_FORMAT.format(now));
		
		System.out.println("UTC Time: "
		        + DateFormatUtils
		            .formatUTC(now, DateFormatUtils.ISO_DATETIME_TIME_ZONE_FORMAT.getPattern()));
	}

}
