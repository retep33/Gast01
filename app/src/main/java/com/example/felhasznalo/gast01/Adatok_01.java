package com.example.felhasznalo.gast01;

/**
 * Created by felhasznalo on 2016.04.25..
 */
public class Adatok_01 {
    private int _id;
    private String _productname;

    public Adatok_01(){

    }

    public Adatok_01(String productname) {
        this._productname = productname;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public void set_productname(String _productname) {
        this._productname = _productname;
    }

    public int get_id() {
        return _id;
    }

    public String get_productname() {
        return _productname;
    }
}
