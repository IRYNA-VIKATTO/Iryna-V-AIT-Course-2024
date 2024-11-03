package classwork_34.time_api_exercises;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.zip.DataFormatException;

public class TimeAppl {

    public static void main(String[] args) {

        // How much time ?-ISO format: YYYY-mm-DD
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        System.out.println("----------------------------------------");

        LocalDate gagarin = LocalDate.of(1961,04,12);
        System.out.println(gagarin);// ISO
        //какой день недели?
        System.out.println(gagarin.getDayOfWeek());

        System.out.println("----------------------------------------");

        //Какой это был день года?
        System.out.println(gagarin.getDayOfYear());

        System.out.println("----------------------------------------");

        LocalDate irina = LocalDate.of(1971,10,13);
        System.out.println(irina);// ISO
        //какой день недели?
        System.out.println(gagarin.getDayOfWeek());

        System.out.println("---------------Is leap year?-------------------------");

        int year = 2024;
        System.out.println("Is year " + year + "leap:" + Year.isLeap(year));

        System.out.println("----------------------------------------");

        System.out.println(gagarin.isBefore(localDate));
        System.out.println(gagarin.isAfter(localDate));
        System.out.println("____________________________________________________");
        long days = ChronoUnit.DAYS.between(irina,localDate);
        System.out.println(days);
        long years = ChronoUnit.YEARS.between(irina,localDate);
        System.out.println(years);

        System.out.println("____________________________________________________");
        DateTimeFormatter df = DateTimeFormatter.ISO_LOCAL_DATE;//YYYY-mm-DD
        String date = gagarin.format(df);//LocalDate to String
        System.out.println(date);

        //выбираем другой формат
        df = DateTimeFormatter.BASIC_ISO_DATE;
        date = gagarin.format(df);
        System.out.println(date);

        // задаем другой, собственный формат строки с датой
        System.out.println("--------------------------------------------------");
        df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        date = gagarin.format(df);
        System.out.println(date);

        // задаем другой, собственный формат строки с датой
        System.out.println("--------------------------------------------------");
        df = DateTimeFormatter.ofPattern("dd/MMMM/YYYY"); // делаем разные форматы
        date = gagarin.format(df);
        System.out.println(date);

        // задаем locale
        df = DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALIAN);
        date = gagarin.format(df);
        System.out.println(date);

        // parsing LocalDate from String
        System.out.println("//////////////////////////////////////////////////");
        String stringDate = "01:12-2024";
        LocalDate result = LocalDate.parse(stringDate, DateTimeFormatter.ofPattern("[dd:MM:yyyy][dd/MM/yyyy][dd-MM-yyyy][dd:MM-yyyy]"));
        System.out.println(result); // ISO format

        System.out.println("-----------------------------------------");

        String diannaBirthday = "23.06.1983";
        LocalDate dianaBirt = LocalDate.parse(diannaBirthday, DateTimeFormatter.ofPattern("[dd.MM.yyyy]"));
        System.out.println(dianaBirt);

        df = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.FRANCE);
        String d = dianaBirt.format(df);
        System.out.println(d);


    }
}
