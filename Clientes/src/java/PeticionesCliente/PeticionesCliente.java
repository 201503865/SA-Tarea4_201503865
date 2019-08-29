/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PeticionesCliente;

import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author ASUS
 */
@WebService(serviceName = "PeticionesCliente")
public class PeticionesCliente {

    ArrayList<Cliente> _ListaClientes;
    
    /**
     * Constructor del servidor que se encarga de inicializar las variables
     */
    public PeticionesCliente(){
        _ListaClientes = new ArrayList<Cliente>();
        AlmacenarDatos();
    }
    
    /**
     * Metodo que servira para agregar datos al arreglo de clientes
     */
    public void AlmacenarDatos(){
        _ListaClientes.add(new Cliente("C1","z11"));
        _ListaClientes.add(new Cliente("C2","z12"));
        _ListaClientes.add(new Cliente("C3","z13"));
        _ListaClientes.add(new Cliente("C4","z14"));
        _ListaClientes.add(new Cliente("C5","z15"));
    }
    
    /**
     * This is a sample web service operation
     * @param id
     * @return 
     */
    @WebMethod(operationName = "PedirUber")
    public String Pedir_Uber(@WebParam(name = "id") String id) {
        for(Cliente cliente_actual : _ListaClientes){
            if(id.equals(cliente_actual.getId())){
                return cliente_actual.getUbicacion();
            }
        }
        return "No existe el cliente";
    }
}
