/**
 * Saldos.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mx.iessystems.soap.ws.www;

public class Saldos implements java.io.Serializable {
    private int id;

    private java.lang.String servicio;

    private double disponible;

    public Saldos() {
    }

    public Saldos(
            int id,
            java.lang.String servicio,
            double disponible) {
        this.id = id;
        this.servicio = servicio;
        this.disponible = disponible;
    }

    /**
     * Gets the id value for this Saldos.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the id value for this Saldos.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets the servicio value for this Saldos.
     * 
     * @return servicio
     */
    public java.lang.String getServicio() {
        return servicio;
    }

    /**
     * Sets the servicio value for this Saldos.
     * 
     * @param servicio
     */
    public void setServicio(java.lang.String servicio) {
        this.servicio = servicio;
    }

    /**
     * Gets the disponible value for this Saldos.
     * 
     * @return disponible
     */
    public double getDisponible() {
        return disponible;
    }

    /**
     * Sets the disponible value for this Saldos.
     * 
     * @param disponible
     */
    public void setDisponible(double disponible) {
        this.disponible = disponible;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Saldos))
            return false;
        Saldos other = (Saldos) obj;
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
                this.id == other.getId() &&
                ((this.servicio == null && other.getServicio() == null) ||
                        (this.servicio != null &&
                                this.servicio.equals(other.getServicio())))
                &&
                this.disponible == other.getDisponible();
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
        _hashCode += getId();
        if (getServicio() != null) {
            _hashCode += getServicio().hashCode();
        }
        _hashCode += new Double(getDisponible()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
            Saldos.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.calixtaondemand.com", "Saldos"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servicio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "servicio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disponible");
        elemField.setXmlName(new javax.xml.namespace.QName("", "disponible"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
