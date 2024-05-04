public class Ordine {
    private Prodotto[] prodotti;
    private int numeroProdotti;

    public Ordine() {
        prodotti = new Prodotto[10];
        numeroProdotti = 0;
    }

    public void aggiungiProdotto(Prodotto prodotto) {
        if (numeroProdotti < prodotti.length) {
            prodotti[numeroProdotti] = prodotto;
            numeroProdotti++;
        } else {
            espandiArray();
            prodotti[numeroProdotti] = prodotto;
            numeroProdotti++;
        }
    }

    public void rimuoviProdotto(Prodotto prodotto) {
        int index = -1;
        for (int i = 0; i < numeroProdotti; i++) {
            if (prodotti[i].equals(prodotto)) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            for (int i = index; i < numeroProdotti - 1; i++) {
                prodotti[i] = prodotti[i + 1];
            }
            prodotti[numeroProdotti - 1] = null;
            numeroProdotti--;
        }
    }

    public double calcolaTotaleOrdine() {
        double totale = 0.0;
        for (int i = 0; i < numeroProdotti; i++) {
            totale += prodotti[i].calcolaPrezzoScontato();
        }
        return totale;
    }

    public Prodotto[] getProdotti() {
        return prodotti;
    }

    private void espandiArray() {
        Prodotto[] nuovoArray = new Prodotto[prodotti.length * 2];
        for (int i = 0; i < numeroProdotti; i++) {
            nuovoArray[i] = prodotti[i];
        }
        prodotti = nuovoArray;
    }
}

