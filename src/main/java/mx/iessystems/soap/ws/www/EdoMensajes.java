/**
 * EdoMensajes.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mx.iessystems.soap.ws.www;

public class EdoMensajes implements java.io.Serializable {
    private java.lang.String tipo;

    private java.lang.String telefono;

    private double costo;

    private java.lang.String fechaHora;

    private java.lang.String estado;

    private java.lang.String lista;

    private int idEnvio;

    private int idEstado;

    private java.lang.String mensaje;

    private java.lang.String destino;

    private java.lang.String campoAux;

    public EdoMensajes() {
    }

    public EdoMensajes(
            java.lang.String tipo,
            java.lang.String telefono,
            double costo,
            java.lang.String fechaHora,
            java.lang.String estado,
            java.lang.String lista,
            int idEnvio,
            int idEstado,
            java.lang.String mensaje,
            java.lang.String destino,
            java.lang.String campoAux) {
        this.tipo = tipo;
        this.telefono = telefono;
        this.costo = costo;
        this.fechaHora = fechaHora;
        this.estado = estado;
        this.lista = lista;
        this.idEnvio = idEnvio;
        this.idEstado = idEstado;
        this.mensaje = mensaje;
        this.destino = destino;
        this.campoAux = campoAux;
    }

    /**
     * Gets the tipo value for this EdoMensajes.
     * 
     * @return tipo
     */
    public java.lang.String getTipo() {
        return tipo;
    }

    /**
     * Sets the tipo value for this EdoMensajes.
     * 
     * @param tipo
     */
    public void setTipo(java.lang.String tipo) {
        this.tipo = tipo;
    }

    /**
     * Gets the telefono value for this EdoMensajes.
     * 
     * @return telefono
     */
    public java.lang.String getTelefono() {
        return telefono;
    }

    /**
     * Sets the telefono value for this EdoMensajes.
     * 
     * @param telefono
     */
    public void setTelefono(java.lang.String telefono) {
        this.telefono = telefono;
    }

    /**
     * Gets the costo value for this EdoMensajes.
     * 
     * @return costo
     */
    public double getCosto() {
        return costo;
    }

    /**
     * Sets the costo value for this EdoMensajes.
     * 
     * @param costo
     */
    public void setCosto(double costo) {
        this.costo = costo;
    }

    /**
     * Gets the fechaHora value for this EdoMensajes.
     * 
     * @return fechaHora
     */
    public java.lang.String getFechaHora() {
        return fechaHora;
    }

    /**
     * Sets the fechaHora value for this EdoMensajes.
     * 
     * @param fechaHora
     */
    public void setFechaHora(java.lang.String fechaHora) {
        this.fechaHora = fechaHora;
    }

    /**
     * Gets the estado value for this EdoMensajes.
     * 
     * @return estado
     */
    public java.lang.String getEstado() {
        return estado;
    }

    /**
     * Sets the estado value for this EdoMensajes.
     * 
     * @param estado
     */
    public void setEstado(java.lang.String estado) {
        this.estado = estado;
    }

    /**
     * Gets the lista value for this EdoMensajes.
     * 
     * @return lista
     */
    public java.lang.String getLista() {
        return lista;
    }

    /**
     * Sets the lista value for this EdoMensajes.
     * 
     * @param lista
     */
    public void setLista(java.lang.String lista) {
        this.lista = lista;
    }

    /**
     * Gets the idEnvio value for this EdoMensajes.
     * 
     * @return idEnvio
     */
    public int getIdEnvio() {
        return idEnvio;
    }

    /**
     * Sets the idEnvio value for this EdoMensajes.
     * 
     * @param idEnvio
     */
    public void setIdEnvio(int idEnvio) {
        this.idEnvio = idEnvio;
    }

    /**
     * Gets the idEstado value for this EdoMensajes.
     * 
     * @return idEstado
     */
    public int getIdEstado() {
        return idEstado;
    }

    /**
     * Sets the idEstado value for this EdoMensajes.
     * 
     * @param idEstado
     */
    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    /**
     * Gets the mensaje value for this EdoMensajes.
     * 
     * @return mensaje
     */
    public java.lang.String getMensaje() {
        return mensaje;
    }

    /**
     * Sets the mensaje value for this EdoMensajes.
     * 
     * @param mensaje
     */
    public void setMensaje(java.lang.String mensaje) {
        this.mensaje = mensaje;
    }

    /**
     * Gets the destino value for this EdoMensajes.
     * 
     * @return destino
     */
    public java.lang.String getDestino() {
        return destino;
    }

    /**
     * Sets the destino value for this EdoMensajes.
     * 
     * @param destino
     */
    public void setDestino(java.lang.String destino) {
        this.destino = destino;
    }

    /**
     * Gets the campoAux value for this EdoMensajes.
     * 
     * @return campoAux
     */
    public java.lang.String getCampoAux() {
        return campoAux;
    }

    /**
     * Sets the campoAux value for this EdoMensajes.
     * 
     * @param campoAux
     */
    public void setCampoAux(java.lang.String campoAux) {
        this.campoAux = campoAux;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EdoMensajes))
            return false;
        EdoMensajes other = (EdoMensajes) obj;
        if (obj == null)
            return false;
        if (this == obj)
            return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.tipo == null && other.getTipo() == null) ||
                        (this.tipo != null &&
                                this.tipo.equals(other.getTipo())))
                &&
                ((this.telefono == null && other.getTelefono() == null) ||
                        (this.telefono != null &&
                                this.telefono.equals(other.getTelefono())))
                &&
                this.costo == other.getCosto() &&
                ((this.fechaHora == null && other.getFechaHora() == null) ||
                        (this.fechaHora != null &&
                                this.fechaHora.equals(other.getFechaHora())))
                &&
                ((this.estado == null && other.getEstado() == null) ||
                        (this.estado != null &&
                                this.estado.equals(other.getEstado())))
                &&
                ((this.lista == null && other.getLista() == null) ||
                        (this.lista != null &&
                                this.lista.equals(other.getLista())))
                &&
                this.idEnvio == other.getIdEnvio() &&
                this.idEstado == other.getIdEstado() &&
                ((this.mensaje == null && other.getMensaje() == null) ||
                        (this.mensaje != null &&
                                this.mensaje.equals(other.getMensaje())))
                &&
                ((this.destino == null && other.getDestino() == null) ||
                        (this.destino != null &&
                                this.destino.equals(other.getDestino())))
                &&
                ((this.campoAux == null && other.getCampoAux() == null) ||
                        (this.campoAux != null &&
                                this.campoAux.equals(other.getCampoAux())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getTipo() != null) {
            _hashCode += getTipo().hashCode();
        }
        if (getTelefono() != null) {
            _hashCode += getTelefono().hashCode();
        }
        _hashCode += new Double(getCosto()).hashCode();
        if (getFechaHora() != null) {
            _hashCode += getFechaHora().hashCode();
        }
        if (getEstado() != null) {
            _hashCode += getEstado().hashCode();
        }
        if (getLista() != null) {
            _hashCode += getLista().hashCode();
        }
        _hashCode += getIdEnvio();
        _hashCode += getIdEstado();
        if (getMensaje() != null) {
            _hashCode += getMensaje().hashCode();
        }
        if (getDestino() != null) {
            _hashCode += getDestino().hashCode();
        }
        if (getCampoAux() != null) {
            _hashCode += getCampoAux().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
            EdoMensajes.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.calixtaondemand.com", "EdoMensajes"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telefono");
        elemField.setXmlName(new javax.xml.namespace.QName("", "telefono"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "costo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaHora");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fechaHora"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "estado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lista");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lista"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idEnvio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idEnvio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idEstado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idEstado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mensaje");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mensaje"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destino");
        elemField.setXmlName(new javax.xml.namespace.QName("", "destino"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campoAux");
        elemField.setXmlName(new javax.xml.namespace.QName("", "campoAux"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
            java.lang.String mechType,
            java.lang.Class _javaType,
            javax.xml.namespace.QName _xmlType) {
        return new org.apache.axis.encoding.ser.BeanSerializer(
                _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
            java.lang.String mechType,
            java.lang.Class _javaType,
            javax.xml.namespace.QName _xmlType) {
        return new org.apache.axis.encoding.ser.BeanDeserializer(
                _javaType, _xmlType, typeDesc);
    }

}
