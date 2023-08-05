/**
 * TransaccionEnvios.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mx.iessystems.soap.ws.www;

public class TransaccionEnvios implements java.io.Serializable {
    private int idCliente;

    private java.lang.String email;

    private java.lang.String password;

    private int idEnvio;

    public TransaccionEnvios() {
    }

    public TransaccionEnvios(
            int idCliente,
            java.lang.String email,
            java.lang.String password,
            int idEnvio) {
        this.idCliente = idCliente;
        this.email = email;
        this.password = password;
        this.idEnvio = idEnvio;
    }

    /**
     * Gets the idCliente value for this TransaccionEnvios.
     * 
     * @return idCliente
     */
    public int getIdCliente() {
        return idCliente;
    }

    /**
     * Sets the idCliente value for this TransaccionEnvios.
     * 
     * @param idCliente
     */
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    /**
     * Gets the email value for this TransaccionEnvios.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }

    /**
     * Sets the email value for this TransaccionEnvios.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }

    /**
     * Gets the password value for this TransaccionEnvios.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }

    /**
     * Sets the password value for this TransaccionEnvios.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }

    /**
     * Gets the idEnvio value for this TransaccionEnvios.
     * 
     * @return idEnvio
     */
    public int getIdEnvio() {
        return idEnvio;
    }

    /**
     * Sets the idEnvio value for this TransaccionEnvios.
     * 
     * @param idEnvio
     */
    public void setIdEnvio(int idEnvio) {
        this.idEnvio = idEnvio;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransaccionEnvios))
            return false;
        TransaccionEnvios other = (TransaccionEnvios) obj;
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
                this.idEnvio == other.getIdEnvio();
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
        _hashCode += getIdEnvio();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
            TransaccionEnvios.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.calixtaondemand.com", "TransaccionEnvios"));
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
        elemField.setFieldName("idEnvio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idEnvio"));
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
