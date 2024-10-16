package classwork_25.regex_appl;

public class RegexAppl {

    public static void main(String[] args) {

        String text = " Java";
        String pattern = " *(J|j)ava([1-9]|[1-9][0-9])?";

        boolean checker = text.matches(pattern);
        System.out.println(checker);

        System.out.println("-----------------------");

        //domain
        String domain = "A-b-r.a-kadabra.com";
        pattern = "((\\w(-|\\.|\\w)*\\w)|\\w)\\.(com|org|de|il)";
        checker = domain.matches(pattern);
        System.out.println(checker);

        // e-mail
        /*
    1) @ exists and only one (done)
    2) dot after @ (done)
    3) after last dot 2 or more symbols (done)
    4) alphabetic, digits, '_', '-', '.', '@' (done)
    */

        System.out.println("----------------------------------------------------------");
        String email = "peter@mail.Co";
        pattern = "((\\w(-|\\.|\\w)*\\w)|\\w)@[a-zA-Z0-9](\\w|-|\\.)*\\.[A-Za-z]{2,6}";
        checker = email.matches(pattern);
        System.out.println(checker);


        System.out.println("-----------------------------------------------------------");
        String creditCardNumber = "123456789123";
        pattern = "^\\d{8,16}$";
        checker = creditCardNumber.matches(pattern);
        System.out.println(checker);


        System.out.println("-----------------------------------------------------------");
        String dateDDMMYYYY = "25.12.2024";
        pattern ="^([0-2][0-9]|3[01])\\.(0[1-9]|1[0-2])\\.\\d{4}$";
        checker = dateDDMMYYYY.matches(pattern);
        System.out.println(checker);

        System.out.println("-----------------------------------------------------------");
        String dateYYYYMMDD = "2024-12-25";
        pattern = "^\\d{4}-(0[1-9]|1[0-2])-(0[1-9]|[12][0-9]|3[01])$";
        checker = dateYYYYMMDD.matches(pattern);
        System.out.println(checker);


        System.out.println("-----------------------------------------------------------");
        String numberLessThan255 = "128";
        pattern = "^([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$";  // Number <= 255
        checker = numberLessThan255.matches(pattern);
        System.out.println(checker);


        System.out.println("-----------------------------------------------------------");
        String phoneNumber = "+12(34)5678-1234";
        pattern = "^\\+\\d{2}\\(\\d{2}\\)\\d{4}-\\d{4}$";
        checker = phoneNumber.matches(pattern);
        System.out.println(checker);









    }
}
