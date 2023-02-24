package com.example.plantilla;

public class PlantillaBarca {
    int Foto;
    String VerNombre;
    String VerEquipo;
    String VerPosicion;
    String VerNum;
    String ConocerNacimiento;
    String VerNacionalidad;

    public PlantillaBarca(int foto, String verNombre, String verEquipo,
                          String verPosicion, String verNum,
                          String conocerNacimiento, String verNacionalidad) {
        Foto = foto;
        VerNombre = verNombre;
        VerEquipo = verEquipo;
        VerPosicion = verPosicion;
        VerNum = verNum;
        ConocerNacimiento = conocerNacimiento;
        VerNacionalidad = verNacionalidad;
    }

    public int getFoto() {
        return Foto;
    }

    public void setFoto(int foto) {
        Foto = foto;
    }

    public String getVerNombre() {
        return VerNombre;
    }

    public void setVerNombre(String verNombre) {
        VerNombre = verNombre;
    }

    public String getVerEquipo() {
        return VerEquipo;
    }

    public void setVerEquipo(String verEquipo) {
        VerEquipo = verEquipo;
    }

    public String getVerPosicion() {
        return VerPosicion;
    }

    public void setVerPosicion(String verPosicion) {
        VerPosicion = verPosicion;
    }

    public String getVerNum() {
        return VerNum;
    }

    public void setVerNum(String verNum) {
        VerNum = verNum;
    }

    public String getConocerNacimiento() {
        return ConocerNacimiento;
    }

    public void setConocerNacimiento(String conocerNacimiento) {
        ConocerNacimiento = conocerNacimiento;
    }

    public String getVerNacionalidad() {
        return VerNacionalidad;
    }

    public void setVerNacionalidad(String verNacionalidad) {
        VerNacionalidad = verNacionalidad;
    }
}
