package software;

public class MainDispositivo {
    static void main() {
        Dispositivo di_1 = new Dispositivo();
        Dispositivo di_2 = new Dispositivo();

        di_1.nombre="Mouse";
        di_1.tipo="Periferico";
        di_1.activo=true;


        di_2.nombre="Teclado";
        di_2.tipo="Periferico";
        di_2.activo=false;

        di_1.mostrarInformacion();
        di_1.mostrarEstado();
        System.out.println();
        di_2.mostrarInformacion();
        di_2.mostrarEstado();

        di_1.activo=false;
        System.out.println();
        di_1.mostrarEstado();

        System.out.println();
        di_1.activar();
        di_1.activar();
    }
}

