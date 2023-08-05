/**
 * TransaccionCSV.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mx.iessystems.soap.ws.www;

public class TransaccionCSV implements java.io.Serializable {
    private int idCliente;

    private java.lang.String email;

    private java.lang.String password;

    private java.lang.String tipo;

    private java.lang.String fechaHora;

    private java.lang.String csv;

    private java.lang.String mensaje;

    private int idivr;

    private java.lang.String nombreEnvio;

    public TransaccionCSV() {
    }

    public TransaccionCSV(
            int idCliente,
            java.lang.String email,
            java.lang.String password,
            java.lang.String tipo,
            java.lang.String fechaHora,
            java.lang.String csv,
            java.lang.String mensaje,
            int idivr,
            java.lang.String nombreEnvio) {
        this.idCliente = idCliente;
        this.email = email;
        this.password = password;
        this.tipo = tipo;
        this.fechaHora = fechaHora;
        this.csv = csv;
        this.mensaje = mensaje;
        this.idivr = idivr;
        this.nombreEnvio = nombreEnvio;
    }

    /**
     * Gets the idCliente value for this TransaccionCSV.
     * 
     * @return idCliente
     */
    public int getIdCliente() {
        return idCliente;
    }

    /**
     * Sets the idCliente value for this TransaccionCSV.
     * 
     * @param idCliente
     */
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    /**
     * Gets the email value for this TransaccionCSV.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }

    /**
     * Sets the email value for this TransaccionCSV.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }

    /**
     * Gets the password value for this TransaccionCSV.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }

    /**
     * Sets the password value for this TransaccionCSV.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }

    /**
     * Gets the tipo value for this TransaccionCSV.
     * 
     * @return tipo
     */
    public java.lang.String getTipo() {
        return tipo;
    }

    /**
     * Sets the tipo value for this TransaccionCSV.
     * 
     * @param tipo
     */
    public void setTipo(java.lang.String tipo) {
        this.tipo = tipo;
    }

    /**
     * Gets the fechaHora value for this TransaccionCSV.
     * 
     * @return fechaHora
     */
    public java.lang.String getFechaHora() {
        return fechaHora;
    }

    /**
     * Sets the fechaHora value for this TransaccionCSV.
     * 
     * @param fechaHora
     */
    public void setFechaHora(java.lang.String fechaHora) {
        this.fechaHora = fechaHora;
    }

    /**
     * Gets the csv value for this TransaccionCSV.
     * 
     * @return csv
     */
    public java.lang.String getCsv() {
        return csv;
    }

    /**
     * Sets the csv value for this TransaccionCSV.
     * 
     * @param csv
     */
    public void setCsv(java.lang.String csv) {
        this.csv = csv;
    }

    /**
     * Gets the mensaje value for this TransaccionCSV.
     * 
     * @return mensaje
     */
    public java.lang.String getMensaje() {
        return mensaje;
    }

    /**
     * Sets the mensaje value for this TransaccionCSV.
     * 
     * @param mensaje
     */
    public void setMensaje(java.lang.String mensaje) {
        this.mensaje = mensaje;
    }

    /**
     * Gets the idivr value for this TransaccionCSV.
     * 
     * @return idivr
     */
    public int getIdivr() {
        return idivr;
    }

    /**
     * Sets the idivr value for this TransaccionCSV.
     * 
     * @param idivr
     */
    public void setIdivr(int idivr) {
        this.idivr = idivr;
    }

    /**
     * Gets the nombreEnvio value for this TransaccionCSV.
     * 
     * @return nombreEnvio
     */
    public java.lang.String getNombreEnvio() {
        return nombreEnvio;
    }

    /**
     * Sets the nombreEnvio value for this TransaccionCSV.
     * 
     * @param nombreEnvio
     */
    public void setNombreEnvio(java.lang.String nombreEnvio) {
        this.nombreEnvio = nombreEnvio;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransaccionCSV))
            return false;
        TransaccionCSV other = (TransaccionCSV) obj;
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
                ((this.csv == null && other.getCsv() == null) ||
                        (this.csv != null &&
                                this.csv.equals(other.getCsv())))
                &&
                ((this.mensaje == null && other.getMensaje() == null) ||
                        (this.mensaje != null &&
                                this.mensaje.equals(other.getMensaje())))
                &&
                this.idivr == other.getIdivr() &&
                ((this.nombreEnvio == null && other.getNombreEnvio() == null) ||
                        (this.nombreEnvio != null &&
                                this.nombreEnvio.equals(other.getNombreEnvio())));
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
        if (getCsv() != null) {
            _hashCode += getCsv().hashCode();
        }
        if (getMensaje() != null) {
            _hashCode += getMensaje().hashCode();
        }
        _hashCode += getIdivr();
        if (getNombreEnvio() != null) {
            _hashCode += getNombreEnvio().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
            TransaccionCSV.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.calixtaondemand.com", "TransaccionCSV"));
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
        elemField.setFieldName("csv");
        elemField.setXmlName(new javax.xml.namespace.QName("", "csv"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mensaje");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mensaje"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idivr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idivr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombreEnvio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nombreEnvio"));
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
