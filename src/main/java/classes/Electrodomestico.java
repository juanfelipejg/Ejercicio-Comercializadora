package classes;

public abstract class Electrodomestico {

    //Atributos comunes en televisor y nevera
    private int id ;
    private String consumo;
    private String procedencia;
    public double precio;

    public Electrodomestico(int id, String consumo, String procedencia) {
        this.id = id;
        this.consumo = consumo;
        this.procedencia = procedencia;
    }

    public abstract double calcularPrecio();

    //Metodo para calcular un precio base y ser reutilizado
    public double calcularPrecioInicial(){
        if (this.consumo == "A"){
            this.precio = 450.000;
        }else if (this.consumo == "B"){
            this.precio = 350.000;
        }else if (this.consumo == "C"){
            this.precio = 250.000;
        }
        return this.precio;
    }
}
