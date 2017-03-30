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
public class Programador extends Empleado {

    public Programador(String nombre) {
        super(nombre);
    }
    
    /**
     *
     * @return
     */
    @Override
    public double calcularSalario(){
        return 100;
    }
    
}
