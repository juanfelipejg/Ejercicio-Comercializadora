package classes;

public class Nevera extends Electrodomestico{

    public int capacidad;

    public Nevera(int id, String consumo, String procedencia, int capacidad) {
        super(id, consumo, procedencia);
        this.capacidad = capacidad;
    }

    @Override
    public double calcularPrecio() {
        this.precio = calcularPrecioInicial();
        if(this.capacidad > 120){
            int diferencia = this.capacidad - 120;
            int excedente = diferencia / 10;
            this.precio += this.precio *(0.05 * excedente);
        }
        return this.precio;
    }
}
