/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PeticionRastreo;

import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author ASUS
 */
@WebService(serviceName = "RastreoPeticion")
public class RastreoPeticion {
    
    ArrayList<Auto> _ListaAutos;
    
    /**
     * Metodo constructor que inicializara las variables
     */
    public RastreoPeticion(){
        _ListaAutos = new ArrayList<>();
        AlmacenarDatos();
    }
    
    /**
     * Metodo que colocara datos en el vector de autos
     */
    public void AlmacenarDatos(){
        _ListaAutos.add(new Auto("A1","P1","z15"));
        _ListaAutos.add(new Auto("A2","P2","z14"));
        _ListaAutos.add(new Auto("A3","P3","z13"));
        _ListaAutos.add(new Auto("A4","P4","z12"));
        _ListaAutos.add(new Auto("A5","P5","z15"));
    }
    
    
    /**
     * This is a sample web service operation
     * @param ubicacion
     * @return 
     */
    @WebMethod(operationName = "UbicarAuto")
    public String Ubicar_Auto(@WebParam(name = "ubicacion") String ubicacion) {
        for(Auto auto:_ListaAutos){
            if(auto.getUbicacion().equals(ubicacion)){
                return auto.getIdPiloto();
            }
        }
        return "No hay piloto disponible en esta ubicacion";
    }
}
