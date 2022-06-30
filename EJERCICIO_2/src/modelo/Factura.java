package modelo;

/**
 * Fecha:  30/06/2022
 * @author K.G - Thaisncp - ronaldcuenca19
 */
public class Factura {
    private Integer id;
    private Double subtotal;
    private Double iva;
    private Double total; 
    private String fechaEmitida;
    private Cliente cliente;
    private Compra compra;

    public Factura(Integer id, Double subtotal, Double iva, Double total, String fechaEmitida, Cliente cliente, Compra compra) {
        this.id = id;
        this.subtotal = subtotal;
        this.iva = iva;
        this.total = total;
        this.fechaEmitida = fechaEmitida;
        this.cliente = cliente;
        this.compra = compra;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public Double getIva() {
        return iva;
    }

    public void setIva(Double iva) {
        this.iva = iva;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public String getFechaEmitida() {
        return fechaEmitida;
    }

    public void setFechaEmitida(String fechaEmitida) {
        this.fechaEmitida = fechaEmitida;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

}