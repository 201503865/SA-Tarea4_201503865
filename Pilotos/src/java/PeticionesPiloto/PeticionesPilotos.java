/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PeticionesPiloto;

import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author ASUS
 */
@WebService(serviceName = "PeticionesPilotos")
public class PeticionesPilotos {

    ArrayList<Piloto> _ListaPilotos;
    
    /**
     * Constructor que servira para inicializar variables
     */
    public PeticionesPilotos(){
        _ListaPilotos = new ArrayList<>();
        AlmacenarDatos();
    }
    
    /**
     * Metodo que llenara la lista de pilotos de datos
     */
    
    public void AlmacenarDatos(){
        _ListaPilotos.add(new Piloto("P1","Juan - Mazda Rojo"));
        _ListaPilotos.add(new Piloto("P2","Luis - Toyota Gris"));
        _ListaPilotos.add(new Piloto("P3","Marcelo - Mazda Amarillo"));
        _ListaPilotos.add(new Piloto("P4","Mariano - Honda Blanco"));
        _ListaPilotos.add(new Piloto("P5","Jorge - Toyota Rojo"));
    }
    
    /**
     * This is a sample web service operation
     * @param idPiloto
     * @return 
     */
    @WebMethod(operationName = "ObtenerPiloto")
    public String hello(@WebParam(name = "id") String idPiloto) {
        for(Piloto piloto:_ListaPilotos){
            if(piloto.getIdPiloto().equals(idPiloto)){
                return "Se a localizado en el area "+ piloto.getDatos();
            }
        }
        return "No se tiene ningun piloto disponible";
    }
}
