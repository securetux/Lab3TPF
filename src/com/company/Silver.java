package com.company;

import java.io.Serializable;
import java.util.Objects;
import java.util.Scanner;

public class Silver extends Avion implements Serializable {
    private static final long serialVersionUID = 200;
    private boolean wifi;
    private int tarifa;

    public Silver(){}

    public Silver (int combustible,int capacidadMax, Propulsion propulsion, boolean wifi)
    {
        super(combustible, capacidadMax, propulsion);
        this.tarifa = 4000;
        this.wifi = wifi;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Silver)) return false;
        if (!super.equals(o)) return false;
        Silver silver = (Silver) o;
        return wifi == silver.wifi &&
                tarifa == silver.tarifa;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), wifi, tarifa);
    }

    @Override
    public String toString() {
        String wifi = (this.wifi)?"SI":"NO";
        return ("[CLASE SILVER]: "+ super.toString() + ", WiFi: " + wifi +
                ", Tarifa: $" + tarifa);
    }

    @Override
    public void setVelocidadMax(int velocidadMax) {
        super.setVelocidadMax(velocidadMax);
    }

    @Override
    public void setPropulsion(Propulsion propulsion) {
        super.setPropulsion(propulsion);
    }

    @Override
    public void setCostoXkm(float costoXkm) {
        super.setCostoXkm(costoXkm);
    }

    @Override
    public void setCombustible(int combustible) {
        super.setCombustible(combustible);
    }

    public void setTarifa(int tarifa) {
        this.tarifa = tarifa;
    }

    @Override
    public void setCapacidadMax(int capacidadMax) {
        super.setCapacidadMax(capacidadMax);
    }

    @Override
    public Propulsion getPropulsion() {
        return super.getPropulsion();
    }

    @Override
    public int getVelocidadMax() {
        return super.getVelocidadMax();
    }

    @Override
    public int getCombustible() {
        return super.getCombustible();
    }

    @Override
    public int getCapacidadMax() {
        return super.getCapacidadMax();
    }

    @Override
    public float getCostoXkm() {
        return super.getCostoXkm();
    }

    public int getTarifa() {
        return tarifa;
    }
}
