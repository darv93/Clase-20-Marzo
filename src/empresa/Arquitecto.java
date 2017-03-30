/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

/**
 *
 * @author Estudiante
 */
public class Arquitecto extends Empleado {

    public Arquitecto(String nombre) {
        super(nombre);
    }
    
    @Override
    public double calcularSalario(){
        return 200;
    }
}
