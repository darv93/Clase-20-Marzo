/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static int menu(){
        int opcion=0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("1. Agregar"
                           +" 2. Listar"
                           +" 3. Nomina"
                           +" 4. Nomina Programador"
                           +" 5. Salir");
        opcion=teclado.nextInt();
        return (opcion);
    }
    
    public static void main(String[] args) {
        int opcion=-1;
        Empresa empresa = new Empresa();
        Scanner teclado = new Scanner(System.in);
        do{
            opcion=menu();
            switch(opcion){
                case 1:
                    System.out.println("Ingrese nombre del empleado");
                    String nombre = teclado.next();
                    System.out.println("Tipo Empleado: 1. Programador 2. Arquitecto");
                    int tipo = teclado.nextInt();
                    Empleado empleado=null;
                    if(tipo==1){
                        empleado = new Programador(nombre);
                    }else if(tipo==2){
                        empleado = new Arquitecto(nombre);
                    }
                    empresa.agregarEmpleado(empleado);
                    break;
                case 2:
                    ArrayList<Empleado> empleados = empresa.listarEmpleados();
                    for (int i=0; i<empleados.size();i++){
                       Empleado e= empleados.get(i);
                       if (e instanceof Programador){
                           System.out.println(e.getNombre() + " Programador");
                       } else{
                           System.out.println(e.getNombre()+ "Arquitecto");                       
                       }
                    }
                    break;                    
                case 3:
                    double nomina = empresa.calcularNomina();
                    System.out.println("Nomina "+nomina);
                    break;
                case 4:
                    double nominaProgramador = empresa.calcularNominaProgramadores();
                    System.out.println("Nomina Programador "+ nominaProgramador);
                    break;
                case 5:
                    System.out.println("Hasta Pronto.");
                    break;
                default :
                    System.out.println("Invalido");
            }         
        }while(opcion!=5); 
        
        
        
    }
    
}
