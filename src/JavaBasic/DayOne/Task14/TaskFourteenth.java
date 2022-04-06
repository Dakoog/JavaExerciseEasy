package JavaBasic.DayOne.Task14;

import java.util.Scanner;

/*
Napisz program, który na podstawie zmiennych kwota double oraz ilość rat int obliczał
będzie miesięczną kwotę raty pożyczki, a następnie wypisywał ją w konsoli.
Parametry posiadają, pewne ograniczenia, które powinieneś uwzględnić w programie
a) kwota pożyczki musi mieścić się w przedziale od 100 00 zł do 10 000 00 zł
b)liczba rat musi mieścić się w przedziale od 6 do 48
c) w przypadku wykroczenia kwoty pożyczki poza akceptowalny przedział, kwota pożyczki
powinna być ustawiona na 5 000 00 zł W przypadku podania zbyt małej kwoty, kwota pożyczki
powinna być ustawiona na 1000 00 zł
d) W przypadku wykroczenia ilości rat poza akceptowalny przedział, ilość rat powinna być
ustawiona na 36 W przypadku podania zbyt małej ilości, ilość rat powinna być ustawiona na 18.
Obliczona miesięczna rata powinna zawierać również odsetki.
Dla uproszczenia przyjmij, że do kwoty pożyczki doliczasz x procent w zależności od ilości rat:
6-12 rat -> 2,5%
13-24 rat->5,0%
25=48 rat->10,0
a następny krok to obliczenie kwoty raty na podstawie ilości rat
    */
public class TaskFourteenth {
    private static final double LOW_INTEREST_RATE = 1.025;
    private static final double HiGH_INTEREST_RATE = 1.1;
    private static final double AVERAGE_INTEREST_RATE = 1.05;
    private static final Scanner INPUT = new Scanner(System.in);
  


    public static void main(String[] args) {

        System.out.println("the amount of your monthly loan installment is "+amountOfMonthlyLoanInstallment()+" PLN.");
    }
    private static int getNumberOfInstallments(){
        System.out.println("Please insert number of installments for your loan.");
        return INPUT.nextInt();
    }
    private static double getLonaAmount(){
        System.out.println("Please insert amount of the loan.");
        return INPUT.nextDouble();
    }
    private static double loanAmount(){
        double cash = getLonaAmount();
        if(cash>10000 ){
            cash = 5000;
        }
        if(cash<100){
            cash =1000;
        }

        return cash;
    }
    private static int calculateNumberOfInstallments(){
        int numberOfInstallments = getNumberOfInstallments();
        if(numberOfInstallments>48){
            numberOfInstallments = 36;
        }
        if(numberOfInstallments<6){
            numberOfInstallments = 18;
        }
        return numberOfInstallments;
    }
    private static double amountOfMonthlyLoanInstallment( )
    {
        double cash = loanAmount();
       int numberOfInstallemts = calculateNumberOfInstallments();
        if(numberOfInstallemts>=25){
            return Math.round(100*cash* HiGH_INTEREST_RATE /numberOfInstallemts)/100d;
        }
        if(numberOfInstallemts>=13){
            return Math.round(100*cash* AVERAGE_INTEREST_RATE /numberOfInstallemts)/100d;
        }
        if(numberOfInstallemts>=6){
            return Math.round(100*cash* LOW_INTEREST_RATE /numberOfInstallemts)/100d;
        }
      return cash;

    }
}


