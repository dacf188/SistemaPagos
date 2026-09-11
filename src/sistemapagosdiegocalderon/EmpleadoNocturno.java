package sistemapagosdiegocalderon;

public class EmpleadoNocturno extends Persona{
   private int horasNocturnas;
    private double bonoHoraNoctura;
    private double bono;
    
    public EmpleadoNocturno() {
        //ASIGNAMOS VALORES ANTES QUE SE EJECUTE
        setTipo("Nocturno");
    }
    
    @Override
    public void ingresarEspecificaciones (){
        System.out.println("Ingrese las horas Nocturnas");
        horasNocturnas = scanner.nextInt();
        System.out.println("Ingrese el bono de Hora Nocturna");
        bonoHoraNoctura = scanner.nextDouble();
        scanner.nextLine();
    }
    @Override
    public double pagarSalario (){
        bono = horasNocturnas * bonoHoraNoctura;
        salarioTotal = salarioBase + bono;
        return salarioTotal;
    }
}
