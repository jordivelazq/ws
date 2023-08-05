/**
 * GatewayBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mx.iessystems.soap.ws.www;

public class GatewayBindingStub extends org.apache.axis.client.Stub
        implements mx.iessystems.soap.ws.www.GatewayPortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc[] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[21];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
    }

    private static void _initOperationDesc1() {
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("EnviaMensajes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "mensajes"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.calixtaondemand.com", "Transaccion"),
                mx.iessystems.soap.ws.www.Transaccion.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("EstadoEnvioEmail");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cte"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "email"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
                false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "password"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
                false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("EventosEnvioEmail");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cte"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "email"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
                false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "password"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
                false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
                false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "code"),
                org.apache.axis.description.ParameterDesc.OUT,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "eventos"),
                org.apache.axis.description.ParameterDesc.OUT,
                new javax.xml.namespace.QName("http://www.calixtaondemand.com", "RespEventos"),
                mx.iessystems.soap.ws.www.Eventos[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("EnviaEmail");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cte"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "email"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
                false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "password"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
                false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "nombreCamp"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
                false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "to"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
                false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "from"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
                false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "fromName"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
                false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "replyTo"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
                false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "subject"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
                false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "incrustarImagen"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "textEmail"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
                false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "htmlEmail"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
                false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "seleccionaAdjuntos"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "fileBase64"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"), byte[].class, false,
                false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "fileNameBase64"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
                false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(
                new javax.xml.namespace.QName("", "nombreArchivoPersonalizado"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
                false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "envioSinArchivo"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "fechaInicio"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
                false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "horaInicio"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "minutoInicio"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "listasNegras"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
                false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "referencia"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
                false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "campoAuxiliar"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
                false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("EnviaMensajesCSV");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "mensajes"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.calixtaondemand.com", "TransaccionCSV"),
                mx.iessystems.soap.ws.www.TransaccionCSV.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("EnviaMensaje");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idCliente"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "email"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
                false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "password"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
                false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "tipo"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
                false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "fechaHora"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
                false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "telefono"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
                false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "mensaje"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
                false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idivr"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("EstadoEnvio");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idEnvio"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.calixtaondemand.com", "TransaccionEnvios"),
                mx.iessystems.soap.ws.www.TransaccionEnvios.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.calixtaondemand.com", "RespEnvio"));
        oper.setReturnClass(mx.iessystems.soap.ws.www.RespEnvio.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("EstadoMensajes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idEnvio"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.calixtaondemand.com", "TransaccionEnvios"),
                mx.iessystems.soap.ws.www.TransaccionEnvios.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.calixtaondemand.com", "RespEstadoMensajes"));
        oper.setReturnClass(mx.iessystems.soap.ws.www.EdoMensajes[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("EnviaMensajeOL");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idCliente"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "email"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
                false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "password"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
                false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "tipo"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
                false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "telefono"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
                false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "mensaje"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
                false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idivr"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "fechaInicio"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
                false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "campoAux"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
                false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "asunto"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
                false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "url"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
                false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idApp"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
                false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
                false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parametros"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.calixtaondemand.com", "Parametros"),
                mx.iessystems.soap.ws.www.Parametro[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idOrigen"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
                false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "mismoOrigen"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "minutosReintento"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cantidadIntentos"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("EnviaMensajeOLRef");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idCliente"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "email"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
                false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "password"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
                false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "tipo"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
                false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "telefono"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
                false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "mensaje"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
                false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idivr"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "fechaInicio"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
                false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "campoAux"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
                false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "asunto"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
                false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "url"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
                false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idApp"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
                false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
                false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parametros"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.calixtaondemand.com", "Parametros"),
                mx.iessystems.soap.ws.www.Parametro[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idOrigen"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
                false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "mismoOrigen"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "minutosReintento"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cantidadIntentos"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "resultado"),
                org.apache.axis.description.ParameterDesc.OUT,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "referencia"),
                org.apache.axis.description.ParameterDesc.OUT,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
                false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2() {
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("EstadoMensajeOLRef");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "referencia"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
                false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("EstadoMensajeOLAux");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idCliente"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "email"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
                false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "password"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
                false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "campoAux"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
                false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "resultado"),
                org.apache.axis.description.ParameterDesc.OUT,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "referencia"),
                org.apache.axis.description.ParameterDesc.OUT,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
                false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"),
                org.apache.axis.description.ParameterDesc.OUT,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
                false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AgregaALista");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idCliente"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "email"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
                false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "password"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
                false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idLista"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "telefono"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
                false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "nombre"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
                false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ExisteEnLista");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idCliente"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "email"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
                false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "password"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
                false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idLista"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "telefono"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
                false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("EliminaDeLista");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idCliente"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "email"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
                false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "password"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
                false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idLista"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "telefono"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
                false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GeneraLigaCorta");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idCliente"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "email"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
                false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "password"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
                false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "url"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
                false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "resultado"),
                org.apache.axis.description.ParameterDesc.OUT,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ligaCorta"),
                org.apache.axis.description.ParameterDesc.OUT,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
                false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreaEnvioEmailS3");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idCliente"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "email"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
                false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "password"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
                false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "resultado"),
                org.apache.axis.description.ParameterDesc.OUT,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idEnvio"),
                org.apache.axis.description.ParameterDesc.OUT,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionToken"),
                org.apache.axis.description.ParameterDesc.OUT,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
                false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AgregaArchivoAEmailS3");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idCliente"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "email"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
                false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "password"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
                false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idEnvio"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "tipo"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
                false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "base64FileContent"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
                false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "fileName"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
                false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "resultado"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ConfirmaEnvioEmailS3");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idCliente"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "email"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
                false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "password"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
                false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idEnvio"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "nombreEnvio"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
                false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "csvBase64"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
                false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "from"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
                false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "fromName"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
                false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "replyTo"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
                false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "asunto"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
                false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "incrustaImagenes"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
                false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cuerpoTextoBase64"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
                false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cuerpoHTMLBase64"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
                false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(
                new javax.xml.namespace.QName("", "nombreAdjuntosIndividuales"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
                false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(
                new javax.xml.namespace.QName("", "enviarSiFaltanAdjuntos"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "fechaInicio"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
                false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "fechaFin"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
                false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "resultado"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ConsultaCarrier");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idCliente"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "email"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
                false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "password"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
                false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "telefono"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
                false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "carrier"),
                org.apache.axis.description.ParameterDesc.OUT,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "resultado"),
                org.apache.axis.description.ParameterDesc.OUT,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3() {
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ConsultaSaldo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idCliente"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "email"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
                false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "password"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
                false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.calixtaondemand.com", "RespConsultaSaldo"));
        oper.setReturnClass(mx.iessystems.soap.ws.www.Saldos[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[20] = oper;

    }

    public GatewayBindingStub() throws org.apache.axis.AxisFault {
        this(null);
    }

    public GatewayBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service)
            throws org.apache.axis.AxisFault {
        this(service);
        super.cachedEndpoint = endpointURL;
    }

    public GatewayBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service) super.service).setTypeMappingVersion("1.2");
        java.lang.Class cls;
        javax.xml.namespace.QName qName;
        javax.xml.namespace.QName qName2;
        java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
        java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
        java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
        java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
        java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
        java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
        java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
        java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
        java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
        java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        qName = new javax.xml.namespace.QName("http://www.calixtaondemand.com", "EdoMensajes");
        cachedSerQNames.add(qName);
        cls = mx.iessystems.soap.ws.www.EdoMensajes.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.calixtaondemand.com", "Eventos");
        cachedSerQNames.add(qName);
        cls = mx.iessystems.soap.ws.www.Eventos.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.calixtaondemand.com", "Mensaje");
        cachedSerQNames.add(qName);
        cls = mx.iessystems.soap.ws.www.Mensaje.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.calixtaondemand.com", "Mensajes");
        cachedSerQNames.add(qName);
        cls = mx.iessystems.soap.ws.www.Mensaje[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.calixtaondemand.com", "Mensaje");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://www.calixtaondemand.com", "Parametro");
        cachedSerQNames.add(qName);
        cls = mx.iessystems.soap.ws.www.Parametro.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.calixtaondemand.com", "Parametros");
        cachedSerQNames.add(qName);
        cls = mx.iessystems.soap.ws.www.Parametro[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.calixtaondemand.com", "Parametro");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://www.calixtaondemand.com", "RespConsultaSaldo");
        cachedSerQNames.add(qName);
        cls = mx.iessystems.soap.ws.www.Saldos[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.calixtaondemand.com", "Saldos");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://www.calixtaondemand.com", "RespEnvio");
        cachedSerQNames.add(qName);
        cls = mx.iessystems.soap.ws.www.RespEnvio.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.calixtaondemand.com", "RespEstadoMensajes");
        cachedSerQNames.add(qName);
        cls = mx.iessystems.soap.ws.www.EdoMensajes[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.calixtaondemand.com", "EdoMensajes");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://www.calixtaondemand.com", "RespEventos");
        cachedSerQNames.add(qName);
        cls = mx.iessystems.soap.ws.www.Eventos[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.calixtaondemand.com", "Eventos");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://www.calixtaondemand.com", "Saldos");
        cachedSerQNames.add(qName);
        cls = mx.iessystems.soap.ws.www.Saldos.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.calixtaondemand.com", "Transaccion");
        cachedSerQNames.add(qName);
        cls = mx.iessystems.soap.ws.www.Transaccion.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.calixtaondemand.com", "TransaccionCSV");
        cachedSerQNames.add(qName);
        cls = mx.iessystems.soap.ws.www.TransaccionCSV.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.calixtaondemand.com", "TransaccionEnvios");
        cachedSerQNames.add(qName);
        cls = mx.iessystems.soap.ws.www.TransaccionEnvios.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
                    _call.setEncodingStyle(org.apache.axis.Constants.URI_SOAP11_ENC);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName = (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class) cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class) cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        } else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory) cachedSerFactories
                                    .get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory) cachedDeserFactories
                                    .get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        } catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public int enviaMensajes(mx.iessystems.soap.ws.www.Transaccion mensajes) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.calixtaondemand.com#EnviaMensajes");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.calixtaondemand.com", "EnviaMensajes"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[] { mensajes });

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return ((java.lang.Integer) _resp).intValue();
                } catch (java.lang.Exception _exception) {
                    return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public int estadoEnvioEmail(int cte, java.lang.String email, java.lang.String password, int id)
            throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.calixtaondemand.com#EstadoEnvioEmail");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.calixtaondemand.com", "EstadoEnvioEmail"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(
                    new java.lang.Object[] { new java.lang.Integer(cte), email, password, new java.lang.Integer(id) });

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return ((java.lang.Integer) _resp).intValue();
                } catch (java.lang.Exception _exception) {
                    return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public void eventosEnvioEmail(int cte, java.lang.String email, java.lang.String password, java.lang.String id,
            javax.xml.rpc.holders.IntHolder code, mx.iessystems.soap.ws.www.holders.RespEventosHolder eventos)
            throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.calixtaondemand.com#EventosEnvioEmail");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.calixtaondemand.com", "EventosEnvioEmail"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call
                    .invoke(new java.lang.Object[] { new java.lang.Integer(cte), email, password, id });

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                java.util.Map _output;
                _output = _call.getOutputParams();
                try {
                    code.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "code")))
                            .intValue();
                } catch (java.lang.Exception _exception) {
                    code.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils
                            .convert(_output.get(new javax.xml.namespace.QName("", "code")), int.class)).intValue();
                }
                try {
                    eventos.value = (mx.iessystems.soap.ws.www.Eventos[]) _output
                            .get(new javax.xml.namespace.QName("", "eventos"));
                } catch (java.lang.Exception _exception) {
                    eventos.value = (mx.iessystems.soap.ws.www.Eventos[]) org.apache.axis.utils.JavaUtils.convert(
                            _output.get(new javax.xml.namespace.QName("", "eventos")),
                            mx.iessystems.soap.ws.www.Eventos[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public java.lang.String enviaEmail(int cte, java.lang.String email, java.lang.String password,
            java.lang.String nombreCamp, java.lang.String to, java.lang.String from, java.lang.String fromName,
            java.lang.String replyTo, java.lang.String subject, int incrustarImagen, java.lang.String textEmail,
            java.lang.String htmlEmail, int seleccionaAdjuntos, byte[] fileBase64, java.lang.String fileNameBase64,
            java.lang.String nombreArchivoPersonalizado, int envioSinArchivo, java.lang.String fechaInicio,
            int horaInicio, int minutoInicio, java.lang.String listasNegras, java.lang.String referencia,
            java.lang.String campoAuxiliar) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.calixtaondemand.com#EnviaEmail");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.calixtaondemand.com", "EnviaEmail"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[] { new java.lang.Integer(cte), email, password,
                    nombreCamp, to, from, fromName, replyTo, subject, new java.lang.Integer(incrustarImagen), textEmail,
                    htmlEmail, new java.lang.Integer(seleccionaAdjuntos), fileBase64, fileNameBase64,
                    nombreArchivoPersonalizado, new java.lang.Integer(envioSinArchivo), fechaInicio,
                    new java.lang.Integer(horaInicio), new java.lang.Integer(minutoInicio), listasNegras, referencia,
                    campoAuxiliar });

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (java.lang.String) _resp;
                } catch (java.lang.Exception _exception) {
                    return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public int enviaMensajesCSV(mx.iessystems.soap.ws.www.TransaccionCSV mensajes) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.calixtaondemand.com#EnviaMensajesCSV");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.calixtaondemand.com", "EnviaMensajesCSV"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[] { mensajes });

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return ((java.lang.Integer) _resp).intValue();
                } catch (java.lang.Exception _exception) {
                    return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public int enviaMensaje(int idCliente, java.lang.String email, java.lang.String password, java.lang.String tipo,
            java.lang.String fechaHora, java.lang.String telefono, java.lang.String mensaje, int idivr)
            throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.calixtaondemand.com#EnviaMensaje");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.calixtaondemand.com", "EnviaMensaje"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[] { new java.lang.Integer(idCliente), email,
                    password, tipo, fechaHora, telefono, mensaje, new java.lang.Integer(idivr) });

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return ((java.lang.Integer) _resp).intValue();
                } catch (java.lang.Exception _exception) {
                    return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public mx.iessystems.soap.ws.www.RespEnvio estadoEnvio(mx.iessystems.soap.ws.www.TransaccionEnvios idEnvio)
            throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.calixtaondemand.com#EstadoEnvio");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.calixtaondemand.com", "EstadoEnvio"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[] { idEnvio });

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (mx.iessystems.soap.ws.www.RespEnvio) _resp;
                } catch (java.lang.Exception _exception) {
                    return (mx.iessystems.soap.ws.www.RespEnvio) org.apache.axis.utils.JavaUtils.convert(_resp,
                            mx.iessystems.soap.ws.www.RespEnvio.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public mx.iessystems.soap.ws.www.EdoMensajes[] estadoMensajes(mx.iessystems.soap.ws.www.TransaccionEnvios idEnvio)
            throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.calixtaondemand.com#EstadoMensajes");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.calixtaondemand.com", "EstadoMensajes"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[] { idEnvio });

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (mx.iessystems.soap.ws.www.EdoMensajes[]) _resp;
                } catch (java.lang.Exception _exception) {
                    return (mx.iessystems.soap.ws.www.EdoMensajes[]) org.apache.axis.utils.JavaUtils.convert(_resp,
                            mx.iessystems.soap.ws.www.EdoMensajes[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public int enviaMensajeOL(int idCliente, java.lang.String email, java.lang.String password, java.lang.String tipo,
            java.lang.String telefono, java.lang.String mensaje, int idivr, java.lang.String fechaInicio,
            java.lang.String campoAux, java.lang.String asunto, java.lang.String url, java.lang.String idApp,
            java.lang.String token, mx.iessystems.soap.ws.www.Parametro[] parametros, java.lang.String idOrigen,
            int mismoOrigen, int minutosReintento, int cantidadIntentos) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.calixtaondemand.com#EnviaMensajeOL");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.calixtaondemand.com", "EnviaMensajeOL"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[] { new java.lang.Integer(idCliente), email,
                    password, tipo, telefono, mensaje, new java.lang.Integer(idivr), fechaInicio, campoAux, asunto, url,
                    idApp, token, parametros, idOrigen, new java.lang.Integer(mismoOrigen),
                    new java.lang.Integer(minutosReintento), new java.lang.Integer(cantidadIntentos) });

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return ((java.lang.Integer) _resp).intValue();
                } catch (java.lang.Exception _exception) {
                    return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public void enviaMensajeOLRef(int idCliente, java.lang.String email, java.lang.String password,
            java.lang.String tipo, java.lang.String telefono, java.lang.String mensaje, int idivr,
            java.lang.String fechaInicio, java.lang.String campoAux, java.lang.String asunto, java.lang.String url,
            java.lang.String idApp, java.lang.String token, mx.iessystems.soap.ws.www.Parametro[] parametros,
            java.lang.String idOrigen, int mismoOrigen, int minutosReintento, int cantidadIntentos,
            javax.xml.rpc.holders.IntHolder resultado, javax.xml.rpc.holders.StringHolder referencia)
            throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.calixtaondemand.com#EnviaMensajeOLRef");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.calixtaondemand.com", "EnviaMensajeOLRef"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[] { new java.lang.Integer(idCliente), email,
                    password, tipo, telefono, mensaje, new java.lang.Integer(idivr), fechaInicio, campoAux, asunto, url,
                    idApp, token, parametros, idOrigen, new java.lang.Integer(mismoOrigen),
                    new java.lang.Integer(minutosReintento), new java.lang.Integer(cantidadIntentos) });

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                java.util.Map _output;
                _output = _call.getOutputParams();
                try {
                    resultado.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "resultado")))
                            .intValue();
                } catch (java.lang.Exception _exception) {
                    resultado.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils
                            .convert(_output.get(new javax.xml.namespace.QName("", "resultado")), int.class))
                            .intValue();
                }
                try {
                    referencia.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "referencia"));
                } catch (java.lang.Exception _exception) {
                    referencia.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(
                            _output.get(new javax.xml.namespace.QName("", "referencia")), java.lang.String.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public int estadoMensajeOLRef(java.lang.String referencia) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.calixtaondemand.com#EstadoMensajeOLRef");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.calixtaondemand.com", "EstadoMensajeOLRef"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[] { referencia });

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return ((java.lang.Integer) _resp).intValue();
                } catch (java.lang.Exception _exception) {
                    return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public void estadoMensajeOLAux(int idCliente, java.lang.String email, java.lang.String password,
            java.lang.String campoAux, javax.xml.rpc.holders.IntHolder resultado,
            javax.xml.rpc.holders.StringHolder referencia, javax.xml.rpc.holders.StringHolder id)
            throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.calixtaondemand.com#EstadoMensajeOLRefAux");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.calixtaondemand.com", "EstadoMensajeOLAux"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call
                    .invoke(new java.lang.Object[] { new java.lang.Integer(idCliente), email, password, campoAux });

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                java.util.Map _output;
                _output = _call.getOutputParams();
                try {
                    resultado.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "resultado")))
                            .intValue();
                } catch (java.lang.Exception _exception) {
                    resultado.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils
                            .convert(_output.get(new javax.xml.namespace.QName("", "resultado")), int.class))
                            .intValue();
                }
                try {
                    referencia.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "referencia"));
                } catch (java.lang.Exception _exception) {
                    referencia.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(
                            _output.get(new javax.xml.namespace.QName("", "referencia")), java.lang.String.class);
                }
                try {
                    id.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "id"));
                } catch (java.lang.Exception _exception) {
                    id.value = (java.lang.String) org.apache.axis.utils.JavaUtils
                            .convert(_output.get(new javax.xml.namespace.QName("", "id")), java.lang.String.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public int agregaALista(int idCliente, java.lang.String email, java.lang.String password, int idLista,
            java.lang.String telefono, java.lang.String nombre) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.calixtaondemand.com#AgregaALista");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.calixtaondemand.com", "AgregaALista"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[] { new java.lang.Integer(idCliente), email,
                    password, new java.lang.Integer(idLista), telefono, nombre });

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return ((java.lang.Integer) _resp).intValue();
                } catch (java.lang.Exception _exception) {
                    return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public int existeEnLista(int idCliente, java.lang.String email, java.lang.String password, int idLista,
            java.lang.String telefono) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.calixtaondemand.com#ExisteEnLista");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.calixtaondemand.com", "ExisteEnLista"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[] { new java.lang.Integer(idCliente), email,
                    password, new java.lang.Integer(idLista), telefono });

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return ((java.lang.Integer) _resp).intValue();
                } catch (java.lang.Exception _exception) {
                    return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public int eliminaDeLista(int idCliente, java.lang.String email, java.lang.String password, int idLista,
            java.lang.String telefono) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.calixtaondemand.com#EliminaDeLista");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.calixtaondemand.com", "EliminaDeLista"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[] { new java.lang.Integer(idCliente), email,
                    password, new java.lang.Integer(idLista), telefono });

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return ((java.lang.Integer) _resp).intValue();
                } catch (java.lang.Exception _exception) {
                    return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public void generaLigaCorta(int idCliente, java.lang.String email, java.lang.String password, java.lang.String url,
            javax.xml.rpc.holders.IntHolder resultado, javax.xml.rpc.holders.StringHolder ligaCorta)
            throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.calixtaondemand.com#GeneraLigaCorta");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.calixtaondemand.com", "GeneraLigaCorta"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call
                    .invoke(new java.lang.Object[] { new java.lang.Integer(idCliente), email, password, url });

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                java.util.Map _output;
                _output = _call.getOutputParams();
                try {
                    resultado.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "resultado")))
                            .intValue();
                } catch (java.lang.Exception _exception) {
                    resultado.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils
                            .convert(_output.get(new javax.xml.namespace.QName("", "resultado")), int.class))
                            .intValue();
                }
                try {
                    ligaCorta.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "ligaCorta"));
                } catch (java.lang.Exception _exception) {
                    ligaCorta.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(
                            _output.get(new javax.xml.namespace.QName("", "ligaCorta")), java.lang.String.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public void creaEnvioEmailS3(int idCliente, java.lang.String email, java.lang.String password,
            javax.xml.rpc.holders.IntHolder resultado, javax.xml.rpc.holders.IntHolder idEnvio,
            javax.xml.rpc.holders.StringHolder sessionToken) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.calixtaondemand.com#CreaEnvioEmailS3");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.calixtaondemand.com", "CreaEnvioEmailS3"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call
                    .invoke(new java.lang.Object[] { new java.lang.Integer(idCliente), email, password });

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                java.util.Map _output;
                _output = _call.getOutputParams();
                try {
                    resultado.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "resultado")))
                            .intValue();
                } catch (java.lang.Exception _exception) {
                    resultado.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils
                            .convert(_output.get(new javax.xml.namespace.QName("", "resultado")), int.class))
                            .intValue();
                }
                try {
                    idEnvio.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "idEnvio")))
                            .intValue();
                } catch (java.lang.Exception _exception) {
                    idEnvio.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils
                            .convert(_output.get(new javax.xml.namespace.QName("", "idEnvio")), int.class)).intValue();
                }
                try {
                    sessionToken.value = (java.lang.String) _output
                            .get(new javax.xml.namespace.QName("", "sessionToken"));
                } catch (java.lang.Exception _exception) {
                    sessionToken.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(
                            _output.get(new javax.xml.namespace.QName("", "sessionToken")), java.lang.String.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public int agregaArchivoAEmailS3(int idCliente, java.lang.String email, java.lang.String password, int idEnvio,
            java.lang.String tipo, java.lang.String base64FileContent, java.lang.String fileName)
            throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.calixtaondemand.com#AgregaArchivoAEmailS3");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(
                new javax.xml.namespace.QName("http://www.calixtaondemand.com", "AgregaArchivoAEmailS3"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[] { new java.lang.Integer(idCliente), email,
                    password, new java.lang.Integer(idEnvio), tipo, base64FileContent, fileName });

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return ((java.lang.Integer) _resp).intValue();
                } catch (java.lang.Exception _exception) {
                    return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public int confirmaEnvioEmailS3(int idCliente, java.lang.String email, java.lang.String password, int idEnvio,
            java.lang.String nombreEnvio, java.lang.String csvBase64, java.lang.String from, java.lang.String fromName,
            java.lang.String replyTo, java.lang.String asunto, java.lang.String incrustaImagenes,
            java.lang.String cuerpoTextoBase64, java.lang.String cuerpoHTMLBase64,
            java.lang.String nombreAdjuntosIndividuales, int enviarSiFaltanAdjuntos, java.lang.String fechaInicio,
            java.lang.String fechaFin) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.calixtaondemand.com#ConfirmaEnvioEmailS3");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.calixtaondemand.com", "ConfirmaEnvioEmailS3"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[] { new java.lang.Integer(idCliente), email,
                    password, new java.lang.Integer(idEnvio), nombreEnvio, csvBase64, from, fromName, replyTo, asunto,
                    incrustaImagenes, cuerpoTextoBase64, cuerpoHTMLBase64, nombreAdjuntosIndividuales,
                    new java.lang.Integer(enviarSiFaltanAdjuntos), fechaInicio, fechaFin });

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return ((java.lang.Integer) _resp).intValue();
                } catch (java.lang.Exception _exception) {
                    return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public void consultaCarrier(int idCliente, java.lang.String email, java.lang.String password,
            java.lang.String telefono, javax.xml.rpc.holders.IntHolder carrier,
            javax.xml.rpc.holders.IntHolder resultado) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.calixtaondemand.com#ConsultaCarrier");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.calixtaondemand.com", "ConsultaCarrier"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call
                    .invoke(new java.lang.Object[] { new java.lang.Integer(idCliente), email, password, telefono });

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                java.util.Map _output;
                _output = _call.getOutputParams();
                try {
                    carrier.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "carrier")))
                            .intValue();
                } catch (java.lang.Exception _exception) {
                    carrier.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils
                            .convert(_output.get(new javax.xml.namespace.QName("", "carrier")), int.class)).intValue();
                }
                try {
                    resultado.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "resultado")))
                            .intValue();
                } catch (java.lang.Exception _exception) {
                    resultado.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils
                            .convert(_output.get(new javax.xml.namespace.QName("", "resultado")), int.class))
                            .intValue();
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public mx.iessystems.soap.ws.www.Saldos[] consultaSaldo(int idCliente, java.lang.String email,
            java.lang.String password) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.calixtaondemand.com#ConsultaSaldo");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.calixtaondemand.com", "ConsultaSaldo"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call
                    .invoke(new java.lang.Object[] { new java.lang.Integer(idCliente), email, password });

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (mx.iessystems.soap.ws.www.Saldos[]) _resp;
                } catch (java.lang.Exception _exception) {
                    return (mx.iessystems.soap.ws.www.Saldos[]) org.apache.axis.utils.JavaUtils.convert(_resp,
                            mx.iessystems.soap.ws.www.Saldos[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

}
