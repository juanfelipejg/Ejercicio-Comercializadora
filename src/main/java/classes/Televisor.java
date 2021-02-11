package classes;

public class Televisor extends Electrodomestico{

    private int tamaño;
    private boolean tdt;

    public Televisor(int id, String consumo, String procedencia, int tamaño, boolean tdt) {
        super(id, consumo, procedencia);
        this.tamaño = tamaño;
        this.tdt = tdt;
    }

    @Override
    public double calcularPrecio() {
        this.precio = calcularPrecioInicial();
        if (this.tamaño > 40){
            this.precio *=  1.3;
        }
        if (tdt){
            this.precio +=  250.000;
        }
        return this.precio;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public boolean isTdt() {
        return tdt;
    }

    public void setTdt(boolean tdt) {
        this.tdt = tdt;
    }
}
