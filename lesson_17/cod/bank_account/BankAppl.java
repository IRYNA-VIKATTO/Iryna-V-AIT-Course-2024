package bank_account;

import bank_account.model.BankAccount;

public class BankAppl {

    public static void main(String[] args) {

        BankAccount account001 = new BankAccount(101L,"John Smith","Bank1",1,100);
        account001.display();

        //toString
        System.out.println(account001);

        BankAccount account002 = new BankAccount("Bank1",102L,"Pit Brosnan",1);

        BankAccount account003 = new BankAccount(103L,"Bank1",1,1000);
        account003.display();// null - это пустая ссылка она никуда не ведет


        account001.deposit(500);
        account001.display();

        account002.deposit(300);
        account002.display();
        System.out.println("========================================");
        account001.withdraw(500);
        account001.display();
        account001.withdraw(200);
        account001.display();
        account001.withdraw(100);
        account001.display();


    }
}
