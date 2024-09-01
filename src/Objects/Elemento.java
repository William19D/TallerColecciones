package Objects;

public class Elemento {
    private int valor;

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Elemento(int valor) {
        this.valor = valor;
    }



    @Override
    public String toString() {
        return "Elemento{" +
                "valor=" + valor +
                '}';
    }
}

