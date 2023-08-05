/**
 * RespEnvio.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mx.iessystems.soap.ws.www;

public class RespEnvio implements java.io.Serializable {
    private int id;

    private double fInicio;

    private java.lang.String campos;

    private java.lang.String descripcion;

    private java.lang.String lista;

    private double por;

    private int tipo;

    private int idUsuario;

    private int especie;

    private int estado;

    private double costo;

    private java.lang.String mensaje;

    public RespEnvio() {
    }

    public RespEnvio(
            int id,
            double fInicio,
            java.lang.String campos,
            java.lang.String descripcion,
            java.lang.String lista,
            double por,
            int tipo,
            int idUsuario,
            int especie,
            int estado,
            double costo,
            java.lang.String mensaje) {
        this.id = id;
        this.fInicio = fInicio;
        this.campos = campos;
        this.descripcion = descripcion;
        this.lista = lista;
        this.por = por;
        this.tipo = tipo;
        this.idUsuario = idUsuario;
        this.especie = especie;
        this.estado = estado;
        this.costo = costo;
        this.mensaje = mensaje;
    }

    /**
     * Gets the id value for this RespEnvio.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the id value for this RespEnvio.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets the fInicio value for this RespEnvio.
     * 
     * @return fInicio
     */
    public double getFInicio() {
        return fInicio;
    }

    /**
     * Sets the fInicio value for this RespEnvio.
     * 
     * @param fInicio
     */
    public void setFInicio(double fInicio) {
        this.fInicio = fInicio;
    }

    /**
     * Gets the campos value for this RespEnvio.
     * 
     * @return campos
     */
    public java.lang.String getCampos() {
        return campos;
    }

    /**
     * Sets the campos value for this RespEnvio.
     * 
     * @param campos
     */
    public void setCampos(java.lang.String campos) {
        this.campos = campos;
    }

    /**
     * Gets the descripcion value for this RespEnvio.
     * 
     * @return descripcion
     */
    public java.lang.String getDescripcion() {
        return descripcion;
    }

    /**
     * Sets the descripcion value for this RespEnvio.
     * 
     * @param descripcion
     */
    public void setDescripcion(java.lang.String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Gets the lista value for this RespEnvio.
     * 
     * @return lista
     */
    public java.lang.String getLista() {
        return lista;
    }

    /**
     * Sets the lista value for this RespEnvio.
     * 
     * @param lista
     */
    public void setLista(java.lang.String lista) {
        this.lista = lista;
    }

    /**
     * Gets the por value for this RespEnvio.
     * 
     * @return por
     */
    public double getPor() {
        return por;
    }

    /**
     * Sets the por value for this RespEnvio.
     * 
     * @param por
     */
    public void setPor(double por) {
        this.por = por;
    }

    /**
     * Gets the tipo value for this RespEnvio.
     * 
     * @return tipo
     */
    public int getTipo() {
        return tipo;
    }

    /**
     * Sets the tipo value for this RespEnvio.
     * 
     * @param tipo
     */
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    /**
     * Gets the idUsuario value for this RespEnvio.
     * 
     * @return idUsuario
     */
    public int getIdUsuario() {
        return idUsuario;
    }

    /**
     * Sets the idUsuario value for this RespEnvio.
     * 
     * @param idUsuario
     */
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    /**
     * Gets the especie value for this RespEnvio.
     * 
     * @return especie
     */
    public int getEspecie() {
        return especie;
    }

    /**
     * Sets the especie value for this RespEnvio.
     * 
     * @param especie
     */
    public void setEspecie(int especie) {
        this.especie = especie;
    }

    /**
     * Gets the estado value for this RespEnvio.
     * 
     * @return estado
     */
    public int getEstado() {
        return estado;
    }

    /**
     * Sets the estado value for this RespEnvio.
     * 
     * @param estado
     */
    public void setEstado(int estado) {
        this.estado = estado;
    }

    /**
     * Gets the costo value for this RespEnvio.
     * 
     * @return costo
     */
    public double getCosto() {
        return costo;
    }

    /**
     * Sets the costo value for this RespEnvio.
     * 
     * @param costo
     */
    public void setCosto(double costo) {
        this.costo = costo;
    }

    /**
     * Gets the mensaje value for this RespEnvio.
     * 
     * @return mensaje
     */
    public java.lang.String getMensaje() {
        return mensaje;
    }

    /**
     * Sets the mensaje value for this RespEnvio.
     * 
     * @param mensaje
     */
    public void setMensaje(java.lang.String mensaje) {
        this.mensaje = mensaje;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RespEnvio))
            return false;
        RespEnvio other = (RespEnvio) obj;
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
                this.fInicio == other.getFInicio() &&
                ((this.campos == null && other.getCampos() == null) ||
                        (this.campos != null &&
                                this.campos.equals(other.getCampos())))
                &&
                ((this.descripcion == null && other.getDescripcion() == null) ||
                        (this.descripcion != null &&
                                this.descripcion.equals(other.getDescripcion())))
                &&
                ((this.lista == null && other.getLista() == null) ||
                        (this.lista != null &&
                                this.lista.equals(other.getLista())))
                &&
                this.por == other.getPor() &&
                this.tipo == other.getTipo() &&
                this.idUsuario == other.getIdUsuario() &&
                this.especie == other.getEspecie() &&
                this.estado == other.getEstado() &&
                this.costo == other.getCosto() &&
                ((this.mensaje == null && other.getMensaje() == null) ||
                        (this.mensaje != null &&
                                this.mensaje.equals(other.getMensaje())));
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
        _hashCode += new Double(getFInicio()).hashCode();
        if (getCampos() != null) {
            _hashCode += getCampos().hashCode();
        }
        if (getDescripcion() != null) {
            _hashCode += getDescripcion().hashCode();
        }
        if (getLista() != null) {
            _hashCode += getLista().hashCode();
        }
        _hashCode += new Double(getPor()).hashCode();
        _hashCode += getTipo();
        _hashCode += getIdUsuario();
        _hashCode += getEspecie();
        _hashCode += getEstado();
        _hashCode += new Double(getCosto()).hashCode();
        if (getMensaje() != null) {
            _hashCode += getMensaje().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
            RespEnvio.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.calixtaondemand.com", "RespEnvio"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FInicio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fInicio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "campos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descripcion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descripcion"));
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
        elemField.setFieldName("por");
        elemField.setXmlName(new javax.xml.namespace.QName("", "por"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idUsuario");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idUsuario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("especie");
        elemField.setXmlName(new javax.xml.namespace.QName("", "especie"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "estado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "costo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mensaje");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mensaje"));
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
