package EjercicioPOOEmpleado;

public class Empleado {
    private String nif;
    private String dni;
    private double sueldoBase;
    private double valorHoraExtra = 9.0;
    private int horasExtrasMes;
    private double percepcionIRPF;
    private boolean casado;
    private int numHijos;


    public Empleado(double percepcionIRPF, String nif, double sueldoBase, boolean casado, int numHijos, int horasExtrasMes) {
    this(percepcionIRPF, nif,sueldoBase,casado,numHijos,horasExtrasMes,null);
    }
    public Empleado(double percepcionIRPF, String nif,double sueldoBase, boolean casado, int numHijos, int horasExtrasMes,String dni) {
        this.percepcionIRPF = percepcionIRPF;
        this.nif = nif;
        this.sueldoBase = sueldoBase;
        this.casado = casado;
        this.numHijos = numHijos;
        this.horasExtrasMes = horasExtrasMes;
        this.dni = dni;
    }


    public double pagoPorHorasExtras() {
        return horasExtrasMes * valorHoraExtra;
    }

    public double    sueldoBruto() {
        return sueldoBase + pagoPorHorasExtras();

    }

    public double calculoRetenciones() {
        double percepcion = this.percepcionIRPF; // 25
        if (this.casado) {
            percepcion -= 2; // 23
        }
        percepcion -= this.numHijos; // 21

        return this.sueldoBruto() * percepcion / 100;

//        double retencionBase = 0.05;
//        double retencionEspecial = 0.02;
//
//
//        double retencion = sueldoBruto() * retencionBase;
//
//        if (casado) {
//
//            retencion -= sueldoBruto() * retencionEspecial;
//
//        }
//        //resta 1 punto por cada hijo adicional
//        retencion -= sueldoBruto() * numHijos * 0.01;
//
//        //retencion a cero
//        if (retencion < 0) {
//
//            retencion = 0;
//        }
//        return (int) retencion;

    }

    public double sueldoNeto() {

        return sueldoBruto() - calculoRetenciones();


    }


    public void imprimirInfoBasica() {
        //System.out.println("NIF : " + nif + " , Sueldo base : " + sueldoBase + ", Casado: " + casado + ", Hijos: " + numHijos);
        System.out.println("nif = " + nif);
        System.out.println("sueldoBase = " + sueldoBase);
        System.out.println("casado = " + casado);
        System.out.println("numHijos = " + numHijos);
    }

    public void allInformation() {
        //System.out.println("NIF : " + nif + " , Sueldo base : " + sueldoBase + ", Casado: " + casado + ", Hijos: " + numHijos + ", Horas extras trabajadas " + horasExtrasMes + ", Valor hora: " + valorHoraExtra + "€" + ", Pago por horas extras: " + pagoPorHorasExtras() + "€" + ", Sueldo Bruto: " + sueldoBruto() + "€" + ", Retenciones : " + calculoRetenciones() + "€" + ", Sueldo Neto : " + sueldoNeto() + "€");
        imprimirInfoBasica();
        System.out.println("horasExtrasMes = " + horasExtrasMes);
        System.out.println("valorHoraExtra = " + valorHoraExtra);
        System.out.println("pagoPorHorasExtras() = " + pagoPorHorasExtras());
        System.out.println("calculoRetenciones() = " + calculoRetenciones());
    }

    //metodo copia

//    public Empleado copia(Empleado empleadito){
//
//          empleadito= new Empleado();
//
//
//        return empleadito;
//
//
//    }

    public Empleado copia() {

        return new Empleado(this.percepcionIRPF, this.nif, this.sueldoBase, this.casado, this.numHijos, this.horasExtrasMes, this.dni);


    }

    //getter y setters




}
