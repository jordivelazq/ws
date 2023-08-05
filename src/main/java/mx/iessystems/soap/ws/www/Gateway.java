/**
 * Gateway.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mx.iessystems.soap.ws.www;

public interface Gateway extends javax.xml.rpc.Service {
    public java.lang.String getGatewayPortAddress();

    public mx.iessystems.soap.ws.www.GatewayPortType getGatewayPort() throws javax.xml.rpc.ServiceException;

    public mx.iessystems.soap.ws.www.GatewayPortType getGatewayPort(java.net.URL portAddress)
            throws javax.xml.rpc.ServiceException;
}
