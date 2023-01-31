public class Main {
    public static void main(String[] args) {
        int age =32;
        double salary= 51_000;
        double wantedSum=300_000;
        double bidBase=0.1;
        int durationCredit=12;
        double bidClient=bidBase;

        if (age<23) {
            bidClient=bidBase+0.01;
        }
        else if (age<30&&age>=23) {
            bidClient=bidBase+0.05;
        }

        else if (salary>80_000) {
            bidClient=bidBase-0.7;}


        double maxPay=(wantedSum*bidClient+wantedSum)/durationCredit;
            System.out.println(maxPay);

        if (maxPay>salary/2) {
            System.out.println("Максимальный платеж при ЗП "+salary+"равен "+maxPay+"рублей. Платеж по кредиту "+wantedSum+".Отказано ");
        }else {
            System.out.println("Максимальный платеж при ЗП " + salary + "равен " + maxPay + "рублей. Платеж по кредиту " + wantedSum + ".Одобрено ");
    }}}
