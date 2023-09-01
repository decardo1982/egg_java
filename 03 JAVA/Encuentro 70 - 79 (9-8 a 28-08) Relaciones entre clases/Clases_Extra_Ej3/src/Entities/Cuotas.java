package Entities;

import Enums.FormaPago;
import java.util.Date;

public class Cuotas {

    private Integer numCuota;
    private Integer montoCuota;
    private boolean cuotaPaga;
    private Date fechaVencimientoCuota;
    private FormaPago formaPagoCuota;
    private Poliza poliza;

    public Cuotas() {
    }

    public Cuotas(Integer numCuota, Integer montoCuota, boolean cuotaPaga, Date fechaVencimientoCuota, FormaPago formaPagoCuota, Poliza poliza) {
        this.numCuota = numCuota;
        this.montoCuota = montoCuota;
        this.cuotaPaga = cuotaPaga;
        this.fechaVencimientoCuota = fechaVencimientoCuota;
        this.formaPagoCuota = formaPagoCuota;
        this.poliza = poliza;
    }

    public Integer getNumCuota() {
        return numCuota;
    }

    public void setNumCuota(Integer numCuota) {
        this.numCuota = numCuota;
    }

    public Integer getMontoCuota() {
        return montoCuota;
    }

    public void setMontoCuota(Integer montoCuota) {
        this.montoCuota = montoCuota;
    }

    public boolean isCuotaPaga() {
        return cuotaPaga;
    }

    public void setCuotaPaga(boolean cuotaPaga) {
        this.cuotaPaga = cuotaPaga;
    }

    public Date getFechaVencimientoCuota() {
        return fechaVencimientoCuota;
    }

    public void setFechaVencimientoCuota(Date fechaVencimientoCuota) {
        this.fechaVencimientoCuota = fechaVencimientoCuota;
    }

    public FormaPago getFormaPagoCuota() {
        return formaPagoCuota;
    }

    public void setFormaPagoCuota(FormaPago formaPagoCuota) {
        this.formaPagoCuota = formaPagoCuota;
    }

    public Poliza getPoliza() {
        return poliza;
    }

    public void setPoliza(Poliza poliza) {
        this.poliza = poliza;
    }

    @Override
    public String toString() {
        return "Cuotas{" + "numCuota=" + numCuota + ", montoCuota=" + montoCuota + ", cuotaPaga=" + cuotaPaga + ", fechaVencimientoCuota=" + fechaVencimientoCuota + ", formaPagoCuota=" + formaPagoCuota + ", poliza=" + poliza + '}';
    }

}
