public class Alimentari extends Prodotto {
    public Alimentari(String nome, double prezzo) {
        super(nome, prezzo, TipoProdotto.ALIMENTARI);
    }

    public Alimentari(Alimentari alimentari) {
        super(alimentari);
    }

    @Override
    public double calcolaPrezzoScontato() {
        return getPrezzo();
    }
}