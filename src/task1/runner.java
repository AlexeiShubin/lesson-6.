package task1;

import java.util.Scanner;

public class runner {
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            CreditCard card1=new CreditCard(35426, 3243.65);
            CreditCard card2=new CreditCard(48367, 347.07);
            CreditCard card3=new CreditCard(48367, 5767.53);

            card1.Info();
            card2.Info();
            card3.Info();

            System.out.print("для пополнения счета card1 выберите 1, для снятия со счета выберите 0: ");
            byte add_or_withdrawal1=scanner.nextByte();
            while(add_or_withdrawal1!=1&&add_or_withdrawal1!=0){
                System.out.print("Введите верное число: ");
                add_or_withdrawal1= scanner.nextByte();
            }
            if(add_or_withdrawal1==1){
                card1.add_money();
            }else{
                card1.cash_withdrawal();
            }
            System.out.print("для пополнения счета card2 выберите 1, для снятия со счета выберите 0: ");
            byte add_or_withdrawal2=scanner.nextByte();
            while(add_or_withdrawal2!=1&&add_or_withdrawal2!=0){
                System.out.print("Введите верное число: ");
                add_or_withdrawal2= scanner.nextByte();
            }
            if(add_or_withdrawal2==1){
                card2.add_money();
            }else{
                card2.cash_withdrawal();
            }
            System.out.print("для пополнения счета card3 выберите 1, для снятия со счета выберите 0: ");
            byte add_or_withdrawal3=scanner.nextByte();
            while(add_or_withdrawal3!=1&&add_or_withdrawal3!=0){
                System.out.print("Введите верное число: ");
                add_or_withdrawal3= scanner.nextByte();
            }
            if(add_or_withdrawal3==1){
                card3.add_money();
            }else{
                card3.cash_withdrawal();
            }

            card1.Info();
            card2.Info();
            card3.Info();

    }
}
