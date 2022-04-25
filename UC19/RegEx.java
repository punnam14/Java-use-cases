package Assignment19;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
    private Matcher matcher;
    private Pattern pattern;

    public static boolean firstName( String firstName ) {
        if(firstName.matches( "[A-Z][a-z]*" ))
            System.out.println("Valid First Name");
        else
            System.out.println("Invalid First name");
        return firstName.matches( "[A-Z][a-z]*");
    }

    public static boolean lastName( String lastName ) {
        if(lastName.matches( "[A-Z][a-z]*" ))
            System.out.println("Valid Last Name");
        else
            System.out.println("Invalid Last name");
        return lastName.matches( "[A-Z][a-z]*");
    }

    public static boolean Email_validator(String email){
        Pattern pattern = Pattern.compile("(\\w+)@[a-z]+(\\.[a-z]+)?\\.[a-z]{2,3}(\\.[a-z]{2})?");
        Matcher matcher = pattern.matcher(email);
        Boolean matchFound = matcher.matches();
        if(matchFound)
            System.out.println("Correct Email Format");
        else
            System.out.println("Wrong Email Format");
        return matchFound;
   }

    public static boolean Number( String number ) {
        if(number.matches( "\\+?\\d{2,3}\\s?-?\\d{10}" ))
            System.out.println("Valid Phone number");
        else
            System.out.println("Invalid Phone number");
        return number.matches( "\\+?\\d{2,3}\\s?-?\\d{10}");
    }

    public static boolean Password( String password ) {
        if(password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$"))
            System.out.println("Valid Password");
        else
            System.out.println("Invalid Password");
        return password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$");
    }

    public static void main(String[] args) {
        firstName("Jova");
        lastName("Ferrari");
        Email_validator("stdio_2055@gmail.com.org");
        Number("+918893658275");
        Password("thIsis0*Pass");
    }
}

  //
