package com.protek.projectoop.Encapsulation;

public class Manusia {

    //ATTRIBUT:
    private String namaDepan;
    private String namaBelakang;

    //CONSTRUCTOR


    public Manusia() {
        //
    }

    public Manusia(String namaDepan, String namaBelakang) {
        this.namaDepan = namaDepan;
        this.namaBelakang = namaBelakang;
    }


    //THIS

    //GETTER AND SETTER:
    public String getNamaDepan() {
        return namaDepan;
    }

    public void setNamaDepan(String namaDepan) {
        this.namaDepan = namaDepan;
    }

    public String getNamaBelakang() {
        return namaBelakang;
    }

    public void setNamaBelakang(String namaBelakang) {
        this.namaBelakang = namaBelakang;
    }

    //FUNCTION:
    public void tampilNama() {
        System.out.println("Nama Lengkap : "+this.namaDepan+" "+this.namaBelakang);
    }

}
