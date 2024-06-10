package ArrayListuf5;

/*Persona: contiene los campos de la tabla relacionados con los datos personales de la persona.
Debe contener los
siguientes atributos:
o nombre (String): nombre de la persona.
o apellidos (String): apellidos de la persona.
o dni (String): Documento nacional de identidad de la persona.
o edad (int): Edad de la persona.
o direccion (Direccion): atributo a partir la clase Dirección. */
public class Persona {
    private String nombre;
    private String apellidos;
    private String dni;
    private String edad;
    private Direccion direccion;

    public Persona(String nombre, String apellidos, String dni, String edad, Direccion direccion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.edad = edad;
        this.direccion=direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
}
