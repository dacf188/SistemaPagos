package sistemapagosdiegocalderon;

import java.util.ArrayList;

public class SistemaPagosDiegoCalderon {

    public static void main(String[] args) {
        double total = 0;
        ArrayList<Persona> empleados = new ArrayList<>();
        empleados.add(new EmpleadoAdministrativo());
        empleados.add(new EmpleadoServicio());
        empleados.add(new EmpleadoNocturno());
        empleados.add(new EmpleadoPorComision());
        
        for (Persona empleado : empleados) {
            empleado.ingresar();
        }
        System.out.println("___________SISTEMA DE EMPLEADOS___________");
        for (Persona empleado : empleados) {
            System.out.println("Empleado: " + empleado.getNombre());
            System.out.println("Tipo: " + empleado.getTipo());
            System.out.println("Salario Base: Q." + empleado.getSalarioBase());
            System.out.println("Salario Final: Q." + empleado.pagarSalario());
            System.out.println("");
            total += empleado.pagarSalario();
        }
        System.out.println("Total de salarios a pagar: Q." + total);
    }
    
}
