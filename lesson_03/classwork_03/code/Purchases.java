public class Purchases {


    //Сделайте расчет покупки товаров со скидками.
    // Товар А стоит X евро и на него скидка D%, а товар B стоит Y евро и на него скидка С%.
    // Клиент взял N товаров A и M товаров B.
    // Если сумма покупки превысила 100 евро, то полагается дополнительная скидка 5%.
    // Вычислите итоговую стоимость покупки и величину полученной скидки.

    public static void main(String[] args) {

        double  x = 20; // euro
        double y = 15; // euro
        double n = 3;//stuk
        double m = 5;// stuk
        double d = 1; // %
        double c = 3;// %

        double res;
        double resul;

        if (( x*n*(100-d)/100+y*m*(100-c)/100)>100){
            res = ( x*n*(100-d)/100+y*m*(100-c)/100)*(100-5)/100;

            System.out.println(" Если сумма покупки превысила 100 евро, то = "+ res);



        }else {
            res = ( x*n*(100-d)/100+y*m*(100-c)/100);

            System.out.println("Если сумма покупки  непревысила 100 евро, то ="+ res);

        }

        resul = 100-res/(x*n+y*m)*100;
        System.out.println("общий процент скидки ="+ resul);
    }
}
