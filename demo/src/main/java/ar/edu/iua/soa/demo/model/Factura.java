package ar.edu.iua.soa.demo.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "factura")
public class Factura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_factura")
    private Integer idFactura;

    @Column(name = "id_comprador")
    private Integer idComprador;

    @Column(name = "id_vendedor")
    private Integer idVendedor;

    @Column(name = "id_producto")
    private Integer idProducto;

    @Column(name = "id_pago")
    private Integer idPago;

    @Column(name = "fecha_factura")
    private Date fechaFactura;

    @Column(name = "estado_factura")
    private Integer estadoFactura;

    public Factura(Integer idFactura, Integer idComprador, Integer idVendedor, Integer idProducto, Integer idPago,
                       Date fechaFactura,Integer estadoFactura) {
        super();
        this.idFactura = idFactura;
        this.idComprador = idComprador;
        this.idVendedor = idVendedor;
        this.idProducto = idProducto;
        this.idPago = idPago;
        this.fechaFactura = fechaFactura;
        this.estadoFactura = estadoFactura;
    }

    public Factura(){
        super();
    }

    public Integer getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(Integer idFactura) {
        this.idFactura = idFactura;
    }

    public Integer getIdComprador() {
        return idComprador;
    }

    public void setIdComprador(Integer idComprador) {
        this.idComprador = idComprador;
    }

    public Integer getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(Integer idVendedor) {
        this.idVendedor = idVendedor;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public Integer getIdPago() {
        return idPago;
    }

    public void setIdPago(Integer idPago) {
        this.idPago = idPago;
    }

    public Date getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(Date fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public Integer getEstadoFactura() {
        return estadoFactura;
    }

    public void setEstadoFactura(Integer estadoFactura) {
        this.estadoFactura = estadoFactura;
    }
}
