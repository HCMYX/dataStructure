package test.one;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateCheck {

	public static void main(String[] args) throws Exception {
		String date1="2017-1-1 00:00:00";
		String date2="2017-12-31 23:59:59";
//		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		System.out.println(isOneYear(sdf.parse(date1),sdf.parse(date2),1000));
		System.out.println(carTime(sdf.parse(date1),sdf.parse(date2)));

		//System.out.println(carTime2(sdf.parse(date1),sdf.parse(date2)));
	}
	
	/**
	 * flag=1 判断立即生效的情况起保日期终保日期
	 * flag=0 普通情况下起保日期终保日期
	 * @param startDate
	 * @param endDate
	 * @param flag
	 * @return
	 */
	public static Boolean carTime(Date startDate,Date endDate){
		Calendar startCal=Calendar.getInstance();
		Calendar endCal=Calendar.getInstance();
		startCal.setTime(startDate);
		endCal.setTime(endDate);
		
		int start_year =startCal.get(Calendar.YEAR);
		int start_month=startCal.get(Calendar.MONTH);
		int start_day=startCal.get(Calendar.DAY_OF_MONTH);
		int start_hour =startCal.get(Calendar.HOUR_OF_DAY); 
		int start_minute=startCal.get(Calendar.MINUTE);
		int start_second=startCal.get(Calendar.SECOND);
		
		int end_year =endCal.get(Calendar.YEAR); 
		int end_month=endCal.get(Calendar.MONTH);
		int end_day=endCal.get(Calendar.DAY_OF_MONTH);		
		int end_hour=endCal.get(Calendar.HOUR_OF_DAY);
		int end_minute=endCal.get(Calendar.MINUTE);
		int end_second=endCal.get(Calendar.SECOND);
		if ((start_year+1)!=end_year){
			if (start_year!=end_year||start_month!=0||end_month!=11||start_day!=1||end_day!=31) {
				return false;
			}
		}
		if (end_minute!=59||end_second!=59){
			if (end_hour!=23||end_hour!=(start_hour-1)) {
				return false;
			}
		}
		if (start_minute!=00||start_second!=00) {
			return false;
		}
		return true;
	}
	
	//start ---（end+l）是否为一整年
	public static Boolean isOneYear(Date start,Date end,long l){
		 Calendar startday = Calendar.getInstance();
	        Calendar endday = Calendar.getInstance();
	        startday.setTime(start);
	        endday.setTime(end);
	        if (startday.after(endday)) {
	            return false;
	        }
	        long sl = startday.getTimeInMillis();
	        long el = endday.getTimeInMillis();
	        el=el+l;
	        long days = ((el - sl) / (1000 * 60 * 60 * 24));
	        if (days == 365 || days == 366) {
	            if (startday.get(Calendar.MONTH) <= 1) {
	                startday.set(Calendar.MONTH, 1);
	                int lastDay = startday.getActualMaximum(Calendar.DAY_OF_MONTH);
	                return (lastDay == 28 && days == 365) || (lastDay == 29 && days == 366);
	            } else {
	                endday.set(Calendar.MONTH, 1);
	                int lastDay = endday.getActualMaximum(Calendar.DAY_OF_MONTH);
	                return (lastDay == 28 && days == 365) || (lastDay == 29 && days == 366);
	            }
	        } else {
	            return false;
	        }
	}
	
	/**
	 * 校验两个时间年月日是否符合(商业险立即起保使用)
	 * @param startDate
	 * @param endDate
	 * @param flag
	 * @return
	 */
	public static Boolean carTime2(Date startDate,Date endDate){
		Calendar startCal=Calendar.getInstance();
		Calendar endCal=Calendar.getInstance();
		startCal.setTime(startDate);
		endCal.setTime(endDate);
		
		int start_year =startCal.get(Calendar.YEAR); 
		int start_month=startCal.get(Calendar.MONTH);
		int start_day=startCal.get(Calendar.DAY_OF_MONTH);
		
		int end_year =endCal.get(Calendar.YEAR); 
		int end_month=endCal.get(Calendar.MONTH);
		int end_day=endCal.get(Calendar.DAY_OF_MONTH);
		int end_hour=endCal.get(Calendar.HOUR_OF_DAY);
		if ((start_year+1)!=end_year){
			return false;
		}
		if (start_month!=end_month||start_day!=end_day) {
			return false;
		}
		if (end_hour!=23) {
			return false;
		}
		return true;
	}
}
