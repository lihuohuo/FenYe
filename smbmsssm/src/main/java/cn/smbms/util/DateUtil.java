package cn.smbms.util;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by Mr.Gao on 2017/8/21.
 */
public class DateUtil {
    public static int calTwoTimeSpace(Date dateOne, Date dateTwo, int type)
  {
               int reVal = 0;
               int numOne = 0;
               int numTwo = 0;
               Calendar calOne = Calendar.getInstance();
               Calendar calTwo = Calendar.getInstance();
                calOne.setTime(dateOne);
                calTwo.setTime(dateTwo);
                numTwo = calTwo.get(type);
                numOne = calOne.get(type);
                reVal = numTwo - numOne;
                return reVal;
               }
}
