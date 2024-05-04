public class Abbigliamento extends Prodotto {
    public Abbigliamento(String nome, double prezzo) {
        super(nome, prezzo, TipoProdotto.ABBIGLIAMENTO);
    }

    public Abbigliamento(Abbigliamento abbigliamento) {
        super(abbigliamento);
    }

    @Override
    public double calcolaPrezzoScontato() {
        return getPrezzo() * 0.8;
    }
}
