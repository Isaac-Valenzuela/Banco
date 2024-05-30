package publico;

public class JugadorFulbo{
    public int cedula;
    public String nombre;
    public int camiseta;

    public JugadorFulbo(int cedula, String nombre, int camiseta){
        this.cedula = cedula;
        this.nombre = nombre;
        this.camiseta = camiseta;
    }

    public void mostarinfo(){
        System.out.println("Cedula: " + cedula);
        System.out.println("Nombre: " + nombre);
        System.out.println("Camiseta: " + camiseta);
    }

}

class defensa extends  JugadorFulbo{
    public String posicion;
    public  String tarjetas;
    public int goles;
    public int faltas;

    public defensa(int cedula, String nombre, int camiseta, String posicion, String tarjetas,
                    int goles, int faltas){
        super(cedula, nombre, camiseta);
        this.posicion = posicion;
        this.tarjetas = tarjetas;
        this.goles = goles;
        this.faltas = faltas;
    }
}

