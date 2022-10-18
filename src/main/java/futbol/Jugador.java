package futbol;

public class Jugador extends Futbolista{
    public short golesMarcados;
    public byte dorsal;

    // Constructor
    
    public Jugador(){
        super();
        golesMarcados = 289;
        dorsal = 7;
    }

    public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal) {
        super(nombre,edad,posicion);
        this.golesMarcados = golesMarcados;
        this.dorsal = dorsal;
    }
    
    // Getters y Setters

    public short getGolesMarcados() {
        return golesMarcados;
    }

    public void setGolesMarcados(short golesMarcados) {
        this.golesMarcados = golesMarcados;
    }

    public byte getDorsal() {
        return dorsal;
    }

    public void setDorsal(byte dorsal) {
        this.dorsal = dorsal;
    }
    
    // Métodos

    @Override
    public boolean jugarConLasManos(){
        return false;
    }
    @Override
    public int compareTo(Object obj){
        return Math.abs(this.getEdad()-((Futbolista)obj).getEdad());
    }

    @Override
    public String toString() {
        return "El futbolista " + getNombre() + " tiene " + getEdad() + ", y juega de " + getPosicion()+ " con el dorsal "+ dorsal+". Ha marcado "+ golesMarcados ;
    }

    @Override
    public boolean equals(Futbolista fut){
        return this == fut;
    }
}
