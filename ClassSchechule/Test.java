<<<<<<< HEAD
package com.ood.project.ClassSchechule;

import java.text.ParseException;
=======
>>>>>>> origin/master

public class Test {

	public static void main(String[] args) throws ParseException, BuilderException {
		// TODO Auto-generated method stub
		String input1 = "Date, February 17, StudentNumber, 50, Building, Philip Hall, RoomNumber, B156, isEveryWeek, true";
		String input2a = "StudentNumber, 50, Building, Philip Hall, RoomNumber, B156, isEveryWeek, true";
		String input2b = "Date, February 17";
		String input3 = "Date, February 17, Building, Philip Hall, RoomNumber, B156, isEveryWeek, true";
		String input4 = "Building, Philip Hall, RoomNumber, B156, isEveryWeek, true";

<<<<<<< HEAD
		
		ClassInfoParser parser1 = new ClassInfoParser(new ForgivingClassBuilder());
=======
		//example for normally creating a new object
		ClassInfoParser parser1 = new ClassInfoParser(new ClassRegisterBuilder());
>>>>>>> origin/master
		parser1.parse(input1);
		ClassRegister class1 = parser1.getNewObject();
		System.out.println(class1);
		
<<<<<<< HEAD
		
		ClassInfoParser parser2 = new ClassInfoParser(new ForgivingClassBuilder());
=======
		//example for creating a new object with seperate inputs
		ClassInfoParser parser2 = new ClassInfoParser(new ClassRegisterBuilder());
>>>>>>> origin/master
		parser2.parse(input2a);
		parser2.parse(input2b);
		ClassRegister class2 = parser2.getNewObject();
		System.out.println(class2);
		
<<<<<<< HEAD
		ClassInfoParser parser3 = new ClassInfoParser(new ForgivingClassBuilder());
		parser3.parse(input3);
=======
		//example for creating a new object with check and validation (insert default minimal number for studentNumber varable when missing such this parameter)
		ClassInfoParser parser3 = new ClassInfoParser(new ClassRegisterBuilder());
>>>>>>> origin/master
		parser3.parse(input3);
		ClassRegister class3 = parser3.getNewObject();
		System.out.println(class3);
		
<<<<<<< HEAD
		ClassInfoParser parser4 = new ClassInfoParser(new ForgivingClassBuilder());
=======
		//example for throwing corresponding exceptions when required information missing
		ClassInfoParser parser4 = new ClassInfoParser(new ClassRegisterBuilder());
>>>>>>> origin/master
		parser4.parse(input4);
		ClassRegister class4 = parser4.getNewObject();
		System.out.println(class4);
	}

}
