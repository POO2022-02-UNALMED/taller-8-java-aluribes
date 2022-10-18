package futbol;

public abstract class Futbolista implements Comparable{
    private String nombre;
    private int edad;
    private final String posicion;

    // Constructor
    
    public Futbolista() {
        nombre = "Maradona";
        edad = 30;
        posicion = "delantero";
    }

    public Futbolista(String nombre, int edad, String posicion) {
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
    }

    // Getters y setters


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    // Métodos

    @Override
    public String toString() {
        return "El futbolista " + nombre + " tiene " + edad + ", y juega de " + posicion ;
    }

    public boolean equals(Futbolista f){
        return this==f;
    }

    public abstract boolean jugarConLasManos();
}
