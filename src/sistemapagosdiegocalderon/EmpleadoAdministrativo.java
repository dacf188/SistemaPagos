package sistemapagosdiegocalderon;

public class EmpleadoAdministrativo extends Persona{
    private int horasExtra;
    private double valorHoraExtra;

    public EmpleadoAdministrativo() {
        //ASIGNAMOS VALORES ANTES QUE SE EJECUTE
        setTipo("Administrativo");
    }
    @Override
    public void ingresarEspecificaciones (){
        System.out.println("Ingrese la cantidad de horas extra");
        horasExtra = scanner.nextInt();
        System.out.println("Ingrese el valor de la hora extra");
        valorHoraExtra = scanner.nextDouble();
        scanner.nextLine();
    }
    @Override
    public double pagarSalario (){
        salarioTotal = salarioBase + (horasExtra * valorHoraExtra);
        return salarioTotal;
    }
}
