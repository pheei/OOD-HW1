import java.text.ParseException;

public class Test {

	public static void main(String[] args) throws ParseException, BuilderException {
		// TODO Auto-generated method stub
		String input1 = "Date, February 17th, StudentNumber, 50, Building, Philip Hall, RoomNumber, B156, isEveryWeek, true";
		String input2 = "Date, February 17th, StudentNumber, 50, Building, Philip Hall, roomNumber, isEveryWeek, true";
		
		ClassRegisterBuilder builder = new ClassRegisterBuilder();
		ClassInfoParser parser = new ClassInfoParser(builder);
		parser.parse(input1);
		ClassRegister myClass = builder.build();
		
	}

}
