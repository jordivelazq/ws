/**
 * Transaccion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mx.iessystems.soap.ws.www;

public class Transaccion implements java.io.Serializable {
    private int idCliente;

    private java.lang.String email;

    private java.lang.String password;

    private java.lang.String tipo;

    private java.lang.String fechaHora;

    private mx.iessystems.soap.ws.www.Mensaje[] mensajes;

    private int idivr;

    public Transaccion() {
    }

    public Transaccion(
            int idCliente,
            java.lang.String email,
            java.lang.String password,
            java.lang.String tipo,
            java.lang.String fechaHora,
            mx.iessystems.soap.ws.www.Mensaje[] mensajes,
            int idivr) {
        this.idCliente = idCliente;
        this.email = email;
        this.password = password;
        this.tipo = tipo;
        this.fechaHora = fechaHora;
        this.mensajes = mensajes;
        this.idivr = idivr;
    }

    /**
     * Gets the idCliente value for this Transaccion.
     * 
     * @return idCliente
     */
    public int getIdCliente() {
        return idCliente;
    }

    /**
     * Sets the idCliente value for this Transaccion.
     * 
     * @param idCliente
     */
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    /**
     * Gets the email value for this Transaccion.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }

    /**
     * Sets the email value for this Transaccion.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }

    /**
     * Gets the password value for this Transaccion.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }

    /**
     * Sets the password value for this Transaccion.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }

    /**
     * Gets the tipo value for this Transaccion.
     * 
     * @return tipo
     */
    public java.lang.String getTipo() {
        return tipo;
    }

    /**
     * Sets the tipo value for this Transaccion.
     * 
     * @param tipo
     */
    public void setTipo(java.lang.String tipo) {
        this.tipo = tipo;
    }

    /**
     * Gets the fechaHora value for this Transaccion.
     * 
     * @return fechaHora
     */
    public java.lang.String getFechaHora() {
        return fechaHora;
    }

    /**
     * Sets the fechaHora value for this Transaccion.
     * 
     * @param fechaHora
     */
    public void setFechaHora(java.lang.String fechaHora) {
        this.fechaHora = fechaHora;
    }

    /**
     * Gets the mensajes value for this Transaccion.
     * 
     * @return mensajes
     */
    public mx.iessystems.soap.ws.www.Mensaje[] getMensajes() {
        return mensajes;
    }

    /**
     * Sets the mensajes value for this Transaccion.
     * 
     * @param mensajes
     */
    public void setMensajes(mx.iessystems.soap.ws.www.Mensaje[] mensajes) {
        this.mensajes = mensajes;
    }

    /**
     * Gets the idivr value for this Transaccion.
     * 
     * @return idivr
     */
    public int getIdivr() {
        return idivr;
    }

    /**
     * Sets the idivr value for this Transaccion.
     * 
     * @param idivr
     */
    public void setIdivr(int idivr) {
        this.idivr = idivr;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Transaccion))
            return false;
        Transaccion other = (Transaccion) obj;
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
                this.idCliente == other.getIdCliente() &&
                ((this.email == null && other.getEmail() == null) ||
                        (this.email != null &&
                                this.email.equals(other.getEmail())))
                &&
                ((this.password == null && other.getPassword() == null) ||
                        (this.password != null &&
                                this.password.equals(other.getPassword())))
                &&
                ((this.tipo == null && other.getTipo() == null) ||
                        (this.tipo != null &&
                                this.tipo.equals(other.getTipo())))
                &&
                ((this.fechaHora == null && other.getFechaHora() == null) ||
                        (this.fechaHora != null &&
                                this.fechaHora.equals(other.getFechaHora())))
                &&
                ((this.mensajes == null && other.getMensajes() == null) ||
                        (this.mensajes != null &&
                                java.util.Arrays.equals(this.mensajes, other.getMensajes())))
                &&
                this.idivr == other.getIdivr();
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
        _hashCode += getIdCliente();
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getTipo() != null) {
            _hashCode += getTipo().hashCode();
        }
        if (getFechaHora() != null) {
            _hashCode += getFechaHora().hashCode();
        }
        if (getMensajes() != null) {
            for (int i = 0; i < java.lang.reflect.Array.getLength(getMensajes()); i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMensajes(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getIdivr();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
            Transaccion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.calixtaondemand.com", "Transaccion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idCliente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idCliente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("", "password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaHora");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fechaHora"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mensajes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mensajes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.calixtaondemand.com", "Mensaje"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idivr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idivr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
