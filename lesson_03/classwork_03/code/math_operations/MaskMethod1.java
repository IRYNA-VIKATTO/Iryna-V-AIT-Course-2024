package math_operations;

public class MaskMethod1 {

    public static void main(String[] args) {



    // перевод евро в британский фунты

        double money = 100; // euro
        double BritishPounds = exchangeEuroToBritishPounds(money);
        System.out.println("BritishPounds: " + BritishPounds);


    // перевод евро в доллар

        double mone = 100; // euro
        double dollar = exchangeEuroToDollars(mone);
        System.out.println("Dollars: " + dollar);

    //перевод евро в юани
        double mon = 100; // euro
        double yuan = exchangeEuroToYuan(mon);
        System.out.println("Yuan: " + yuan);

    }//end of main

    private static double exchangeEuroToDollars(double money) {
        double rate = 1.11;
        return money * rate;
    }


    private static double exchangeEuroToBritishPounds(double money) {
        double rate = 0.84;
        return money * rate;

    }

    private static double exchangeEuroToYuan(double money) {
        double rate = 7.87;
        return money * rate;
    }



}