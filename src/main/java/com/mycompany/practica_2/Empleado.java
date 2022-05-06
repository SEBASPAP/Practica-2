/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica_2;

/*
 *
 * @author paulp
 */
public class Empleado {
    
    public String nombre;
    public int horasTrabajo;
    public double costoHora;
    public int anioIngreso;
    
    public Empleado(String nombre, int horasTrabajo, double costoHora, int anioIngreso) {
        this.nombre = nombre;
        this.horasTrabajo = horasTrabajo;
        this.costoHora = costoHora;
        this.anioIngreso = anioIngreso;

    }

    int AnioActual=0;
    public double calcularIngreso(int horasTrabajo, double costoHora, int anioIngreso, int AnioActual){
        int diferenciaAnios = AnioActual-anioIngreso;
        double ingresoExtra = diferenciaAnios*0.02;
        double ingreso = horasTrabajo*costoHora; 
        double ingresoExtraTotal = ingreso*ingresoExtra;
        double ingresoTotal =ingreso+ingresoExtraTotal;
        return ingresoTotal;
    }
    
    int maximoHorasTrabajadas=0;
    public double calcularBonoHorasExtra(int horasTrabajo,int maximoHorasTrabajadas, double costoHora){
        double bonoExtra =0;
        if (horasTrabajo>maximoHorasTrabajadas){
            var diferenciaHoras = horasTrabajo-maximoHorasTrabajadas;
             bonoExtra = diferenciaHoras*(costoHora*2);
            return bonoExtra;
        }
        return bonoExtra;
    }
    
    int limite1=0;
    int limite2=0;
    int limite3=0;
    public double calcularImpuesto(int limite1, int limite2, int limite3, double costoHora, int horasTrabajo){
        
        double ingresoBasico= costoHora*horasTrabajo;
        if(ingresoBasico<limite1){
            ingresoBasico=ingresoBasico+0;
        }else if (ingresoBasico>limite1 && ingresoBasico<limite2){
            double impuestoRango1= ingresoBasico*0.05;
            ingresoBasico = impuestoRango1;
        }else if(ingresoBasico>=limite2 && ingresoBasico<limite3){
            double impuestoRango2=ingresoBasico*0.12;
            ingresoBasico = impuestoRango2;
        }else if(ingresoBasico>limite3){
              double impuestoRango3=ingresoBasico*0.25;
              ingresoBasico=impuestoRango3;
        }  
        return ingresoBasico;
    }
}
