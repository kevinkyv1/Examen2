public class ParqueAcua {
    private final double entrada;

    public ParqueAcua(double entrada) {
        this.entrada = entrada;
    }

    public double resumenCompra() {
        return entrada;
    }

    public double resumenCompra(double precioComidaBuffet) {
        return entrada + precioComidaBuffet;
    }

    public double resumenCompra(double precioComidaBuffet, double precioEspectaculo) {
        return entrada + precioComidaBuffet + precioEspectaculo;
    }

    public double resumenCompra(double precioComidaBuffet, double precioEspectaculo, double precioNadoDelfines) {
        return entrada + precioComidaBuffet + precioEspectaculo + precioNadoDelfines;
    }
}
