package cn.happy.entity;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lenovo on 2017/9/17.
 */
@RestController
public class HelloWord {
        @RequestMapping(value = "/hello",method = RequestMethod.GET)
        public  String hello(){

         return  "Hello --------";
        }


}
