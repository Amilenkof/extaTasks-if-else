public class Main {
    public static void main(String[] args) {
        int age= 9;
        double salary= 20000;
        double creditLimit ;
        if (age>=23) {creditLimit=salary*3;}
        else {creditLimit=salary*2;}

        if (salary>=50_000 && salary<80_000) {creditLimit=creditLimit*1.2;}

        else if  (salary>80_000){ creditLimit=creditLimit*1.3;}

        System.out.println("кредитный лимит"+creditLimit);
    }}