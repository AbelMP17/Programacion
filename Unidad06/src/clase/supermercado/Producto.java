/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.supermercado;

/**
 *
 * @author usuario
 */
public record Producto(String nombre, String marca, int precio) {
    public Producto{
        if(precio<=0){
            throw new IllegalArgumentException("Precio negativo");
        }
    }
    @Override
    public String toString(){
        return "Nombre Producto: %s  / Marca: %s (Precio: %d €)".formatted(nombre,marca,precio);
    }
}
