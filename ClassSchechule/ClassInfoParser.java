package com.ood.project.ClassSchechule;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

public class ClassInfoParser {
	private ForgivingClassBuilder builder;

    public ClassInfoParser(ForgivingClassBuilder builder) {
        this.builder = builder;
    }

 
    public ClassRegister getNewObject() throws BuilderException{
    	return builder.build();
    }
    
    
    public void parse(String s) throws ParseException {
        String[] tokens = s.split(",\\s*");
        for (int i = 0; i < tokens.length; i += 2) {
            String type = tokens[i];
            String val = tokens[i + 1];

            if ("date".compareToIgnoreCase(type) == 0) {
                Calendar now = Calendar.getInstance();
                DateFormat formatter = DateFormat.getDateInstance();
                Date d = formatter.parse(val + ", " + now.get(Calendar.YEAR));
                builder.setDate(StrictClassBuilder.futurize(d));
            } else if ("studentnumber".compareToIgnoreCase(type) == 0) 
                builder.setStudentNumber(Integer.parseInt(val));
            else if ("building".compareToIgnoreCase(type) == 0)
                builder.setBuilding(val.trim());
            else if ("roomnumber".compareToIgnoreCase(type) == 0) 
                builder.setRoomNumer(val.trim());
            else if ("iseveryweek".compareToIgnoreCase(type) == 0)
                builder.setEveryWeek(val.equalsIgnoreCase("true"));
        }
    }
    
    
}
