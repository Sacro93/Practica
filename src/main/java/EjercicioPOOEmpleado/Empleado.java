package EjercicioPOOEmpleado;

public class Empleado {
    private int nif;
    private int sueldoBase;
    private int valorHoraExtra = 9;
    private int horasExtrasMes;
    private int percepcionIRPF;
    private boolean casado;
    private int numHijos;


    public Empleado() {

    }

    public Empleado(int nif, int sueldoBase, boolean casado, int numHijos, int horasExtrasMes) {

        this.nif = nif;
        this.sueldoBase = sueldoBase;
        this.casado = casado;
        this.numHijos = numHijos;
        this.horasExtrasMes = horasExtrasMes;

    }

//    public void pagoPorHsExtras() {
//        int valorTotal = horasExtrasMes * valorHoraExtra;
//        System.out.println(valorTotal);
//
//    }

    public int pagoPorHorasExtras() {
        return horasExtrasMes * valorHoraExtra;
    }

    public int sueldoBruto() {
        return sueldoBase + pagoPorHorasExtras();

    }

    public int calculoRetenciones() {
        double retencionBase = 0.05;
        double retencionEspecial = 0.02;


        double retencion = sueldoBruto() * retencionBase;

        if (casado) {

            retencion -= sueldoBruto() * retencionEspecial;

        }
        //resta 1 punto por cada hijo adicional
        retencion -= sueldoBruto() * numHijos * 0.01;

        //retencion a cero
        if (retencion < 0) {

            retencion = 0;
        }
        return (int) retencion;

    }

    public double sueldoNeto() {

        return  sueldoBruto() - calculoRetenciones();


    }

    public void imprimirInfoBasica() {
        System.out.println("NIF : " + nif + " , Sueldo base : " +
                sueldoBase + ", Casado: " + casado + ", Hijos: " + numHijos);

    }

    public void allInformation() {
        System.out.println("NIF : " + nif + " , Sueldo base : " +
                sueldoBase + ", Casado: " + casado + ", Hijos: " + numHijos + ", Horas extras trabajadas " + horasExtrasMes + ", Valor hora: " + valorHoraExtra +
                "€" + ", Pago por horas extras: " + pagoPorHorasExtras() + "€" + ", Sueldo Bruto: " + sueldoBruto() + "€" +
                ", Retenciones : " + calculoRetenciones() + "€" +
                ", Sueldo Neto : " + sueldoNeto() + "€");

    }


    //getter y setters

    public int getNif() {
        return nif;
    }

    public void setNif(int nif) {
        this.nif = nif;
    }

    public int getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(int sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public double getValorHoraExtra() {
        return valorHoraExtra;
    }

    public void setValorHoraExtra(double valorHoraExtra) {
        this.valorHoraExtra = (int) valorHoraExtra;
    }

    public double getHorasExtrasMes() {
        return horasExtrasMes;
    }

    public void setHorasExtrasMes(double horasExtrasMes) {
        this.horasExtrasMes = (int) horasExtrasMes;
    }

    public int getPercepcionIRPF() {
        return percepcionIRPF;
    }

    public void setPercepcionIRPF(int percepcionIRPF) {
        this.percepcionIRPF = percepcionIRPF;
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public int getNumHijos() {
        return numHijos;
    }

    public void setNumHijos(int numHijos) {
        this.numHijos = numHijos;
    }


}
