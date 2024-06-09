public class POOCafetera {
    private int capacidadMaxima;
    private int cantidadActualCafetera;


    //constructor con capacidad maxima en 1000 y cantidad actual en 0;
    public POOCafetera() {
        this.cantidadActualCafetera = 0;
        this.capacidadMaxima = 1000;
    }

    //construnctor con la capaciad maxima de la cafetera ,
    // inicializa la cantidad actual de cafe igual a la capacidad maxima;
    public POOCafetera(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActualCafetera = capacidadMaxima;
    }

    //Constructor con la capacidad maxima y la cantidad actual.
    // Si la cantidad actual es  mayor que la capacidad maxima la ajustara al maximo

    public POOCafetera(int capacidadMaxima, int cantidadActual) {

        if (cantidadActual > capacidadMaxima) {
            this.capacidadMaxima = cantidadActual;
        } else {
            this.cantidadActualCafetera = cantidadActual;

        }
    }

    //esto hace que la cantidad actual sea igual a la capacidad
    public void llenarCafetera() {
        this.cantidadActualCafetera = this.capacidadMaxima;
    }

    //simula la accion de servir una taza con la capacidad indicada  .
    // Si la cantidad de cafe no alcanza para llenar la taza
    //se sirve lo que quede
    public void servirTaza(int capacidadTaza) {

        if (capacidadTaza <= this.cantidadActualCafetera) {
            //si hay suficiente cafe para llenar la taza
            this.cantidadActualCafetera -= capacidadTaza;
        } else {

            //se sirve lo que queda y cafetera vacia
            capacidadTaza = this.cantidadActualCafetera;
            this.cantidadActualCafetera = 0;
        }
    }

    //vaciar cafetera, pone el cafe actual en cero

    public int vaciarCafetera() {
        if (cantidadActualCafetera > 0) {
            this.cantidadActualCafetera = 0;
        }
        return 0;
    }

    //añade a la cafetera la cantidad de cafe asignada ;
    public void agregarCafe(int cantidadAServir) {

        if (this.cantidadActualCafetera +cantidadAServir < this.capacidadMaxima) {
            cantidadActualCafetera += cantidadAServir;
        }else
        {
           cantidadActualCafetera= capacidadMaxima;
           throw new RuntimeException("Si llenas se desborda");
        }
    }


}





