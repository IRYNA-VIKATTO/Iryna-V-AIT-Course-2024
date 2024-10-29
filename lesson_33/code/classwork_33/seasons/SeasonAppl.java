package classwork_33.seasons;

public class SeasonAppl {
//Задать ENUM seasons - времена года (Summer, Autumn, Winter, Spring)
//Опробовать на нем методы:
//.VALUES()
//.toString
//.ordinal()
//.valueOf()
    public static void main(String[] args) {

        Season[] seasons = Season.values();
        System.out.println("-------values of Enum_____________");
        for (int i = 0; i < seasons.length; i++) {
            System.out.println(seasons[i]);
            System.out.println(seasons[i].getName() + " : " + seasons[i].getName());
        }
        System.out.println("__________________________________");
        //for each
        for (Season s : seasons){
            System.out.println(s.getName());
            System.out.println(s.getDuration());
        }
        System.out.println("_____________toString()_____________________");
        String str = Season.AUTUMN.toString();
        System.out.println(str);

        System.out.println("_____________ordinal()_____________________");

        int num = Season.AUTUMN.ordinal();
        System.out.println(num);
        num = Season.WINTER.ordinal();
        System.out.println(num);

        System.out.println("_____________valueOf()_____________________");

        Season s = Season.valueOf("SUMMER");
        System.out.println(s);

    }

}
