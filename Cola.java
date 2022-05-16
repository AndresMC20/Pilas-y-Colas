public class Cola extends ListaSE{
    @Override
    public void insertarInicio(Object dato){

        if(esta_vacia()){
            Nodo nuevo = new Nodo(dato, null);
            inicio = nuevo;
        }else{
            Nodo ultimo = inicio;
            while(ultimo.getSiguiente() != null){
                ultimo = ultimo.getSiguiente();
            }
            
            Nodo nuevo = new Nodo(dato, null);
            ultimo.setSiguiente(nuevo);
        }
    }
    
}