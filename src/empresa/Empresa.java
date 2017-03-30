/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Empresa {

    private ArrayList<Empleado> empleados;

    public Empresa() {
        this.empleados = new ArrayList<>();
    }
   
    public void agregarEmpleado(Empleado e){
        this.empleados.add(e);
    }
    
    public double calcularNomina(){
        double nomina =0;
        //Poliformismo asignacion
        for (Empleado empleado : empleados){
            //Ligadura tardia
            nomina+=empleado.calcularSalario();
        }
        return nomina;
    }
    
    public ArrayList<Empleado> listarEmpleados(){
        return this.empleados;
    }
    
    public double calcularNominaProgramadores(){
        double nomina=0;
        for (Empleado empleado : empleados){
            if(empleado instanceof Programador){
                nomina+=empleado.calcularSalario();
            }
        }
        return nomina;
    }
}
