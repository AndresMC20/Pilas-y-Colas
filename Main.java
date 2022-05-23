public class Main {

    public static void main(String[] args) {
        /*
        ListaSE lista = new ListaSE();

        lista.insertarInicio(234);
        lista.insertarInicio(23);
        lista.insertarInicio(3334);
        lista.insertarInicio(456);
        lista.insertarInicio(745);

        System.out.println("TAMAÑO --> " + lista.tamaño());
        System.out.println("ULTIMO DATO " + lista.ultimoDato());

        lista.mostrar();
        */



        /*
        Cola cola = new Cola();
        System.out.println(cola.esta_vacia());
        for(int i = 1; i <= 5; i++){
            cola.insertarInicio(i);
        }

        cola.mostrar();

        cola.eliminarInicio();
        cola.eliminarInicio();
        cola.mostrar();
        */



        Pila pila = new Pila();
        System.out.println(pila.esta_vacia());

        for (int i = 1; i <=5; i++){
            pila.insertarInicio(i);
        }

        pila.mostrar();

        pila.eliminarInicio();
        pila.eliminarInicio();
        pila.eliminarInicio();
        pila.mostrar();

    }
    
}
