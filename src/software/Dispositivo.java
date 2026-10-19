package software;

public class Dispositivo {
    public String nombre;
    String tipo;
    public boolean activo;

    public void mostrarInformacion () {
        System.out.println("Nombre: "+nombre);
        System.out.println("Tipo: "+tipo);
        System.out.println("Estado: "+activo);
    }

    void mostrarEstado () {
        //Operador ternario (?:): Es un if-else
        String estado = activo ? "está activo":"está inactivo";
        System.out.println(nombre + " " + estado);
    }

    void activar () {
        if (activo==false){
            activo=true;
            System.out.println(nombre+" Se ha activado");
        } else System.out.println(nombre+" ya estaba activo");
    }
}
