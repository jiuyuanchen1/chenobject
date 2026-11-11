package cn.chen.time;

import com.sun.xml.internal.ws.util.StringUtils;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class LocalTimeTest {
    /**
     *
     * 返回当月最后一天
     * */
    public static Date endMonthDay(Date monthDate)
    {
        // 将Date转换为LocalDate
        LocalDate carryoverLocalDate = monthDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        // 获取给定日期的月份的最后一天
        LocalDate lastDayOfMonth = carryoverLocalDate.with(TemporalAdjusters.lastDayOfMonth());
        Date lastDayOfMonthDate = Date.from(lastDayOfMonth.atStartOfDay(ZoneId.systemDefault()).toInstant());
        return lastDayOfMonthDate;
    }
    /**
     * 获取该月几号
     *
     * */
    public static Date getNumber( Date date,Integer number)
    {

        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        LocalDate newDate = LocalDate.of(localDate.getYear(), localDate.getMonth(), number);
        date = Date.from(newDate.atStartOfDay(ZoneId.systemDefault()).toInstant());

        return date;
    }
    // 获取一周前的时间
    public static Date getOneWeekBefore(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.WEEK_OF_YEAR, -1);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTime();
    }

    /**
     * 获取上个月的时间
     * @param startTime 格式为 "yyyy-MM"（例如 "2024-02"）
     * @return 返回格式为 "yyyy-MM"（例如 "2024-01"）
     */
    public static String getLastMonth(String startTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.parse(startTime + "-01", formatter); // 扩展为完整日期
        LocalDate lastMonth = date.minusMonths(1);
        return lastMonth.format(DateTimeFormatter.ofPattern("yyyy-MM")); // 返回格式为 "yyyy-MM"
    }

    /**
     * 获取给定时间区间的上阶段开始时间
     * @param startTime 格式为 "yyyy-MM"（例如 "2024-05"）
     * @param endTime 格式为 "yyyy-MM"（例如 "2024-07"）
     * @return 返回上阶段开始时间（例如 "2024-02"）
     */
    public static String getPreviousPeriod(String startTime, String endTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // 扩展为完整日期
        LocalDate startDate = LocalDate.parse(startTime + "-01", formatter);
        LocalDate endDate = LocalDate.parse(endTime + "-01", formatter);

        // 计算当前时间段的月份差
        int monthDifference = endDate.getYear() * 12 + endDate.getMonthValue() - (startDate.getYear() * 12 + startDate.getMonthValue()) + 1;

        // 计算上一个阶段的开始时间
        LocalDate previousPeriodStart = startDate.minusMonths(monthDifference ); // 减去当前阶段的月份数 + 1

        return previousPeriodStart.format(DateTimeFormatter.ofPattern("yyyy-MM")); // 返回格式化后的字符串
    }




    public static void main(String[] args) {
        Date[] timeEnd = {new Date()};
        System.out.println(timeEnd.length);
        System.out.println(timeEnd.length-1);
        System.out.println(  timeEnd[timeEnd.length-1]);

    /*            // 测试获取上个月
        String lastMonth = getLastMonth("2024-01");
        System.out.println("上个月: " + lastMonth); // 应该输出 "2024-01"

        // 测试获取时间区间前的时间
        String previousPeriod1 = getPreviousPeriod("2024-01", "2024-09");
        System.out.println("上阶段开始时间: " + previousPeriod1); // 应该输出 "2024-02"

        String previousPeriod2 = getPreviousPeriod("2024-01", "2024-09");
        System.out.println("上阶段开始时间: " + previousPeriod2); // 应该输出 "2023-11"
*/


        /*Date date = new Date();
        System.out.println(date);
        Date oneWeekBefore = getOneWeekBefore(date);
        System.out.println(oneWeekBefore);

        String num="001";
        int rt = Integer.parseInt(num);
        System.out.println(rt);
        BigDecimal a=new BigDecimal(6);
        BigDecimal b=new BigDecimal(50);
        System.out.println(a.multiply(b).setScale(2));
        System.out.println(a.multiply(b).multiply(new BigDecimal(0.01)).setScale(3,BigDecimal.ROUND_HALF_UP));
        BigDecimal agentAmount=new BigDecimal(BigInteger.ZERO);
        System.out.println(agentAmount);

        Integer d=6;
        System.out.println(a.subtract(new BigDecimal(6)));


        List<Integer> list=new ArrayList<>();
        for (int i=0;i<10;i++){
            list.add(i);
        }
        System.out.println(list.size());
        int size = list.size();
        for (Integer integer : list) {
            System.out.println(integer);
            if(size==1){
                System.out.println(6666);

            }
            size--;
        }
        BigDecimal bigDecimal=new BigDecimal(7);
        if(bigDecimal!=null&&bigDecimal.compareTo(BigDecimal.ZERO)!=0){
            System.out.println(bigDecimal);
        }*/

     /*   int excelSum=2;
        excelSum++;
        System.out.println(excelSum);
        excelSum=excelSum+1;
        System.out.println(excelSum);


        String testString="1,4,3,2,5,3";
        String[] split = testString.split(",",6);

        String testString1="";
        String[] split1 = testString1.split(",", -1);
        String testString2="";
        String[] split2 = testString2.split(",");
        System.out.println(6666);*/
/*

        Date date = new Date();
        Date date1 = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String format = simpleDateFormat.format(date1);
        System.out.println(format);
        try {
            simpleDateFormat.parse(format);
        } catch (ParseException parseException) {
            parseException.printStackTrace();
        }
        System.out.println(date);
        System.out.println(date1);

        System.out.println(date.compareTo(date1));
*/






       /* //当前日期
        LocalDate now = LocalDate.now();
        LocalDate localDate1 = now.minusMonths(1);
        LocalDate localDate = now.plusMonths(1).withDayOfMonth(1);
        System.out.println(localDate);
        System.out.println(now.toString());
        //指定日期
        LocalDate of = LocalDate.of(2023, 7, 27);
        System.out.println(of);
        //获取年
        int dayOfYear = of.getYear();
        //月
        int monthValue = of.getMonthValue();
        //日
        int dayOfMonth = of.getDayOfMonth();
        //是否闰年
        boolean leapYear = of.isLeapYear();
        DayOfWeek dayOfWeek = of.getDayOfWeek();
        int length = of.getMonth().length(leapYear);
        LocalTime now1 = LocalTime.now();
        System.out.println(now1);
        LocalTime of1 = LocalTime.of(13, 2, 59);
        System.out.println(of1);
        int hour = of1.getHour();
        int minute = of1.getMinute();
        int second = of1.getSecond();
        //结转


        LocalDateTime now2 = LocalDateTime.now();
        System.out.println(now2);
        LocalDateTime of2 = LocalDateTime.of(2021, 7, 21, 14, 31, 36);
        int year = of2.getYear();
        int monthValue1 = of2.getMonthValue();
        int dayOfMonth1 = of2.getDayOfMonth();
        int hour1 = of2.getHour();
        int minute1 = of2.getMinute();
        int second1 = of2.getSecond();
     //   boolean leapYear1 = of2.isLeapYear();

       // System.out.println(of2.getMonth().length());
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime parse = LocalDateTime.parse("2016-06-23 18:12:30", dateTimeFormatter);
        System.out.println(parse);*/

    }
}
