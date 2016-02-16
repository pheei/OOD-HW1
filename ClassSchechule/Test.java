import java.text.ParseException;

public class Test {

	public static void main(String[] args) throws ParseException, BuilderException {
		// TODO Auto-generated method stub
		String input1 = "Date, February 17, StudentNumber, 50, Building, Philip Hall, RoomNumber, B156, isEveryWeek, true";
		String input2 = "StudentNumber, 50, Building, Philip Hall, RoomNumber, B156, isEveryWeek, true";
		
		//successfully create object with String input1
		ClassRegisterBuilder builder1 = new ClassRegisterBuilder();
		ClassInfoParser parser1 = new ClassInfoParser(builder1);
		parser1.parse(input1);
		ClassRegister myClass1 = builder1.build();
		System.out.println(myClass1);
		
		//inform user "Valid date not found" exception
		ClassRegisterBuilder builder2 = new ClassRegisterBuilder();
		ClassInfoParser parser2 = new ClassInfoParser(builder2);
		parser2.parse(input2);
		//ClassRegister myClass2 = builder2.build();
		//System.out.println(myClass2);
		
		//example for input data is not complete at the beginning. the builder will create object after receiveing all the required parameters.
		String input3 = "Date, February 17";
		parser3.parse(input3);
		ClassRegister myClass2 = builder2.build();
		System.out.println(myClass2);


	}

}
