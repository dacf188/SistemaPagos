package sistemapagosdiegocalderon;

import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class Persona {
    static Scanner scanner = new Scanner(System.in);
    protected String nombre;
    protected String dpi;
    protected double salarioBase;
    protected double salarioTotal;
    protected String tipo;
    
    public Persona (){
        this.nombre = "";
        this.dpi = "";
        this.salarioBase = 0.0;
        this.salarioTotal = 0.0;
    }
    public Persona (String nombre, String dpi, double salarioBase, double salarioTotal){
        this.nombre = nombre;
        this.dpi = dpi;
        this.salarioBase = salarioBase;
        this.salarioTotal = salarioTotal;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDpi() {
        return dpi;
    }
    public void setDpi(String dpi) {
        this.dpi = dpi;
    }
    public double getSalarioBase() {
        return salarioBase;
    }
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    public String getTipo (){
        return tipo;
    }
    public void setTipo (String tipo){
        this.tipo = tipo;
    }
   
    public boolean ingresar (){
        System.out.println("\nEmpleado " + getTipo());
        try {
            System.out.println("Ingrese su nombre");
            nombre = scanner.nextLine();
            System.out.println("Ingrese su DPI");
            dpi = scanner.nextLine();
            System.out.println("Ingrese su salario base");
            salarioBase = scanner.nextDouble();
            scanner.nextLine();
            ingresarEspecificaciones();
            return true;
        } catch (InputMismatchException e) {
            System.out.println("TIPO DE DATO INVALIDO");
            scanner.nextLine();
            return false;
        }
    }
    public abstract void ingresarEspecificaciones ();
    public abstract double pagarSalario();
    
}
