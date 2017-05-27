package bank.model;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Klient> klienci;
    private List<Konto> konta;

    public Bank() {
        klienci = new ArrayList<>();
        konta = new ArrayList<>();
    }

    public void addClient(Klient k) {
        klienci.add(k);
    }

    public void createAccoutForClient(int idklienta) {
        Konto k = new Konto();
        k.setIdklienta(idklienta);
        k.setStankonta(0);
        konta.add(k);
    }


    public List<Klient> getKlienci() {
        return klienci;
    }

    public List<Konto> getKonta() {
        return konta;
    }
}
