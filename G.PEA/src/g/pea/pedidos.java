/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g.pea;

/**
 *
 * @author Duoc
 */
public class pedidos {
    private String registrarProducto;
    private String registrarVendedor;
    private int cantidadSolicitada;
    private String fechaPedido;

    public pedidos) static {
    }

    public pedidosString registrarCliente, String registrarProducto, String registrarVendedor, int cantidadSolicitada, String fechaPedido) {
        this.registrarCliente = registrarCliente;
        this.registrarProducto = registrarProducto;
        this.registrarVendedor = registrarVendedor;
        this.cantidadSolicitada = cantidadSolicitada;
        this.fechaPedido = fechaPedido;
    }
    
  
    
          public double totalBruto(Producto precio){
        double total = 0;
        
        
        total = cantidadSolicitada * precio.getPrecioUnitario();
        
        return total; 
    }

    public double totalNeto(Producto producto){
        double totalBruto = totalBruto(producto);
        double descuento = 0;

        if (totalBruto > 60000) {
            descuento = 0.15;
    } else if (totalBruto > 120000) {
            descuento = 0.25;
    }

    return totalBruto - (totalBruto * descuento);
    }


    public boolean validarPedido(Cliente cliente){
       
        return cliente.comprobarEdad(cliente.getedad()) && cliente.comprobarNombre(cliente.getnombre());
    }
    

    
    public String getRegistrarCliente() {
        return registrarCliente;
    }

    public void setRegistrarCliente(String registrarCliente) {
        this.registrarCliente = registrarCliente;
    }

    public String getRegistrarProducto() {
        return registrarProducto;
    } 

    public void setRegistrarProducto(String registrarProducto) {
        this.registrarProducto = registrarProducto;
    }

    public String getRegistrarVendedor() {
        return registrarVendedor;
    }

    public void setRegistrarVendedor(String registrarVendedor) {
        this.registrarVendedor = registrarVendedor;
    }

    public int getCantidadSolicitada() {
        return cantidadSolicitada;
    }

    public void setCantidadSolicitada(int cantidadSolicitada) {
        this.cantidadSolicitada = cantidadSolicitada;
    }

    public String getFechaPedido() {
        return fechaPedido;
}
