package top.birdguo.algorithm.problem19;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Problem19 {

	/**
	 * 将短时间格式字符串转换为时间 yyyy-MM-dd
	 *
	 * @param strDate
	 * @return
	 */
	public static Date strToDate(String strDate) {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		ParsePosition pos = new ParsePosition(0);
		Date strtodate = formatter.parse(strDate, pos);
		return strtodate;
	}

	/**
	 * 根据一个日期，返回是星期几的字符串
	 *
	 * @param sdate
	 * @return
	 */
	public static boolean isWeekDay(String sdate, int weekday) {
		boolean isWeekDay = false;
		// 再转换为时间
		Date date = strToDate(sdate);
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		int hour = c.get(Calendar.DAY_OF_WEEK);
		// hour中存的就是星期几了，其范围 1~7
		// 1=星期日 7=星期六，其他类推
		if (hour == weekday) {
			isWeekDay = true;
		}

		return isWeekDay;
	}

	public static int judgeDate() {

		int count = 0;
		for (int i = 0; i < 100; i++) {
			int year = 1901 + i;
			for (int j = 1; j <= 12; j++) {
				String sdate = year + "-" + j + "-1";
				if (isWeekDay(sdate, 1)) {

					System.out.println(sdate);

					count++;
				}
			}
		}

		return count;
	}

	public static void main(String[] args) {
		System.out.println(judgeDate());
		
//		System.out.println(isWeekDay("2000-5-1", 2));
	}

}
