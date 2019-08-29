package PeticionRastreo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Auto {

    public Auto(String idAuto,String idPiloto,String ubicacion){
        this._idAuto = idAuto;
        this._idPiloto=idPiloto;
        this._ubicacion = ubicacion;
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
     * @return the _idAuto
     */
    public String getIdAuto() {
        return _idAuto;
    }

    /**
     * @param _idAuto the _idAuto to set
     */
    public void setIdAuto(String _idAuto) {
        this._idAuto = _idAuto;
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
    private String _idPiloto;
    private String _idAuto;
    private String _ubicacion;
    
}
