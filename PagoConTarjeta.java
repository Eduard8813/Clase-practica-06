public class PagoConTarjeta extends ProcesarPago{
    @Override
    public Void dato() {
        System.out.println("El tipo de dato es con tarjeta.");
        return super.dato();
    }
}
