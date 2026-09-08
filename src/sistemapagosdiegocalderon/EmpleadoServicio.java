package sistemapagosdiegocalderon;

public class EmpleadoServicio extends Persona{
    private double ventasRealizadas;
    private double porcentajeBono;
    private double bono;
    
    @Override
    public void ingresar (){
        this.tipo = "Servicio";
        System.out.println("\nEmpleado " + tipo);
        super.ingresar();
        System.out.println("Ingrese las ventas realizadas");
        ventasRealizadas = scanner.nextDouble();
        System.out.println("Ingrese el porcentaje del bono");
        porcentajeBono = scanner.nextDouble();
        scanner.nextLine();
    }
    @Override
    public double pagarSalario (){
        bono = ventasRealizadas * (porcentajeBono/100);
        salarioTotal = salarioBase + bono;
        return salarioTotal;
    }
}
