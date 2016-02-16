package com.ood.project.ClassSchechule;

import java.util.Calendar;
import java.util.Date;


public class ForgivingClassBuilder extends ClassBuilder{

	public static Date futurize(Date inDate) {
        Calendar now = Calendar.getInstance();
        Calendar then = Calendar.getInstance();
        then.setTime(inDate);
        
        while (then.before(now)) 
            then.add(Calendar.YEAR, 1);
        
        return then.getTime();
    }

    public ClassRegister build() throws BuilderException {
        boolean noStudentNumber = (studentNumber == 0);

        if (noStudentNumber) {
        	studentNumber = 0;
        }

        check();
        
        return new ClassRegister(date, studentNumber, building, roomNumber, isEveryWeek);
        

    }


    protected void check() throws BuilderException {
        if (date == null)
            throw new BuilderException("Valid date not found");

        if (building == null)
            throw new BuilderException("Valid city not found");

        if (studentNumber < MINSTUDENTNUM)
            throw new BuilderException("Minimum headcount is " + MINSTUDENTNUM);

    }
}
