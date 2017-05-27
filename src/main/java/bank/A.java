package bank;

import bank.model.Bank;
import bank.model.Klient;
import bank.model.Konto;

public class A {
    public static void main(String[] args) {
        Klient klient1 = new Klient();
        klient1.setId(1);
        klient1.setNazwisko("Abu Dabi");

        Klient klient2 =new Klient();
        klient2.setId(2);
        klient2.setNazwisko("Donald T");

        Konto konto1 = new Konto();
        konto1.setIdklienta(1);
        konto1.setStankonta(100);

        Konto konto2 = new Konto();
        konto2.setIdklienta(2);
        konto2.setStankonta(50);

        System.out.println(konto1);
        System.out.println(konto2);

        Bank bank = new Bank();
        bank.addClient(klient1);
        bank.addClient(klient2);

        System.out.println(bank.getKlienci());

        bank.createAccoutForClient(1);
        bank.createAccoutForClient(2);
        System.out.println(bank.getKonta());
        
    }
}
