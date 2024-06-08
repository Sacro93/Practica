package EjercicioPOOEmpleado;

public class Main {

    public  static void main(String[] args){

        Empleado nicolas= new Empleado(37678600,10000,true
                ,0,5);

        System.out.println( "Pago por hs extras :" + nicolas.pagoPorHorasExtras());
        System.out.println( "Sueldo Bruto : " + nicolas.sueldoBruto());
        System.out.println( "Retenciones : " +nicolas.calculoRetenciones());
        nicolas.imprimirInfoBasica();
        nicolas.sueldoNeto();
        nicolas.allInformation();


    }
}
