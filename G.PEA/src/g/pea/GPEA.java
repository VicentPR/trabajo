/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g.pea;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/**
 *
 * @author Duoc
 */
public class GPEA {

    /**
     * @param args the command line arguments
     */public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        String lectura;
        int numero;
        int opcion;
        String producto;
        double precio;
        LocalDate fechaMaxima = LocalDate.parse("2025-09-16");
        LocalDate fechaIngreso = null;
        boolean fechaValida = false;
      
        
       
        
        Cliente cliente1 = new Cliente();
       
        
        pedidos pedido1 = new Pedido();
        
           
        Producto producto1 = new Producto();
        
       
        
        Zona zona1 = new Zona(1902,"Santiago","alameda");
        
      
        
        vendedor vendedor1 = new vendedor();
        
         
 
        
        
        
        
        do{
            
            System.out.println("=== SISTEMA DE PEDIDOS DE EQUIPAJE Y ACCESORIOS DE VIAJE ===");
            System.out.println("1. Ingresar Cliente");
            System.out.println("2. Ingresar Vendedor");
            System.out.println("3. Ingresar Producto");
            System.out.println("4. Generar Pedido");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = leer.nextInt();
            
            
            switch (opcion){
                
                case 1 -> {
                    System.out.println("-- INGRESO DE CLIENTE --");
                    System.out.println("Ingrese RUT del cliente: ");
                    lectura = leer.next();
                    cliente1.setRut();
                    
                    
                    do {
                        System.out.println("Ingrese nombre del cliente: ");
                        lectura = leer.next();
                        
                        if(!cliente1.comprobarNombre(lectura)){   // nombre inválido
                            System.out.println("Error: el nombre no puede estar vacío");
                        } else {
                            System.out.println("Nombre ingresado con éxito!");
                        }
                        
                    } while (!cliente1.comprobarNombre(lectura)); // repetir si el nombre es inválido
                    
                    
                    cliente1.setnombre(lectura);
                    
                    System.out.println("Ingrese edad del cliente: ");
                    numero = leer.nextInt();
                    
                    if (cliente1.comprobarEdad(numero)){
                        
                    }else{
                        break;
                    }
                    
                    cliente1.setEdad(numero);
                   
                    do {
                        
                        
                        System.out.println("Ingrese fecha de nacimiento (AAAA-MM-DD): ");
                        lectura = leer.next();
                        
                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                        try {
                            LocalDate fecha = LocalDate.parse(lectura, formatter);
                            cliente1.setFechaNacimiento(fecha);
                            System.out.println("Cliente registrado con éxito!");
                            fechaValida = true;
                            // ahora el setter recibe un LocalDate
                        } catch (DateTimeParseException e) {
                            System.out.println("Formato de fecha incorrecto. Intente nuevamente.");
                        }
                        
                        
                        
                    }while (fechaValida != true);
                }
                    
                   
                case 2 -> {
                    System.out.println("-- INGRESO DE VENDEDOR --");
                    System.out.println("Ingrese RUT: ");
                    lectura = leer.next();
                    vendedor1.setRut(lectura);
                    
                    
                    System.out.println("Ingrese número de vendedor: ");
                    numero = leer.nextInt();
                    vendedor1.setNroVendedor(numero);
                    
                    
                    System.out.println("Ingrese nombre de vendedor: ");
                    lectura = leer.next();
                    
                    do{
                        if(!vendedor1.comprobarNombre(lectura)){
                            System.out.println("El nombre no debe estar vacio!");
                            
                        }else{
                            System.out.println("Nombre ingresado con exito!");
                        }
                        
                    }while (!vendedor1.comprobarNombre(lectura));
                    
                    vendedor1.setNombre(lectura);
                    
                    do {
                        System.out.println("Ingrese fecha de ingreso (AAAA-MM-DD): ");
                        lectura = leer.next();
                        
                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                        try {
                            fechaIngreso = LocalDate.parse(lectura, formatter);
                            
                            if (fechaIngreso.isAfter(fechaMaxima)) {
                                System.out.println("Error: la fecha de ingreso no puede ser posterior a " + fechaMaxima);
                                fechaValida = false; // la fecha no es válida
                            } else {
                                fechaValida = true;  // fecha válida
                            }
                        } catch (DateTimeParseException e) {
                            System.out.println("Formato de fecha incorrecto. Intente nuevamente.");
                            fechaValida = false;
                        }
                        
                    } while (!fechaValida);
                    
                    vendedor1.setFechaIngreso(fechaIngreso);
                    System.out.println("Fecha de ingreso registrada correctamente: " + fechaIngreso);
                    
                    
                    do {
                        System.out.println("Ingrese la zona en la que trabaja: ");
                        lectura = leer.next().toLowerCase();
                        
                        if (!lectura.equals(zona1.getNombre().toLowerCase())) {
                            System.out.println("Error: la zona debe ser " + zona1.getNombre());
                        }
                        
                    } while (!lectura.equals(zona1.getNombre().toLowerCase()));

                    vendedor1.setRegionTrabaja(lectura);
                    System.out.println("Vendedor ingresado con éxito!");
                }

                case 3 -> {
                    System.out.println("Ingrese el codigo unico del producto: ");
                    lectura = leer.next();
                    producto1.setCodigoUnico(lectura);
                    
                    System.out.println("Ingrese el nombre del producto: ");
                    lectura = leer.next();
                    producto1.setNombre(lectura);
                    
                    
                    do {
                        System.out.println("Ingrese el tipo (Maleta/Mochila/Bolso): ");
                        producto = leer.next().toLowerCase().trim();
                        
                        if (producto.equals("maleta") || producto.equals("mochila") || producto.equals("bolso")) {
                            System.out.println("Producto válido!");
                        } else {
                            System.out.println("Debes ingresar un producto válido: (Maleta/Mochila/Bolso)");
                        }
                        
                    } while (!producto.equals("maleta") || producto.equals("mochila") || producto.equals("bolso"));

                    producto1.setTipo(producto);
                    System.out.println("Producto registrado con éxito!");
                    
                    
                    
                    System.out.println("Ingrese el precio unitario: ");
                    precio = leer.nextDouble();
                    producto1.setPrecioUnitario(precio);

                    //Lo dejo para resolver despues.
                    //Si cliente tiene 65 años se aplica descuento del 50% al producto bruto.
                    //Primero aplicar descuento por edad y luego descuento por valor total.
                    
                    
                    
                    System.out.println("Ingrese la cantidad: ");
                    numero = leer.nextInt();
                    
                    pedido1.setCantidadSolicitada(numero);
                    pedido1.totalBruto(producto1);
                }
                    
                    
                    
                case 4 -> {
                    System.out.println("==== PEDIDO =====");
                    System.out.println("Código producto: " + producto1.getCodigoUnico());
                    System.out.println("Tipo: " + producto1.getTipo());
                    System.out.println("Precio Unitario: " + producto1.getPrecioUnitario());
                    System.out.println("Vendedor: " + vendedor1.getNombre());
                    System.out.println("Cliente: " + cliente1.getNombre());
                    System.out.println("Edad: " + cliente1.getEdad());
                    System.out.println("Cantidad Solicitada: " + pedido1.getCantidadSolicitada());

                    double bruto = pedido1.totalBruto(producto1);
                    System.out.println("Total Bruto: " + bruto);

                    boolean valido = pedido1.validarPedido(cliente1);
                    System.out.println("Pedido válido: " + valido);

                    double neto = pedido1.totalNeto(producto1);
                    System.out.println("Total Neto (con descuento): " + neto);
                }

                    
                case 5 -> System.out.println("Saliendo del sistema...");
                default -> System.out.println("Seleccione una opcion válida");
                
            }
            
        }while(opcion != 5);
        leer.close();
        
        
        
    }
  
        
    
 
    }

    
