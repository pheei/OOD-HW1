package com.ood.project.ClassSchechule;


import java.io.Serializable;
import java.util.Date;


public class ClassRegister implements Serializable {
    private Date date;

    private int studentNumber;

    private String building;

    private String roomNumber;

    private boolean isEveryWeek;

    
    ClassRegister(Date date, int studentNumber, String building, String roomNumber, boolean isEveryWeek) {
        this.date = date;
        this.studentNumber = studentNumber;
        this.building = building;
        this.roomNumber = roomNumber;
        this.isEveryWeek = isEveryWeek;
    }

   
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("Date: ");
        sb.append(date.toString());
        sb.append(", Student Number: ");
        sb.append(studentNumber);
        sb.append(", Building: ");
        sb.append(building);
        sb.append(", Room Numer: ");
        sb.append(roomNumber);
        sb.append(", Is Every Week: ");
        sb.append(isEveryWeek);
        return sb.toString();
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