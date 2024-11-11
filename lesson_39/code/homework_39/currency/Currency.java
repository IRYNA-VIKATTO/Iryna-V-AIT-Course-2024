package homework_39.currency;

public enum Currency {

    USD(1.08), // курс доллара к евро
    GBP(0.85), // курс фунта стерлингов к евро
    JPY(144.0), // курс йены к евро
    RUB(92.5), // курс рубля к евро
    CHF(0.95); // курс швейцарского франка к евро

    private final double rateToEuro;

    Currency(double rateToEuro) {
        this.rateToEuro = rateToEuro;
    }

    public double getRateToEuro() {
        return rateToEuro;
    }
}
