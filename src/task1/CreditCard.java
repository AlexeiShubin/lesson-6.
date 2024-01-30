package task1;

/**
 *  the class contains a “credit card” object,
 *  a constructor with two parameters and two methods
 *  that withdraw or credit money
 */
import java.util.Scanner;

public class CreditCard {
    Scanner scanner=new Scanner(System.in);
    long account_number;
    double balance_on_the_card;

    public CreditCard(long account_number, double balance_on_the_card){
        this.account_number=account_number;
        this.balance_on_the_card=balance_on_the_card;
    }

    public void add_money(){
        System.out.print("Сумма пополнения ");
        double amount_money= scanner.nextDouble();
        while(amount_money<=0){
            System.out.print("неверное количество денег, введите верное: ");
            amount_money= scanner.nextDouble();
        }
        balance_on_the_card+=amount_money;
        System.out.println("на счет "+ account_number+ " зачислено "+ amount_money+ "\n"+ "ваш баланс составляет " + balance_on_the_card+ " рублей");
    }

    public void cash_withdrawal(){
        System.out.print("Сумма снятия ");
        double withdrawal_amount= scanner.nextDouble();
        while(withdrawal_amount<=0){
            System.out.print("неверное количество денег, введите верное: ");
            withdrawal_amount= scanner.nextDouble();
        }
        if (withdrawal_amount>balance_on_the_card){
            System.out.print("на балансе недостаточно средств!");
        }else {
            balance_on_the_card -= withdrawal_amount;
            System.out.println("с вашего счета " + account_number + " снято " + withdrawal_amount + "\n" + "ваш баланс составляет " + balance_on_the_card + " рублей");
        }
    }

    public void Info(){
        System.out.println("номер счета "+ account_number+"\n баланс "+ balance_on_the_card);
        System.out.println();
    }


}

