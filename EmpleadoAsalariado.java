package lab06;

public class EmpleadoAsalariado extends Empleado{
    private double SalarioSemanal;

    public EmpleadoAsalariado(String nombre, String apellido, String nss, double salario){
        super(nombre, apellido, nss);
        establecerSalarioSemanal(salario);
    }
    @Override
    public double obtenerMontoPago(){
        return obtenerSalarioSemanal();
    }
}
