import java.util.Scanner;

public class MetodoPago {
    Scanner sc = new Scanner(System.in);

    public void mostrarMenu(){ 
    String tipo;
    System.out.println("Digame el tipo de pago");
    tipo = sc.nextLine();

    ProcesarPago na = new ProcesarPago();
    na.setProcesar(tipo);

    if(na.getProcesar().equals("pago con criptomoneda")){
        PagoConCriptomoneda n2 = new PagoConCriptomoneda();
        n2.dato();
        mostrarMenu();
    }else if (na.getProcesar().equals("pago con efectivo")){
        PagoConEfectivo n3 = new PagoConEfectivo();
        n3.dato();
        mostrarMenu();
    }
    else if(na.getProcesar().equals("pago con tarjeta")){
        PagoConTarjeta n4 = new PagoConTarjeta();
        n4.dato();
        mostrarMenu();
        }
    else if(na.getProcesar().equals("salir")){
        System.out.println("Saliendo del proceso");
        sc.close();
    }
        else{
            System.out.println("Ninguno de los campos.");
            mostrarMenu();
        }
    }
}