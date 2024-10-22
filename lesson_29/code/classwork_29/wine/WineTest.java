package classwork_29.wine;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class WineTest {

    Wine[] wines;



    @BeforeEach
    void setUp() {

        wines = new Wine[5];
        wines[0] = new Wine("type1", "AAA",2021,6);
        wines[1] = new Wine("type2", "CCC",2024,3);
        wines[2] = new Wine("type3", "XXX",2022,5);
        wines[3] = new Wine("type1", "OOO",2015,7);
        wines[4] = new Wine("type2", "SSS",2000,20);

    }

    @Test
    void sortWineByAgeTest(){
        System.out.println("________List wine as is ________");
        printWines();
        Arrays.sort(wines);
        System.out.println("________List wine sorted  by age ________");
        printWines();

    }

    @Test
    void sortWineByPriceTest(){

        Comparator<Wine>comparatorByPrice = new Comparator<Wine>(){

            @Override
            public int compare(Wine w1, Wine w2) {
                return Double.compare(w1.getPrice(),w2.getPrice());
            }
        };

        System.out.println("________List wine as is ________");
        printWines();
        Arrays.sort(wines,comparatorByPrice);
        System.out.println("________List wine sorted  by price ________");
        printWines();
    }

    @Test
    void sortWineByTitleTest(){

        Comparator<Wine>comparatorByTitle = new Comparator<Wine>() {
            @Override
            public int compare(Wine w1, Wine w2) {
                return w1.getTitle().compareTo(w2.getTitle());
            }
        };
        System.out.println("________List wine as is ________");
        printWines();
        Arrays.sort(wines,comparatorByTitle);
        System.out.println("________List wine sorted  by Title ________");
        printWines();


    }

    @Test
    void printWines(){

        for (int i = 0; i < wines.length; i++) {
            System.out.println(wines[i]);

        }
    }


}