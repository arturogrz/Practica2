package practica2;

public class Compu extends Laptop{
    private String modelo;
    private String tamaño;
    private int stock;

    public Compu(String marca, String color, int precio, String modelo,String tamaño,int stock) {
        super(marca, color, precio);
        this.modelo = modelo;
        this.tamaño = tamaño;
        this.stock = stock;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    

    
}
