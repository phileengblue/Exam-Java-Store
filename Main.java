public class Main {
    public static void main(String[] args) {

        Abbigliamento scarpe = new Abbigliamento("Air Jordan 1", 139.99);
        Abbigliamento scarpe2 = new Abbigliamento("Air Jordan 2", 120.99);
        Abbigliamento abbigliamento2 = new Abbigliamento(scarpe);
        Elettronica portatile = new Elettronica("Macbook pro 16", 3200.00);
        Elettronica portatile2 = new Elettronica("Macbook air M2", 1600.00);
        Elettronica portatile3 = new Elettronica("Macbook pro 14", 2200.00);
        Elettronica elettronica2 = new Elettronica(portatile3);
        Alimentari biscotti = new Alimentari("Oreo", 1.50);
        Alimentari biscotti2 = new Alimentari("Crisbi", 1.30);
        Alimentari alimentari2 = new Alimentari(biscotti2);


        Ordine primoOrdine = new Ordine();
        primoOrdine.aggiungiProdotto(scarpe);
        primoOrdine.aggiungiProdotto(portatile);
        primoOrdine.aggiungiProdotto(biscotti);


        Ordine secondoOrdine = new Ordine();
        secondoOrdine.aggiungiProdotto(biscotti2);
        secondoOrdine.aggiungiProdotto(portatile2);
        secondoOrdine.aggiungiProdotto(scarpe);


        primoOrdine.rimuoviProdotto(scarpe);
        secondoOrdine.rimuoviProdotto(portatile2);

        double totalePrimoOrdine = primoOrdine.calcolaTotaleOrdine();
        System.out.println("Prodotti nel primo ordine:");
        for (Prodotto prodotto : primoOrdine.getProdotti()) {
            System.out.println(prodotto);
        }
        System.out.println("Totale del primo ordine: €" + totalePrimoOrdine);


        double totaleSecondoOrdine = secondoOrdine.calcolaTotaleOrdine();
        System.out.println("Prodotti nel secondo ordine:");
        for (Prodotto prodotto : secondoOrdine.getProdotti()) {
            System.out.println(prodotto);
        }
        System.out.println("Totale del secondo ordine: €" + totaleSecondoOrdine);
    }
}
