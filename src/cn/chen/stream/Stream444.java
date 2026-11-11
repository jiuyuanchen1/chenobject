package cn.chen.stream;

import cn.chen.errey.ErpFinanceAccountDetails;
import com.sun.deploy.util.StringUtils;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.*;
import java.util.stream.Collectors;

public class Stream444 {


    public static void main(String[] args) {

    /*    ErpFinanceAccountDetails erpFinanceAccountDetails1 =new ErpFinanceAccountDetails(BigDecimal.valueOf(0),BigDecimal.valueOf(675),"1","1");
        ErpFinanceAccountDetails erpFinanceAccountDetails2 =new ErpFinanceAccountDetails(BigDecimal.valueOf(675),BigDecimal.valueOf(0),"4","4");
        ErpFinanceAccountDetails erpFinanceAccountDetails3 =new ErpFinanceAccountDetails(BigDecimal.valueOf(0),BigDecimal.valueOf(225),"3","3");
        ErpFinanceAccountDetails erpFinanceAccountDetails4 =new ErpFinanceAccountDetails(BigDecimal.valueOf(225),BigDecimal.valueOf(0),"1","1");
        List<ErpFinanceAccountDetails> erpFinanceAccountDetailsList=new ArrayList<>();
        erpFinanceAccountDetailsList.add(erpFinanceAccountDetails1);
        erpFinanceAccountDetailsList.add(erpFinanceAccountDetails2);
        erpFinanceAccountDetailsList.add(erpFinanceAccountDetails3);
        erpFinanceAccountDetailsList.add(erpFinanceAccountDetails4);

        Map<String, List<ErpFinanceAccountDetails>> collect = erpFinanceAccountDetailsList.stream().collect(Collectors.groupingBy(ErpFinanceAccountDetails::getLedgerAccountid));

        collect.keySet().forEach((key)->{

            List<ErpFinanceAccountDetails> erpFinanceAccountDetails = collect.get(key);
            
        });*/

    /*    BigDecimal decimal=new BigDecimal(0);

        for (int i=0;i<5;i++)
        {
            BigDecimal debitAmount = new BigDecimal(1);;
            decimal =decimal.add(debitAmount);
        }
        System.out.println(decimal);*/
        Date createTime = new Date();




        //Date createTime = new Date();
        String format="";
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("MM月dd日");

         format = simpleDateFormat.format(createTime);
        System.out.println("ccccc"+format);


            List<String > a=new ArrayList<>();
            a.add("aaa");
             a.add("bbb");
            a.add("ccc");
            if(a.contains("aaa"))
            {
                System.out.println(6666);
            }
    }
}
