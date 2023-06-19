public class ComprasC {
    private final String nombreCliente;
    private double costoComida;
    private String tipoEspec;
    private String tipoShowNado;

    public ComprasC(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setCostoComida(double costoComida) {
        this.costoComida = costoComida;
    }

    public void setTipoEspec(String tipoEspec) {
        this.tipoEspec = tipoEspec;
    }

    public void setTipoShowNado(String tipoShowNado) {
        this.tipoShowNado = tipoShowNado;
    }

    public double getCostoComida() {
        return costoComida;
    }

    public String getTipoEspec() {
        return tipoEspec;
    }

    public String getTipoShowNado() {
        return tipoShowNado;
    }

    public void mostrarResumenCompra(double totalCompra) {
        System.out.println("Resumen de la compra");
        System.out.println("--------------------");
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Total a pagar: " + totalCompra + " mx");
    }
}
