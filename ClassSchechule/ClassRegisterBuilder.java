package com.ood.project.ClassSchechule;

import java.util.Calendar;
import java.util.Date;

public class ClassRegisterBuilder {
	public static final int MINSTUDENTNUM = 5;

    protected Date date = null;

    protected int studentNumber;
    
    protected String building;

    protected String roomNumber;

    protected boolean isEveryWeek;

    
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

  
    
    
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getBuilding() {
		return building;
	}

	public void setBuilding(String building) {
		this.building = building;
	}

	public String getRoomNumer() {
		return roomNumber;
	}

	public void setRoomNumer(String roomNumer) {
		this.roomNumber = roomNumer;
	}

	public boolean isEveryWeek() {
		return isEveryWeek;
	}

	public void setEveryWeek(boolean isEveryWeek) {
		this.isEveryWeek = isEveryWeek;
	}

	
}
