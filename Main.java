public class Main {
    public static void main(String[] args) {
        ParqueAcua parque = new ParqueAcua(150.0);

        ComprasC compra = new ComprasC("Kevin");
        compra.setCostoComida(200.0);
        compra.setTipoEspec("VIP");
        compra.setTipoShowNado("extra");
        double totalCompra = parque.resumenCompra(compra.getCostoComida(), 300, 500);
        compra.mostrarResumenCompra(totalCompra);
    }
}
