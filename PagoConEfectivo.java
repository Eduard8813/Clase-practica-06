public class PagoConEfectivo extends ProcesarPago{
    @Override
    public Void dato() {
        System.out.println("El tipo de dato es con efectivo.");
        return super.dato();
    }
}
