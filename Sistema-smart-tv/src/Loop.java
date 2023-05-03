public class Loop {
    public static void main(String[] args) {
        calcularDividaExponencial();
    }

    public static double calcularDividaExponencial(){
        double installmentValue =50.0;
        double AmontValue = 0.0;

        for(int x =1; x<=5; x++){
            double calculatedValue = installmentValue *x;
            AmontValue = AmontValue + calculatedValue;
        }

        return AmontValue;
    }
}
