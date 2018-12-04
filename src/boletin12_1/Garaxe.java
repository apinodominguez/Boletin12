package boletin12_1;

import javax.swing.JOptionPane;

public class Garaxe {
    
    private int numCochesTotal = 5;
    private int numCochesEstacionados;
    private String matricula;
    private int tiempoEstacionado;
    private double precio;
    private double dineroRecibido;
    
    private String dni;
    
    public int getPlazasDisponibles(){
        if (numCochesEstacionados < numCochesTotal){
            matricula = JOptionPane.showInputDialog("Hay plazas disponibles. \nRegistra la matricula del coche que va a estacionar");
            numCochesEstacionados ++;
        }
        else{
            JOptionPane.showMessageDialog(null, "El garaje está completo.");
        }
        return numCochesEstacionados;
    }
    
    public int setHorasEstacionado(){
          do{
            tiempoEstacionado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de horas que el vehiculo paso estacionado"));
            if(tiempoEstacionado <= 0)
                JOptionPane.showMessageDialog(null,"El numero introducido es incorrecto. intentalo de nuevo");
        }while(tiempoEstacionado <= 0);    
        return tiempoEstacionado;    
    }
    
    public double pagar(){
        do {
            dineroRecibido = Double.parseDouble(JOptionPane.showInputDialog("El total a pagar es de: " +precio+ "\nIntroduce la cantidad de dinero entregada por el cliente"));
            if (dineroRecibido < precio)
                JOptionPane.showMessageDialog(null,"El importe dado por el cliente es menor que el precio a pagar. Intentalo de nuevo");
        }while (dineroRecibido < precio);
        return dineroRecibido;
    }
    
    
    public double calcularPrecio(){
        if (tiempoEstacionado > 3)
            precio = 1.5 + (tiempoEstacionado - 3) * 0.2; 
        else{    
            precio = 1.5;
        }
        return precio;
    }
    
    public void facturaSaida(){
        setHorasEstacionado();calcularPrecio();pagar();
        JOptionPane.showMessageDialog(null,"FACTURA: \nMatricula coche: " +matricula+ "\nTiempo: " +tiempoEstacionado+ "horas\nPrecio: "
                +precio+ "€\nCartos recibidos: " +dineroRecibido+ "€\nCartos devoltos: " +(Math.round((dineroRecibido - precio)*100d)/100d)+ "€");
        
        
    }
        
        
    }
    

