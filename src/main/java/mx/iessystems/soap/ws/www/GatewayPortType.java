/**
 * GatewayPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mx.iessystems.soap.ws.www;

public interface GatewayPortType extends java.rmi.Remote {

        /**
         * Envia mensajes a traves del Gateway
         */
        public int enviaMensajes(mx.iessystems.soap.ws.www.Transaccion mensajes) throws java.rmi.RemoteException;

        /**
         * Obtiene el estado de un mensaje de envio permanente
         */
        public int estadoEnvioEmail(int cte, java.lang.String email, java.lang.String password, int id)
                        throws java.rmi.RemoteException;

        /**
         * Obtiene los eventos de un mensaje de envio permanente
         */
        public void eventosEnvioEmail(int cte, java.lang.String email, java.lang.String password, java.lang.String id,
                        javax.xml.rpc.holders.IntHolder code,
                        mx.iessystems.soap.ws.www.holders.RespEventosHolder eventos)
                        throws java.rmi.RemoteException;

        /**
         * Envia emails a traves del Gateway
         */
        public java.lang.String enviaEmail(int cte, java.lang.String email, java.lang.String password,
                        java.lang.String nombreCamp, java.lang.String to, java.lang.String from,
                        java.lang.String fromName,
                        java.lang.String replyTo, java.lang.String subject, int incrustarImagen,
                        java.lang.String textEmail,
                        java.lang.String htmlEmail, int seleccionaAdjuntos, byte[] fileBase64,
                        java.lang.String fileNameBase64,
                        java.lang.String nombreArchivoPersonalizado, int envioSinArchivo, java.lang.String fechaInicio,
                        int horaInicio, int minutoInicio, java.lang.String listasNegras, java.lang.String referencia,
                        java.lang.String campoAuxiliar) throws java.rmi.RemoteException;

        /**
         * Envia mensajes a traves del Gateway con un campo CSV
         */
        public int enviaMensajesCSV(mx.iessystems.soap.ws.www.TransaccionCSV mensajes) throws java.rmi.RemoteException;

        /**
         * Envia un mensaje a traves del Gateway
         */
        public int enviaMensaje(int idCliente, java.lang.String email, java.lang.String password, java.lang.String tipo,
                        java.lang.String fechaHora, java.lang.String telefono, java.lang.String mensaje, int idivr)
                        throws java.rmi.RemoteException;

        /**
         * Obtiene el estado del envio
         */
        public mx.iessystems.soap.ws.www.RespEnvio estadoEnvio(mx.iessystems.soap.ws.www.TransaccionEnvios idEnvio)
                        throws java.rmi.RemoteException;

        /**
         * Obtiene el estado del Mensaje
         */
        public mx.iessystems.soap.ws.www.EdoMensajes[] estadoMensajes(
                        mx.iessystems.soap.ws.www.TransaccionEnvios idEnvio)
                        throws java.rmi.RemoteException;

        /**
         * Envia un solo mensaje sincronamente.
         */
        public int enviaMensajeOL(int idCliente, java.lang.String email, java.lang.String password,
                        java.lang.String tipo,
                        java.lang.String telefono, java.lang.String mensaje, int idivr, java.lang.String fechaInicio,
                        java.lang.String campoAux, java.lang.String asunto, java.lang.String url,
                        java.lang.String idApp,
                        java.lang.String token, mx.iessystems.soap.ws.www.Parametro[] parametros,
                        java.lang.String idOrigen,
                        int mismoOrigen, int minutosReintento, int cantidadIntentos) throws java.rmi.RemoteException;

        /**
         * Envia un solo mensaje sincronamente y devuelve una referencia.
         */
        public void enviaMensajeOLRef(int idCliente, java.lang.String email, java.lang.String password,
                        java.lang.String tipo, java.lang.String telefono, java.lang.String mensaje, int idivr,
                        java.lang.String fechaInicio, java.lang.String campoAux, java.lang.String asunto,
                        java.lang.String url,
                        java.lang.String idApp, java.lang.String token,
                        mx.iessystems.soap.ws.www.Parametro[] parametros,
                        java.lang.String idOrigen, int mismoOrigen, int minutosReintento, int cantidadIntentos,
                        javax.xml.rpc.holders.IntHolder resultado, javax.xml.rpc.holders.StringHolder referencia)
                        throws java.rmi.RemoteException;

        /**
         * Obtiene el estado del mensaje basado en la referencia devuelta.
         */
        public int estadoMensajeOLRef(java.lang.String referencia) throws java.rmi.RemoteException;

        /**
         * Obtiene el estado del último mensaje basado en el campo auxiliar
         * enviado.
         */
        public void estadoMensajeOLAux(int idCliente, java.lang.String email, java.lang.String password,
                        java.lang.String campoAux, javax.xml.rpc.holders.IntHolder resultado,
                        javax.xml.rpc.holders.StringHolder referencia, javax.xml.rpc.holders.StringHolder id)
                        throws java.rmi.RemoteException;

        /**
         * Agrega un telefono a una lista. / Add a phone number to a list.
         */
        public int agregaALista(int idCliente, java.lang.String email, java.lang.String password, int idLista,
                        java.lang.String telefono, java.lang.String nombre) throws java.rmi.RemoteException;

        /**
         * Verifica la existencia de un teléfono en una lista. / Verify
         * if a phone number exists in a list.
         */
        public int existeEnLista(int idCliente, java.lang.String email, java.lang.String password, int idLista,
                        java.lang.String telefono) throws java.rmi.RemoteException;

        /**
         * Elimina un telefono de una lista. / Removes a phone number
         * from a list.
         */
        public int eliminaDeLista(int idCliente, java.lang.String email, java.lang.String password, int idLista,
                        java.lang.String telefono) throws java.rmi.RemoteException;

        /**
         * Genera una liga corta para la URL enviada.
         */
        public void generaLigaCorta(int idCliente, java.lang.String email, java.lang.String password,
                        java.lang.String url,
                        javax.xml.rpc.holders.IntHolder resultado, javax.xml.rpc.holders.StringHolder ligaCorta)
                        throws java.rmi.RemoteException;

        /**
         * Crea un id de envío para carga de archivos para una campaña
         * de email masiva.
         */
        public void creaEnvioEmailS3(int idCliente, java.lang.String email, java.lang.String password,
                        javax.xml.rpc.holders.IntHolder resultado, javax.xml.rpc.holders.IntHolder idEnvio,
                        javax.xml.rpc.holders.StringHolder sessionToken) throws java.rmi.RemoteException;

        /**
         * Crea un id de envío para carga de archivos para una campaña
         * de email masiva.
         */
        public int agregaArchivoAEmailS3(int idCliente, java.lang.String email, java.lang.String password, int idEnvio,
                        java.lang.String tipo, java.lang.String base64FileContent, java.lang.String fileName)
                        throws java.rmi.RemoteException;

        /**
         * Crea un id de envío para carga de archivos para una campaña
         * de email masiva.
         */
        public int confirmaEnvioEmailS3(int idCliente, java.lang.String email, java.lang.String password, int idEnvio,
                        java.lang.String nombreEnvio, java.lang.String csvBase64, java.lang.String from,
                        java.lang.String fromName,
                        java.lang.String replyTo, java.lang.String asunto, java.lang.String incrustaImagenes,
                        java.lang.String cuerpoTextoBase64, java.lang.String cuerpoHTMLBase64,
                        java.lang.String nombreAdjuntosIndividuales, int enviarSiFaltanAdjuntos,
                        java.lang.String fechaInicio,
                        java.lang.String fechaFin) throws java.rmi.RemoteException;

        /**
         * Consulta el carrier (operador telefónico) de un número telefónico.
         */
        public void consultaCarrier(int idCliente, java.lang.String email, java.lang.String password,
                        java.lang.String telefono, javax.xml.rpc.holders.IntHolder carrier,
                        javax.xml.rpc.holders.IntHolder resultado) throws java.rmi.RemoteException;

        /**
         * Consulta el saldo del cliente.
         */
        public mx.iessystems.soap.ws.www.Saldos[] consultaSaldo(int idCliente, java.lang.String email,
                        java.lang.String password) throws java.rmi.RemoteException;
}
