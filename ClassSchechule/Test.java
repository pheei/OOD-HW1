package com.ood.project.ClassSchechule;

import java.text.ParseException;

public class Test {

	public static void main(String[] args) throws ParseException, BuilderException {
		// TODO Auto-generated method stub
		String input1 = "Date, February 17, StudentNumber, 50, Building, Philip Hall, RoomNumber, B156, isEveryWeek, true";
		String input2a = "StudentNumber, 50, Building, Philip Hall, RoomNumber, B156, isEveryWeek, true";
		String input2b = "Date, February 17";
		String input3 = "Date, February 17, Building, Philip Hall, RoomNumber, B156, isEveryWeek, true";
		String input4 = "Building, Philip Hall, RoomNumber, B156, isEveryWeek, true";

		
		ClassInfoParser parser1 = new ClassInfoParser(new ForgivingClassBuilder());
		parser1.parse(input1);
		ClassRegister class1 = parser1.getNewObject();
		System.out.println(class1);
		
		
		ClassInfoParser parser2 = new ClassInfoParser(new ForgivingClassBuilder());
		parser2.parse(input2a);
		parser2.parse(input2b);
		ClassRegister class2 = parser2.getNewObject();
		System.out.println(class2);
		
		ClassInfoParser parser3 = new ClassInfoParser(new ForgivingClassBuilder());
		parser3.parse(input3);
		parser3.parse(input3);
		ClassRegister class3 = parser3.getNewObject();
		System.out.println(class3);
		
		ClassInfoParser parser4 = new ClassInfoParser(new ForgivingClassBuilder());
		parser4.parse(input4);
		ClassRegister class4 = parser4.getNewObject();
		System.out.println(class4);
	}

}
