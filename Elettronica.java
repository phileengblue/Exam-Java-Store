public class Elettronica extends Prodotto {
    public Elettronica(String nome, double prezzo) {
        super(nome, prezzo, TipoProdotto.ELETTRONICA);
    }

    public Elettronica(Elettronica elettronica) {
        super(elettronica);
    }

    @Override
    public double calcolaPrezzoScontato() {
        return getPrezzo() * 0.9;
    }
}