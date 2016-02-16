
public class Test {

	public static void main(String[] args) throws ParseException, BuilderException {
		// TODO Auto-generated method stub
		String input1 = "Date, February 17, StudentNumber, 50, Building, Philip Hall, RoomNumber, B156, isEveryWeek, true";
		String input2a = "StudentNumber, 50, Building, Philip Hall, RoomNumber, B156, isEveryWeek, true";
		String input2b = "Date, February 17";
		String input3 = "Date, February 17, Building, Philip Hall, RoomNumber, B156, isEveryWeek, true";

		//example for normally creating a new object
		ClassInfoParser parser1 = new ClassInfoParser(new ClassRegisterBuilder());
		parser1.parse(input1);
		ClassRegister class1 = parser1.getNewObject();
		System.out.println(class1);
		
		//example for creating a new object with seperate inputs
		ClassInfoParser parser2 = new ClassInfoParser(new ClassRegisterBuilder());
		parser2.parse(input2a);
		parser2.parse(input2b);
		ClassRegister class2 = parser2.getNewObject();
		System.out.println(class2);
		
		//example for creating a new object with check and validation (insert default minimal number for studentNumber varable when missing such this parameter)
		ClassInfoParser parser3 = new ClassInfoParser(new ClassRegisterBuilder());
		parser3.parse(input3);
		parser3.parse(input3);
		ClassRegister class3 = parser3.getNewObject();
		System.out.println(class3);
	}

}
