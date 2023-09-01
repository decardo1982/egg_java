package Enums;

public enum TipoCobertura {

    RESPONSABILIDAD_CIVIL, TOTAL, TERCEROS;

    public static TipoCobertura getRESPONSABILIDAD_CIVIL() {
        return RESPONSABILIDAD_CIVIL;
    }

    public static TipoCobertura getTOTAL() {
        return TOTAL;
    }

    public static TipoCobertura getTERCEROS() {
        return TERCEROS;
    }

}
