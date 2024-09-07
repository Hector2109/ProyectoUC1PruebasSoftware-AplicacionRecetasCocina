package org.itson.arquitecturasoftware.apprecetasc_dto;

/**
 *
 * @author Hector Espinoza
 * @author Jesus Castro
 * @author Enrique Rodriguez
 * @author Victoria Vega
 */
public class PasoDTO {
    
    int numero; //número de paso
    String descripcion; //descripción del paso

    /**
     * Constructor que declara un paso a seguir
     * @param numero número del paso
     * @param descripcion descripción del paso
     */
    public PasoDTO(int numero, String descripcion) {
        this.numero = numero;
        this.descripcion = descripcion;
    }

    /**
     * retorna número del paso
     * @return
     */
    public int getNumero() {
        return numero;
    }

    /**
     * modifica número del paso
     * @param numero
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * retorna la descripción del paso
     * @return descripción del paso
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * modifica la descripción del paso
     * @param descripcion
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.numero;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PasoDTO other = (PasoDTO) obj;
        return this.numero == other.numero;
    }
    
    
    
    
    
    
}
