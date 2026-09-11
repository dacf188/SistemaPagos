package sistemapagosdiegocalderon;

public class EmpleadoServicio extends Persona{
    private double ventasRealizadas;
    private double porcentajeBono;
    private double bono;
    
    public EmpleadoServicio() {
        //ASIGNAMOS VALORES ANTES QUE SE EJECUTE
        setTipo("Servicio");
    }
    @Override
    public void ingresarEspecificaciones (){
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
