package sistemapagosdiegocalderon;

public class EmpleadoPorComision extends Persona{
    private double ventas;
    private double porcentajeComision;
    
    public EmpleadoPorComision() {
        //ASIGNAMOS VALORES ANTES QUE SE EJECUTE
        setTipo("Por Comision");
    }
    @Override
    public void ingresarEspecificaciones (){
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
