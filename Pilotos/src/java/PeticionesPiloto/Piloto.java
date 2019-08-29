/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PeticionesPiloto;

/**
 *
 * @author ASUS
 */
public class Piloto {

    public Piloto(String idPiloto, String datos){
        this._idPiloto = idPiloto;
        this.datos = datos;
    }
    
    /**
     * @return the _idPiloto
     */
    public String getIdPiloto() {
        return _idPiloto;
    }

    /**
     * @param _idPiloto the _idPiloto to set
     */
    public void setIdPiloto(String _idPiloto) {
        this._idPiloto = _idPiloto;
    }

    /**
     * @return the datos
     */
    public String getDatos() {
        return datos;
    }

    /**
     * @param datos the datos to set
     */
    public void setDatos(String datos) {
        this.datos = datos;
    }
    private String _idPiloto;
    private String datos;
    
}
