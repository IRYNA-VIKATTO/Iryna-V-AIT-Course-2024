public class MaskMethod {

    // перевод доллар в евро

    public static void main(String[] args) {
    double money = 500; // dollars
     double euro = exchangeDollarsToEuro(money);
        System.out.println("Euro: " + euro);

        // количество съеденных колорий
        double weight = 200;//
        double calorage = 50;//caloie on 100 gramm

        double energy = calculateCalorie(weight, calorage);
        System.out.println("Полученные калории = " + energy);

    }// end of main

    private static double calculateCalorie(double weight , double calorage){
        return weight * calorage / 100;

    }




    private static double exchangeDollarsToEuro(double money){
        double rate = 0.9;
        return money*rate;

    }

}// end of class
