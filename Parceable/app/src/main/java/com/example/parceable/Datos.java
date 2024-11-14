package com.example.parceable;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class Datos implements Parcelable {
    private String nombre, correo, numero;

    public Datos(String nombre, String numero, String correo) {
        this.nombre = nombre;
        this.numero = numero;
        this.correo = correo;
    }

    protected Datos(Parcel in) {
        nombre = in.readString();
        correo = in.readString();
        numero = in.readString();
    }

    public static final Creator<Datos> CREATOR = new Creator<Datos>() {
        @Override
        public Datos createFromParcel(Parcel in) {
            return new Datos(in);
        }

        @Override
        public Datos[] newArray(int size) {
            return new Datos[size];
        }
    };

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        dest.writeString(nombre);
        dest.writeString(correo);
        dest.writeString(numero);
    }
}