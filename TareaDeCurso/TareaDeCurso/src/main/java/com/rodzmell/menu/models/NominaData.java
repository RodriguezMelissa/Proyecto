/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rodzmell.menu.models;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */
public class NominaData implements Serializable {

    private String nombre;
    private double salario;
    private int horasExtras;
    private double ingresosPorHorasExtras;
    private int dias;
    private double ingresosPorVacaciones;
    private int añosLaborados;
    private double ingresosPorAntiguedad;
    private double comisiones;
    private double zonaje;
    private double remuneracionBruta;
    private double inss;
    private double ir;
    private double totalDeducciones;
    private double remuneracionNeta;
    private double inssPatronal;
    private double inatec;
    private double totalImpuestos;
    private double aguinaldo;
    private double totalAPagar;

    public NominaData(String nombre, double salario, int horasExtras, int dias, double zonaje, double comisiones, int añosLaborados) {
        this.nombre = nombre;
        this.salario = salario;
        this.horasExtras = horasExtras;
        this.dias = dias;
        this.comisiones = comisiones;
        this.zonaje = zonaje;
        this.añosLaborados = añosLaborados;

    }

    public NominaData() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;

    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    public double getIngresosPorHorasExtras() {
        ingresosPorHorasExtras = (((salario / 30) / 8) * horasExtras) * 2;
        return ingresosPorHorasExtras;
    }

    public void setIngresosPorHorasExtras(double salario, int horasExtras) {
        this.salario = salario;
        this.horasExtras = horasExtras;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public double getIngresosPorVacaciones() {
        ingresosPorVacaciones = (salario / 30) * dias;
        return ingresosPorVacaciones;
    }

    public void setIngresosPorVacaciones(double salario, int dias) {
        this.salario = salario;
        this.dias = dias;
    }

    public int getAñosLaborados() {
        return añosLaborados;
    }

    public void setAñosLaborados(int añosLaborados) {
        this.añosLaborados = añosLaborados;
    }

    public double getIngresosPorAntiguedad() {
        ingresosPorAntiguedad = 0;
        switch (añosLaborados) {

            case 1:
                ingresosPorAntiguedad = salario * 0.03;
                break;
            case 2:
                ingresosPorAntiguedad = salario * 0.05;
                break;
            case 3:
                ingresosPorAntiguedad = salario * 0.07;
                break;
            case 4:
                ingresosPorAntiguedad = salario * 0.09;
                break;
            case 5:
                ingresosPorAntiguedad = salario * 0.1;
                break;
            case 6:
                ingresosPorAntiguedad = salario * 0.011;
                break;
            case 7:
                ingresosPorAntiguedad = salario * 0.12;
                break;
            case 8:
                ingresosPorAntiguedad = salario * 0.13;
                break;
            case 9:
                ingresosPorAntiguedad = salario * 0.14;
                break;
            case 10:
                ingresosPorAntiguedad = salario * 0.15;
                break;
            case 11:
                ingresosPorAntiguedad = salario * 0.155;
                break;
            case 12:
                ingresosPorAntiguedad = salario * 0.16;
                break;
            case 13:
                ingresosPorAntiguedad = salario * 0.165;
                break;
            case 14:
                ingresosPorAntiguedad = salario * 0.17;
                break;
            case 15:
                ingresosPorAntiguedad = salario * 0.175;
                break;
            case 16:
                ingresosPorAntiguedad = salario * 0.18;
                break;
            case 17:
                ingresosPorAntiguedad = salario * 0.185;
                break;
            case 18:
                ingresosPorAntiguedad = salario * 0.19;
                break;
            case 19:
                ingresosPorAntiguedad = salario * 0.195;
                break;
            case 20:
                ingresosPorAntiguedad = salario * 0.2;
                break;
        }
        if (añosLaborados > 20) {
            ingresosPorAntiguedad = 0.2 * salario;

        }

        return ingresosPorAntiguedad;
    }

    public void setIngresosPorAntiguedad(double salario, int añosLaborados) {
        this.salario = salario;
        this.añosLaborados = añosLaborados;
    }

    public double getComisiones() {
        return comisiones;
    }

    public void setComisiones(double comisiones) {
        this.comisiones = comisiones;
    }

    public double getZonaje() {
        return zonaje;
    }

    public void setZonaje(double zonaje) {
        this.zonaje = zonaje;
    }

    public double getRemuneracionBruta() {
        remuneracionBruta = salario + ingresosPorHorasExtras + ingresosPorVacaciones + ingresosPorAntiguedad + zonaje + comisiones;
        return remuneracionBruta;
    }

    public void setRemuneracionBruta(double salario, double ingresosPorHorasExtras, double ingresosPorVacaciones, double ingresosPorAntiguedad, double zonaje, double comisiones) {
        this.salario = salario;
        this.ingresosPorHorasExtras = ingresosPorHorasExtras;
        this.ingresosPorVacaciones = ingresosPorVacaciones;
        this.ingresosPorAntiguedad = ingresosPorAntiguedad;
        this.zonaje = zonaje;
        this.comisiones = comisiones;
    }

    public double getInss() {
        inss = remuneracionBruta * 0.07;
        return inss;
    }

    public void setInss(double remuneracionBruta) {
        this.remuneracionBruta = remuneracionBruta;
    }

    public double getIr() {
        double monto = remuneracionBruta - inss;
        double expectativaAnual = monto * 12;
        ir = 0;
        if (expectativaAnual >= 0.01 && expectativaAnual <= 100000) {
            ir = 0;
        }
        if (expectativaAnual >= 100001 && expectativaAnual <= 200000) {
            double deducible = expectativaAnual - 100000;
            double porcentaje = deducible * 0.15;
            ir = porcentaje / 12;
        }

        if (expectativaAnual >= 200001 && expectativaAnual <= 350000) {
            double deducible = expectativaAnual - 200000;
            double porcentaje = deducible * 0.20;
            double impuestoBase = porcentaje + 15000;
            ir = impuestoBase / 12;
        }

        if (expectativaAnual >= 350001 && expectativaAnual <= 500000) {
            double deducible = expectativaAnual - 350000;
            double porcentaje = deducible * 0.25;
            double impuestoBase = porcentaje + 45000;
            ir = impuestoBase / 12;
        }
        if (expectativaAnual >= 500001) {
            double deducible = expectativaAnual - 500000;
            double porcentaje = deducible * 0.30;
            double impuestoBase = porcentaje + 82500;
            ir = impuestoBase / 12;
        }

        return ir;
    }

    public void setIr(double remuneracionBruta, double inss) {
        this.remuneracionBruta = remuneracionBruta;
        this.inss = inss;
    }

    public double getTotalDeducciones() {
        totalDeducciones = inss + ir;
        return totalDeducciones;
    }

    public void setTotalDeducciones(double inss, double ir) {
        this.inss = inss;
        this.ir = ir;
    }

    public double getRemuneracionNeta() {
        remuneracionNeta = remuneracionBruta - totalDeducciones;
        return remuneracionNeta;
    }

    public void setRemuneracionNeta(double remuneracionBruta, double totalDeducciones) {
        this.remuneracionBruta = remuneracionBruta;
    }

    public double getInssPatronal() {
        inssPatronal = remuneracionBruta * 0.215;
        return inssPatronal;
    }

    public void setInssPatronal(double remuneracionBruta) {
        this.remuneracionBruta = remuneracionBruta;
    }

    public double getInatec() {
        inatec = remuneracionBruta * 0.02;
        return inatec;
    }

    public void setInatec(double remuneracionBruta) {
        this.remuneracionBruta = remuneracionBruta;
    }

    public double getTotalImpuestos() {
        totalImpuestos = inssPatronal + inatec;
        return totalImpuestos;
    }

    public void setTotalImpuestos(double inssPatronal, double inatec) {
        this.inssPatronal = inssPatronal;
        this.inatec = inatec;

    }

    public double getAguinaldo() {
        aguinaldo = salario / 12;
        return aguinaldo;
    }

    public void setAguinaldo(double salario) {
        this.salario = salario;
    }

    public double getTotalAPagar() {
        totalAPagar = remuneracionNeta + aguinaldo;
        return totalAPagar;
    }

    public void setTotalAPagar(double remuneracionNeta, double aguinalo) {
        this.remuneracionNeta = remuneracionNeta;
        this.aguinaldo = aguinaldo;
    }

    public void save(File file, ArregloNomina nomina) throws IOException {
        if (file != null) {
            try {
                ObjectOutputStream a = new ObjectOutputStream(new FileOutputStream(file));
                a.writeObject(nomina);
                a.flush();
                a.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(NominaData.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public ArregloNomina read(File file) throws IOException {
        ArregloNomina nomina = null;
        try {
            ObjectInputStream j = new ObjectInputStream(new FileInputStream(file));
            try {
                nomina = (ArregloNomina) j.readObject();
                j.close();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(NominaData.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(NominaData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nomina;

    }

}
