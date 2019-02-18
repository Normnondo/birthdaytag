package com.normnondo.customtags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.time.*;
import java.io.IOException;

public class HappyBirthdayTag extends SimpleTagSupport {
    LocalDate birthdate = LocalDate.of(2000, 2, 18);
    LocalDate today = LocalDate.now();
    MonthDay birthday = MonthDay.of(birthdate.getMonth(), birthdate.getDayOfMonth());
    MonthDay current = MonthDay.from(today);
    @Override
    public void doTag() throws JspException, IOException {
        super.doTag();
        JspWriter out = getJspContext().getOut();
        if (current.equals(birthday)) {
            out.println("Happy Birthday!");
        } else {
            out.println("Today is not your Birthday");
        }
    }
}
