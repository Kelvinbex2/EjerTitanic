package es.etg.psp;


public class Barca {
    private int superviviente;
    private String nombre;

    public Barca(String nombre) {
        this.superviviente = 1 + (int) +(Math.random() * 100);
        this.nombre = nombre;
    }

    public int getSuperviviente() {
    return superviviente;
}

public void setSuperviviente(int superviviente) {
    this.superviviente = superviviente;
}

}
