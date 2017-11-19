package cn.happy.controlller09inniBinder;


import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * Created by Happy on 2017-08-28.
 */

public class FirstController {
    @InitBinder
    public void initBinder (WebDataBinder binder) {
        // 一个类的类型的三种方式
      //  Class<?> clazz=FirstController.class;


        /*FirstController firstController=new FirstController();
        Class<?> clazz= firstController.getClass();*/

        //jdbc
        //Class<?> clazz=Class.forName("xxxx");
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd");
        /*binder.registerCustomEditor(Date.class,new CustomDateEditor(sdf,true));*/

        binder.registerCustomEditor(Date.class,new MyDateEditor());

    }


}
