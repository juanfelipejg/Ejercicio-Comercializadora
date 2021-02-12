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
        if (this.consumo.equalsIgnoreCase("A")){
            this.precio = 450000;
        }else if (this.consumo.equalsIgnoreCase("B")){
            this.precio = 350000;
        }else if (this.consumo.equalsIgnoreCase("C")){
            this.precio = 250000;
        }

        if (this.procedencia.equalsIgnoreCase("N")){
            this.precio += 250000;
        }else{
            this.precio += 350000;
        }
        return this.precio;
    }
}
