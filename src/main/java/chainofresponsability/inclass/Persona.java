package chainofresponsability.inclass;

public class Persona {
    private String nombre;
    private boolean tieneCertificadoNacimiento;
    private boolean hizoPagoAlBanco;
    private boolean tieneFichaAtencion;

    public String getNombre() {
        return nombre;
    }

    public Persona setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public boolean isTieneCertificadoNacimiento() {
        return tieneCertificadoNacimiento;
    }

    public Persona setTieneCertificadoNacimiento(boolean tieneCertificadoNacimiento) {
        this.tieneCertificadoNacimiento = tieneCertificadoNacimiento;
        return this;
    }

    public boolean isHizoPagoAlBanco() {
        return hizoPagoAlBanco;
    }

    public Persona setHizoPagoAlBanco(boolean hizoPagoAlBanco) {
        this.hizoPagoAlBanco = hizoPagoAlBanco;
        return this;
    }

    public boolean isTieneFichaAtencion() {
        return tieneFichaAtencion;
    }

    public Persona setTieneFichaAtencion(boolean tieneFichaAtencion) {
        this.tieneFichaAtencion = tieneFichaAtencion;
        return this;
    }
}
