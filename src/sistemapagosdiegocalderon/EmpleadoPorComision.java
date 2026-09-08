package sistemapagosdiegocalderon;

public class EmpleadoPorComision extends Persona{
    private double ventas;
    private double porcentajeComision;
    @Override
    public void ingresar (){
        this.tipo = "Por Comision";
        System.out.println("\nEmpleado " + tipo);
        super.ingresar();
        System.out.println("Ingrese sus ventas");
        ventas = scanner.nextDouble();
        System.out.println("Ingrese su porcentaje de comision");
        porcentajeComision = scanner.nextDouble();
        scanner.nextLine();
    }
    @Override
    public double pagarSalario (){
        salarioTotal = salarioBase + (ventas * (porcentajeComision / 100));
        return salarioTotal;
    }
}
