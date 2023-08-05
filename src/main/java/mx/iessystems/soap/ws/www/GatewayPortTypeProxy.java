package mx.iessystems.soap.ws.www;

public class GatewayPortTypeProxy implements mx.iessystems.soap.ws.www.GatewayPortType {
  private String _endpoint = null;
  private mx.iessystems.soap.ws.www.GatewayPortType gatewayPortType = null;

  public GatewayPortTypeProxy() {
    _initGatewayPortTypeProxy();
  }

  public GatewayPortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initGatewayPortTypeProxy();
  }

  private void _initGatewayPortTypeProxy() {
    try {
      gatewayPortType = (new mx.iessystems.soap.ws.www.GatewayLocator()).getGatewayPort();
      if (gatewayPortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub) gatewayPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String) ((javax.xml.rpc.Stub) gatewayPortType)
              ._getProperty("javax.xml.rpc.service.endpoint.address");
      }

    } catch (javax.xml.rpc.ServiceException serviceException) {
    }
  }

  public String getEndpoint() {
    return _endpoint;
  }

  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (gatewayPortType != null)
      ((javax.xml.rpc.Stub) gatewayPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);

  }

  public mx.iessystems.soap.ws.www.GatewayPortType getGatewayPortType() {
    if (gatewayPortType == null)
      _initGatewayPortTypeProxy();
    return gatewayPortType;
  }

  public int enviaMensajes(mx.iessystems.soap.ws.www.Transaccion mensajes) throws java.rmi.RemoteException {
    if (gatewayPortType == null)
      _initGatewayPortTypeProxy();
    return gatewayPortType.enviaMensajes(mensajes);
  }

  public int estadoEnvioEmail(int cte, java.lang.String email, java.lang.String password, int id)
      throws java.rmi.RemoteException {
    if (gatewayPortType == null)
      _initGatewayPortTypeProxy();
    return gatewayPortType.estadoEnvioEmail(cte, email, password, id);
  }

  public void eventosEnvioEmail(int cte, java.lang.String email, java.lang.String password, java.lang.String id,
      javax.xml.rpc.holders.IntHolder code, mx.iessystems.soap.ws.www.holders.RespEventosHolder eventos)
      throws java.rmi.RemoteException {
    if (gatewayPortType == null)
      _initGatewayPortTypeProxy();
    gatewayPortType.eventosEnvioEmail(cte, email, password, id, code, eventos);
  }

  public java.lang.String enviaEmail(int cte, java.lang.String email, java.lang.String password,
      java.lang.String nombreCamp, java.lang.String to, java.lang.String from, java.lang.String fromName,
      java.lang.String replyTo, java.lang.String subject, int incrustarImagen, java.lang.String textEmail,
      java.lang.String htmlEmail, int seleccionaAdjuntos, byte[] fileBase64, java.lang.String fileNameBase64,
      java.lang.String nombreArchivoPersonalizado, int envioSinArchivo, java.lang.String fechaInicio, int horaInicio,
      int minutoInicio, java.lang.String listasNegras, java.lang.String referencia, java.lang.String campoAuxiliar)
      throws java.rmi.RemoteException {
    if (gatewayPortType == null)
      _initGatewayPortTypeProxy();
    return gatewayPortType.enviaEmail(cte, email, password, nombreCamp, to, from, fromName, replyTo, subject,
        incrustarImagen, textEmail, htmlEmail, seleccionaAdjuntos, fileBase64, fileNameBase64,
        nombreArchivoPersonalizado, envioSinArchivo, fechaInicio, horaInicio, minutoInicio, listasNegras, referencia,
        campoAuxiliar);
  }

  public int enviaMensajesCSV(mx.iessystems.soap.ws.www.TransaccionCSV mensajes) throws java.rmi.RemoteException {
    if (gatewayPortType == null)
      _initGatewayPortTypeProxy();
    return gatewayPortType.enviaMensajesCSV(mensajes);
  }

  public int enviaMensaje(int idCliente, java.lang.String email, java.lang.String password, java.lang.String tipo,
      java.lang.String fechaHora, java.lang.String telefono, java.lang.String mensaje, int idivr)
      throws java.rmi.RemoteException {
    if (gatewayPortType == null)
      _initGatewayPortTypeProxy();
    return gatewayPortType.enviaMensaje(idCliente, email, password, tipo, fechaHora, telefono, mensaje, idivr);
  }

  public mx.iessystems.soap.ws.www.RespEnvio estadoEnvio(mx.iessystems.soap.ws.www.TransaccionEnvios idEnvio)
      throws java.rmi.RemoteException {
    if (gatewayPortType == null)
      _initGatewayPortTypeProxy();
    return gatewayPortType.estadoEnvio(idEnvio);
  }

  public mx.iessystems.soap.ws.www.EdoMensajes[] estadoMensajes(mx.iessystems.soap.ws.www.TransaccionEnvios idEnvio)
      throws java.rmi.RemoteException {
    if (gatewayPortType == null)
      _initGatewayPortTypeProxy();
    return gatewayPortType.estadoMensajes(idEnvio);
  }

  public int enviaMensajeOL(int idCliente, java.lang.String email, java.lang.String password, java.lang.String tipo,
      java.lang.String telefono, java.lang.String mensaje, int idivr, java.lang.String fechaInicio,
      java.lang.String campoAux, java.lang.String asunto, java.lang.String url, java.lang.String idApp,
      java.lang.String token, mx.iessystems.soap.ws.www.Parametro[] parametros, java.lang.String idOrigen,
      int mismoOrigen,
      int minutosReintento, int cantidadIntentos) throws java.rmi.RemoteException {
    if (gatewayPortType == null)
      _initGatewayPortTypeProxy();
    return gatewayPortType.enviaMensajeOL(idCliente, email, password, tipo, telefono, mensaje, idivr, fechaInicio,
        campoAux, asunto, url, idApp, token, parametros, idOrigen, mismoOrigen, minutosReintento, cantidadIntentos);
  }

  public void enviaMensajeOLRef(int idCliente, java.lang.String email, java.lang.String password, java.lang.String tipo,
      java.lang.String telefono, java.lang.String mensaje, int idivr, java.lang.String fechaInicio,
      java.lang.String campoAux, java.lang.String asunto, java.lang.String url, java.lang.String idApp,
      java.lang.String token, mx.iessystems.soap.ws.www.Parametro[] parametros, java.lang.String idOrigen,
      int mismoOrigen,
      int minutosReintento, int cantidadIntentos, javax.xml.rpc.holders.IntHolder resultado,
      javax.xml.rpc.holders.StringHolder referencia) throws java.rmi.RemoteException {
    if (gatewayPortType == null)
      _initGatewayPortTypeProxy();
    gatewayPortType.enviaMensajeOLRef(idCliente, email, password, tipo, telefono, mensaje, idivr, fechaInicio, campoAux,
        asunto, url, idApp, token, parametros, idOrigen, mismoOrigen, minutosReintento, cantidadIntentos, resultado,
        referencia);
  }

  public int estadoMensajeOLRef(java.lang.String referencia) throws java.rmi.RemoteException {
    if (gatewayPortType == null)
      _initGatewayPortTypeProxy();
    return gatewayPortType.estadoMensajeOLRef(referencia);
  }

  public void estadoMensajeOLAux(int idCliente, java.lang.String email, java.lang.String password,
      java.lang.String campoAux, javax.xml.rpc.holders.IntHolder resultado,
      javax.xml.rpc.holders.StringHolder referencia, javax.xml.rpc.holders.StringHolder id)
      throws java.rmi.RemoteException {
    if (gatewayPortType == null)
      _initGatewayPortTypeProxy();
    gatewayPortType.estadoMensajeOLAux(idCliente, email, password, campoAux, resultado, referencia, id);
  }

  public int agregaALista(int idCliente, java.lang.String email, java.lang.String password, int idLista,
      java.lang.String telefono, java.lang.String nombre) throws java.rmi.RemoteException {
    if (gatewayPortType == null)
      _initGatewayPortTypeProxy();
    return gatewayPortType.agregaALista(idCliente, email, password, idLista, telefono, nombre);
  }

  public int existeEnLista(int idCliente, java.lang.String email, java.lang.String password, int idLista,
      java.lang.String telefono) throws java.rmi.RemoteException {
    if (gatewayPortType == null)
      _initGatewayPortTypeProxy();
    return gatewayPortType.existeEnLista(idCliente, email, password, idLista, telefono);
  }

  public int eliminaDeLista(int idCliente, java.lang.String email, java.lang.String password, int idLista,
      java.lang.String telefono) throws java.rmi.RemoteException {
    if (gatewayPortType == null)
      _initGatewayPortTypeProxy();
    return gatewayPortType.eliminaDeLista(idCliente, email, password, idLista, telefono);
  }

  public void generaLigaCorta(int idCliente, java.lang.String email, java.lang.String password, java.lang.String url,
      javax.xml.rpc.holders.IntHolder resultado, javax.xml.rpc.holders.StringHolder ligaCorta)
      throws java.rmi.RemoteException {
    if (gatewayPortType == null)
      _initGatewayPortTypeProxy();
    gatewayPortType.generaLigaCorta(idCliente, email, password, url, resultado, ligaCorta);
  }

  public void creaEnvioEmailS3(int idCliente, java.lang.String email, java.lang.String password,
      javax.xml.rpc.holders.IntHolder resultado, javax.xml.rpc.holders.IntHolder idEnvio,
      javax.xml.rpc.holders.StringHolder sessionToken) throws java.rmi.RemoteException {
    if (gatewayPortType == null)
      _initGatewayPortTypeProxy();
    gatewayPortType.creaEnvioEmailS3(idCliente, email, password, resultado, idEnvio, sessionToken);
  }

  public int agregaArchivoAEmailS3(int idCliente, java.lang.String email, java.lang.String password, int idEnvio,
      java.lang.String tipo, java.lang.String base64FileContent, java.lang.String fileName)
      throws java.rmi.RemoteException {
    if (gatewayPortType == null)
      _initGatewayPortTypeProxy();
    return gatewayPortType.agregaArchivoAEmailS3(idCliente, email, password, idEnvio, tipo, base64FileContent,
        fileName);
  }

  public int confirmaEnvioEmailS3(int idCliente, java.lang.String email, java.lang.String password, int idEnvio,
      java.lang.String nombreEnvio, java.lang.String csvBase64, java.lang.String from, java.lang.String fromName,
      java.lang.String replyTo, java.lang.String asunto, java.lang.String incrustaImagenes,
      java.lang.String cuerpoTextoBase64, java.lang.String cuerpoHTMLBase64,
      java.lang.String nombreAdjuntosIndividuales, int enviarSiFaltanAdjuntos, java.lang.String fechaInicio,
      java.lang.String fechaFin) throws java.rmi.RemoteException {
    if (gatewayPortType == null)
      _initGatewayPortTypeProxy();
    return gatewayPortType.confirmaEnvioEmailS3(idCliente, email, password, idEnvio, nombreEnvio, csvBase64, from,
        fromName, replyTo, asunto, incrustaImagenes, cuerpoTextoBase64, cuerpoHTMLBase64, nombreAdjuntosIndividuales,
        enviarSiFaltanAdjuntos, fechaInicio, fechaFin);
  }

  public void consultaCarrier(int idCliente, java.lang.String email, java.lang.String password,
      java.lang.String telefono, javax.xml.rpc.holders.IntHolder carrier, javax.xml.rpc.holders.IntHolder resultado)
      throws java.rmi.RemoteException {
    if (gatewayPortType == null)
      _initGatewayPortTypeProxy();
    gatewayPortType.consultaCarrier(idCliente, email, password, telefono, carrier, resultado);
  }

  public mx.iessystems.soap.ws.www.Saldos[] consultaSaldo(int idCliente, java.lang.String email,
      java.lang.String password)
      throws java.rmi.RemoteException {
    if (gatewayPortType == null)
      _initGatewayPortTypeProxy();
    return gatewayPortType.consultaSaldo(idCliente, email, password);
  }

}