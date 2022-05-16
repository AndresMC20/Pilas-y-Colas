public class ListaSE {

    protected Nodo inicio;

    //metodo constructor
    public ListaSE(){
        this.inicio = null;
    }
    
    //vacia?
    public boolean esta_vacia(){
        return inicio == null;
    }

    //tamaño lista
    public int tamaño(){
        int contador = 0;
        Nodo aux = inicio;
        if(esta_vacia()){
            System.out.println("La lista esta vacia");
        }else{
            while (aux != null){

                contador ++;
                aux = aux.getSiguiente();
    
            }
        }

        return contador;
    }

    //valor ultimo nodo
    public Object ultimoDato(){
        Nodo aux = inicio;

        if(esta_vacia()){
            System.out.println("La lista esta vacia");
        }else{
            while(aux.getSiguiente() != null){
                aux = aux.getSiguiente();
    
            }
        }

        return aux.getSiguiente();
    }

    //insertar
    public void insertarInicio(Object dato){
        if(esta_vacia()){
            Nodo nuevo = new Nodo(dato, null);
            inicio = nuevo;
        }else{
            Nodo nuevo = new Nodo(dato, inicio);
            inicio = nuevo;
        }
    }

    //eliminar
    public void eliminarInicio(){
        if(!esta_vacia()){
            this.inicio = inicio.getSiguiente();
        }
    }

    public void mostrar(){
        if(esta_vacia()){
            System.out.println("La lista esta vacia");
        }else{
            Nodo aux = inicio;

            while (aux != null){
                System.out.print(aux.getDato()+ " ");
                aux = aux.getSiguiente();
            }
            System.out.println();
        }
    }

}
