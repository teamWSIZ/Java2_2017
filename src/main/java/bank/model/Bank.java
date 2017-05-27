package bank.model;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Klient> klienci;
    private List<Konto> konta;
    int nastepnyNrKonta;

    public Bank() {
        klienci = new ArrayList<>();
        konta = new ArrayList<>();
        nastepnyNrKonta = 1;
    }

    public void addClient(Klient k) {
        klienci.add(k);
    }

    public void createAccoutForClient(int idklienta) {
        Konto k = new Konto();
        k.setIdklienta(idklienta);
        k.setStankonta(0);
        k.setIdkonta(nastepnyNrKonta);
        nastepnyNrKonta++;
        konta.add(k);
    }

    public List<Konto> getAccountsForClient(int idklienta) {
        List<Konto> wynik = new ArrayList<>();
        for(Konto k : konta) {
            if (k.getIdklienta()==idklienta) {
                wynik.add(k);
            }
        }
        return wynik;
    }

    public void depositFunds(int idkonta, int funds) {
        // 1) funds > 0
        // 2) musi istniec konto o idkonta
        // jeśli nie 1 i 2 to wyrzuć wyjątek
        if (funds<=0) throw new RuntimeException("Nie można wpłacać ujemnych sum");
    }

    public void withdrawFunds(int idkonta, int funds) {
        //
        //
    }

    public Konto getKontoByKontoId(int kontoid) {
        for(Konto k : konta) {
            if (k.getIdkonta()==kontoid) return k;
        }
        return null;
    }

    public List<Klient> getKlienci() {
        return klienci;
    }

    public List<Konto> getKonta() {
        return konta;
    }
}
