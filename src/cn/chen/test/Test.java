package cn.chen.test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author chen
 */
public class Test {
    public static void main(String[] args) {
       /* SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd");
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH, 0);
        String da= dateFormat.format(calendar.getTime());
        System.out.println(da);*/
        // 获取当前路径
   /*     File directory = new File("");//设定为当前文件夹
        String dirPath = directory.getAbsolutePath();//获取绝对路径
        Process proc;
        try {
            // python解释器路径
            String pyPath = "C:\\Users\\chen\\AppData\\Local\\Programs\\Python\\Python310\\python.exe";
            // python脚本文件路径
            String pyFilePath = dirPath+ "/test.py";
            System.out.println(pyFilePath);
            // 传给python的参数
            String argv1 = "一人之下";
            proc = Runtime.getRuntime().exec(pyPath + " "+ pyFilePath + " " +argv1);
            proc.waitFor();
        }catch (Exception e){
            e.printStackTrace();
        }*/
        /*catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/


        String prostuNum="2025252525252525250006";
        String school="525";
        int i = prostuNum.indexOf(525);
        System.out.println(6666);
        //prostuNum.substring(0,prostuNum.indexOf(school.getSchoolCode()))
        //Long sxsortLong = Long.valueOf(prostuNum.substring(prostuNum.indexOf(school.getSchoolCode())+school.getSchoolCode().length()))+1;
        System.out.println("第一次提交");
        System.out.println("第二次提交");



    }
}