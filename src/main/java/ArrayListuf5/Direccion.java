package ArrayListuf5;
/*Dirección: contiene los campos de la tabla relacionados con la dirección de la persona.
Debe contener los
atributos:
o calle (String): Calle donde vive la persona.
o cp (int): Código Postal de la calle.
o Provincia: Provincia donde se encuentra la calle.*/
public class Direccion {
    private String calle;
    private int cp;
    private String provincia;

public Direccion(String calle,int cp,String provincia){
    this.calle=calle;
    this.cp=cp;
    this.provincia=provincia;
}

    public String getCalle() {
        return calle;
    }

    public int getCp() {
        return cp;
    }

    public String getProvincia() {
        return provincia;
    }
}
