package com.java.soap;

public class MessageProxy implements com.java.soap.Message {
  private String _endpoint = null;
  private com.java.soap.Message message = null;
  
  public MessageProxy() {
    _initMessageProxy();
  }
  
  public MessageProxy(String endpoint) {
    _endpoint = endpoint;
    _initMessageProxy();
  }
  
  private void _initMessageProxy() {
    try {
      message = (new com.java.soap.MessageServiceLocator()).getMessage();
      if (message != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)message)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)message)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (message != null)
      ((javax.xml.rpc.Stub)message)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.java.soap.Message getMessage() {
    if (message == null)
      _initMessageProxy();
    return message;
  }
  
  public java.lang.String printMessage(java.lang.String name) throws java.rmi.RemoteException{
    if (message == null)
      _initMessageProxy();
    return message.printMessage(name);
  }
  
  
}