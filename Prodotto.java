import java.util.Objects;

public abstract class Prodotto {
    private String nome;
    private double prezzo;
    private TipoProdotto tipo;

    public Prodotto(String nome, double prezzo, TipoProdotto tipo) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.tipo = tipo;
    }

    public Prodotto(Prodotto prodotto) {
        this.nome = prodotto.nome;
        this.prezzo = prodotto.prezzo;
        this.tipo = prodotto.tipo;
    }

    public final String getNome() {
        return nome;
    }

    public final double getPrezzo() {
        return prezzo;
    }

    public final TipoProdotto getTipo() {
        return tipo;
    }

    public final void setNome(String nome) {
        this.nome = nome;
    }

    public final void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Prodotto prodotto = (Prodotto) obj;
        return Double.compare(prodotto.prezzo, prezzo) == 0 &&
                Objects.equals(nome, prodotto.nome) && tipo == prodotto.tipo;
    }


    @Override
    public String toString() {
        return nome + ": €" + prezzo;
    }

    public abstract double calcolaPrezzoScontato();
}
