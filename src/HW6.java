import com.sun.deploy.ui.CacheUpdateProgressDialog;

public class HW6 {
    /*
    Sozdaite Class Car u kotorogo budet cena, god vypuska, ves, cvet, proizvoditel;
- u Classa doljen byt konstructor na vse parametry;
- vmain sozdaite 5-6 objectov classa Car, soberite ih v massiv;
- raspecataite vsjy informacijy (cena, god vypuska, ves, cvet, proizvoditel) dlja samogo dorogogo avtomobilja;
- raspecataite vsjy informacijy (cena, god vypuska, ves, cvet, proizvoditel) dlja samogo starogo avtomobilja;

     */
    public static void main(String[] args) {
        Car toyota = new Car();
        toyota.model = "Land Cruiser";
        toyota.price = 80000;
        toyota.age = 1;
        toyota.firm = "Japan";

        Car audi = new Car();
        audi.model = "Q8";
        audi.price = 90000;
        audi.age = 1;
        audi.firm = "Germany";

        Car bmw = new Car();
        bmw.model = "X6";
        bmw.price = 100000;
        bmw.age = 1;
        bmw.firm = "Germany";


    }

}

