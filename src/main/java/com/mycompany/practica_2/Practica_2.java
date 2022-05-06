/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.practica_2;

/*
 *
 * @author paulp
 */
public class Practica_2 {

    
    public static void main(String[] args) {
        
        var nombre = "Juan";
        var horasTrabajo = 100;
        var costoHora = 6;
        var anioIngreso = 2010;
        var anioActual = 2022;
        var maximoHorasTrabajadas =100;
        var limite1 =500;
        var limite2 =1000;
        var limite3 =2000;
        
        Empleado  empleado1 = new Empleado(nombre, horasTrabajo, costoHora, anioIngreso);
        
        System.out.println("Nombre = "+empleado1.nombre);
        System.out.println("Horas de Trabajo = "+empleado1.horasTrabajo);
        System.out.println("Costo por hora = "+empleado1.costoHora);
        System.out.println("Anio de ingreso laboral = "+empleado1.anioIngreso);
        
        empleado1.calcularIngreso(horasTrabajo, costoHora, anioIngreso, anioIngreso);
        System.out.println("Ingreso Total = "+empleado1.calcularIngreso(horasTrabajo, costoHora, anioIngreso, anioActual));
        
        empleado1.calcularBonoHorasExtra(horasTrabajo, maximoHorasTrabajadas, costoHora);
        System.out.println("Bono = "+empleado1.calcularBonoHorasExtra(horasTrabajo, maximoHorasTrabajadas, costoHora));
        
        empleado1.calcularImpuesto(limite1, limite2, limite3, costoHora, horasTrabajo);
        System.out.println("Impuesto = "+empleado1.calcularImpuesto(limite1, limite2, limite3, costoHora, horasTrabajo));
        
        var ingreso1Empleado1=empleado1.calcularIngreso(horasTrabajo, costoHora, anioIngreso, anioActual);
        var ingreso2Empleado1=empleado1.calcularBonoHorasExtra(horasTrabajo, maximoHorasTrabajadas, costoHora);
        var impuestoEmpleado1=empleado1.calcularImpuesto(limite1, limite2, limite3, costoHora, horasTrabajo);
        var total= ingreso1Empleado1+ingreso2Empleado1-impuestoEmpleado1;
        
        System.out.println("Total a pagar = "+total);
        
        //  EMPLEADO 2 //
        
        var nombre1 = "Maria";
        var horasTrabajo1 = 200;
        var costoHora1 = 5;
        var anioIngreso1 = 2020;
        var anioActual1 = 2022;
        var maximoHorasTrabajadas1=100;
        
        Empleado  empleado2 = new Empleado(nombre1, horasTrabajo1, costoHora1, anioActual1);
        
        System.out.println("\nNombre = "+empleado2.nombre);
        System.out.println("Horas de Trabajo = "+empleado2.horasTrabajo);
        System.out.println("Costo por hora = "+empleado2.costoHora);
        System.out.println("Anio de ingreso laboral = "+empleado2.anioIngreso);
        
        empleado2.calcularIngreso(horasTrabajo1, costoHora1, anioIngreso1, anioActual1);
        System.out.println("Ingreso Total = "+empleado2.calcularIngreso(horasTrabajo1, costoHora1, anioIngreso1, anioActual1));
        
        empleado2.calcularBonoHorasExtra(horasTrabajo1, maximoHorasTrabajadas1, costoHora1);
        System.out.println("Bono = "+empleado2.calcularBonoHorasExtra(horasTrabajo1, maximoHorasTrabajadas1, costoHora1));
        
        empleado2.calcularImpuesto(limite1, limite2, limite3, costoHora1, horasTrabajo1);
        System.out.println("Impuesto = "+empleado2.calcularImpuesto(limite1, limite2, limite3, costoHora1, horasTrabajo1));
        
        var ingreso1Empleado2=empleado2.calcularIngreso(horasTrabajo1, costoHora1, anioIngreso1, anioActual1);
        var ingreso2Empleado2=empleado2.calcularBonoHorasExtra(horasTrabajo1, maximoHorasTrabajadas1, costoHora1);
        var impuestoEmpleado2=empleado2.calcularImpuesto(limite1, limite2, limite3, costoHora1, horasTrabajo1);
        var totalEmpleado2=ingreso1Empleado2+ingreso2Empleado2-impuestoEmpleado2;
        
        System.out.println("Total a pagar = "+totalEmpleado2);
        
        // EMPLEADO 3 //
        
        var nombre2 = "Carlos";
        var horasTrabajo2 = 150;
        var costoHora2 = 8;
        var anioIngreso2 = 2018;
        var anioActual2 = 2022;
        var maximoHorasTrabajadas2=100;
        
        Empleado  empleado3 = new Empleado(nombre2, horasTrabajo2, costoHora2, anioActual2);
        
        System.out.println("\nNombre = "+empleado3.nombre);
        System.out.println("Horas de Trabajo = "+empleado3.horasTrabajo);
        System.out.println("Costo por hora = "+empleado3.costoHora);
        System.out.println("Anio de ingreso laboral = "+empleado3.anioIngreso);
        
        empleado3.calcularIngreso(horasTrabajo2, costoHora2, anioIngreso2, anioActual2);
        System.out.println( "Ingreso Total = "+empleado3.calcularIngreso(horasTrabajo2, costoHora2, anioIngreso2, anioActual2));
        
        empleado3.calcularBonoHorasExtra(horasTrabajo2, maximoHorasTrabajadas2, costoHora2);
        System.out.println("Bono="+empleado3.calcularBonoHorasExtra(horasTrabajo2, maximoHorasTrabajadas2, costoHora2));
        
        empleado3.calcularImpuesto(limite1, limite2, limite3, costoHora2, horasTrabajo2);
        System.out.println("Impuesto = "+empleado3.calcularImpuesto(limite1, limite2, limite3, costoHora2, horasTrabajo2));
        
        var ingreso1Empleado3=empleado3.calcularIngreso(horasTrabajo2, costoHora2, anioIngreso2, anioActual2);
        var ingreso2Empleado3=empleado3.calcularBonoHorasExtra(horasTrabajo2, maximoHorasTrabajadas2, costoHora2);
        var impuestoEmpleado3=empleado3.calcularImpuesto(limite1, limite2, limite3, costoHora2, horasTrabajo2);
        var totalEmpleado3=ingreso1Empleado3+ingreso2Empleado3-impuestoEmpleado3;
        
        System.out.println("Total a pagar = "+totalEmpleado3);
    }
}
