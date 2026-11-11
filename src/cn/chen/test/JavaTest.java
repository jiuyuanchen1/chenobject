package cn.chen.test;

import javax.xml.crypto.Data;
import java.io.File;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.WeekFields;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaTest {

    public static void main(String[] args) {
        // 示例测试
        System.out.println(getWeekNumber("2024-03-04"));  // 输出 2024-03-02
//        System.out.println(getWeekNumber("2024-03-10"));  // 输出 2024-03-02
//        System.out.println(getWeekNumber("2024-02-28"));  // 输出 2024-03-01
        //System.out.println(getWeekNumber("2024-03-31"));  // 假设31日是周日，输出 2024-03-05

        String paramDate="2024-03-01";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        // 将字符串解析为LocalDate对象
        LocalDate date = LocalDate.parse(paramDate, formatter);
        // 获取传入时间是当年的第几周
        int weekOfYear = date.get(WeekFields.of(Locale.getDefault()).weekOfYear());
        System.out.println(weekOfYear);


    }

    public static String getWeekNumber(String startTime) {
        // 解析日期字符串为LocalDate对象
        LocalDate date = LocalDate.parse(startTime, DateTimeFormatter.ISO_LOCAL_DATE);

        // 找到该日期所在周的最后一天（假设以周日为最后一天）
        LocalDate lastDayOfWeek = date.with(TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY));

        // 确定目标年月（根据周的最后一天的月份）
        YearMonth targetYearMonth = YearMonth.from(lastDayOfWeek);

        // 计算周的最后一天在目标月中的第几天
        int dayOfMonth = lastDayOfWeek.getDayOfMonth();

        // 计算周数：天数除以7，向上取整
        int weekNumber = (int) Math.ceil(dayOfMonth / 7.0);

        // 格式化周数为两位字符串
        String formattedWeek = String.format("%02d", weekNumber);

        // 拼接结果字符串
        return targetYearMonth.format(DateTimeFormatter.ofPattern("yyyy-MM")) + "-" + formattedWeek;
    }
}
