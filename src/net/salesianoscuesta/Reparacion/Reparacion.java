
package net.salesianoscuesta.Reparacion;

import java.util.Objects;

public class Reparacion {
    private String codigo;
    private String cliente;
    private String descripcion;
    private boolean urgente;

    public Reparacion(String codigo, String cliente, String descripcion, boolean urgente) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.descripcion = descripcion;
        this.urgente = urgente;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getCliente() {
        return cliente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean isUrgente() {
        return urgente;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setUrgente(boolean urgente) {
        this.urgente = urgente;
    }

    @Override
    public String toString() {
        return String.format("[%s] Cliente: %-10s | %-20s | Urgente: %s",
                codigo, cliente, descripcion, (urgente ? "SÍ" : "NO"));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        Reparacion otraReparacion = (Reparacion) o;

        return this.codigo.equals(otraReparacion.codigo);
    }
}
