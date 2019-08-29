/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PeticionesCliente;

/**
 *
 * @author ASUS
 */
public class Cliente {

    public Cliente(String id, String ubicacion){
        this._id = id;
        this._ubicacion = ubicacion;
    }
    
    /**
     * @return the _id
     */
    public String getId() {
        return _id;
    }

    /**
     * @param _id the _id to set
     */
    public void setId(String _id) {
        this._id = _id;
    }

    /**
     * @return the _ubicacion
     */
    public String getUbicacion() {
        return _ubicacion;
    }

    /**
     * @param _ubicacion the _ubicacion to set
     */
    public void setUbicacion(String _ubicacion) {
        this._ubicacion = _ubicacion;
    }
    private String _id;
    private String _ubicacion;
    
}
