public class Pisos {
    private int subidos;
    
    public Pisos() {
        subidos = 0;
    }
    
    public void subir() {
        subidos++;
    }
    
    public void bajar() {
    }
    
    public int getTotalEscalones() {
        return (subidos) * 60;
    }
    
    public int getTotalSegundosDeVida() {
        return getTotalEscalones() * 5;
    }
 }