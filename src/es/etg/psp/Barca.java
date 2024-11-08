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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    
    // @Override
    // public String toString() {
    //     return "superviviente=" + getSuperviviente();
    // }
       

    

    
    //   public static void main(String[] args) {
        
    //     int barca = 1 + (int) +(Math.random() * 100);
       
    //     System.out.println(barca);


    //   }
      
        
    
}
