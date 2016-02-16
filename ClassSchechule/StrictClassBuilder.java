package com.ood.project.ClassSchechule;

import java.util.Calendar;
import java.util.Date;

public class StrictClassBuilder extends ClassBuilder{
	public ClassRegister build() throws BuilderException {
        
		if (date == null)
		    throw new BuilderException("Valid date not found");

		if (building == null)
		    throw new BuilderException("Valid city not found");

		if (studentNumber < MINSTUDENTNUM)
		    throw new BuilderException("Minimum headcount is " + MINSTUDENTNUM);
	
        return new ClassRegister(date, studentNumber, building, roomNumber, isEveryWeek);
       
    }
	
}

