public class PagoConCriptomoneda extends ProcesarPago{
    @Override
    public Void dato() {
        System.out.println("El tipo de pago es criptomoneda.");
        return super.dato();
    }
}
