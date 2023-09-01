package Enums;

public enum FormaPago {

    EFECTIVO, CREDITO, DEBITO, MERCADO_PAGO, OTRO;

    public static FormaPago getEFECTIVO() {
        return EFECTIVO;
    }

    public static FormaPago getCREDITO() {
        return CREDITO;
    }

    public static FormaPago getDEBITO() {
        return DEBITO;
    }

    public static FormaPago getMERCADO_PAGO() {
        return MERCADO_PAGO;
    }

    public static FormaPago getOTRO() {
        return OTRO;
    }

}
