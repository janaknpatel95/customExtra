package org.example;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTag;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;

public class Hello extends SimpleTagSupport {
    @Override
    public void doTag() throws JspException, IOException {
        super.doTag();
        JspWriter out = getJspContext().getOut();




        int time1 = LocalTime.now().getHour();


        // isBefore() method
        if(time1 < 12) {
            out.println("Good Morning");
        }else if (time1 >= 12 && time1 < 17){
            out.println("Good Afternoon");

        }else if (time1 >= 17 && time1 <= 23){
            out.println("Good Evening");

        }else {
            out.println("THis si out");
        }

        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.of(2020, 12, 25);

//        // isAfter() method
//        if(date1.isAfter(date2)) {
//            System.out.println(date1 + " is after " + date2);
//        }
//
//        // isBefore() method
//        if(date1.isBefore(date2)) {
//            System.out.println(date1 + " is before " + date2);
//        }
        out.println(date1);
        // isEqual() method
        if(date1.isBefore(date2)) {
          out.println("Please wait holidays are coming");
      } else if(date1.isEqual(date2)) {
            out.println("Happy chrismas");
            //System.out.println(date1 + " is equal to " + date2);
        }else {
            out.println("this is not chrismas");
        }










//        LocalDate time = LocalDate.now();
//        out.println(time);
//
//        LocalTime time1 = LocalTime.now();
//        out.println(time1);
    }
}
