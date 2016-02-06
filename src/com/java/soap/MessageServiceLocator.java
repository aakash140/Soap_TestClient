/**
 * MessageServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.java.soap;

public class MessageServiceLocator extends org.apache.axis.client.Service implements com.java.soap.MessageService {

    public MessageServiceLocator() {
    }


    public MessageServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public MessageServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Message
    private java.lang.String Message_address = "http://localhost:8081/Soap_Test/services/Message";

    public java.lang.String getMessageAddress() {
        return Message_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String MessageWSDDServiceName = "Message";

    public java.lang.String getMessageWSDDServiceName() {
        return MessageWSDDServiceName;
    }

    public void setMessageWSDDServiceName(java.lang.String name) {
        MessageWSDDServiceName = name;
    }

    public com.java.soap.Message getMessage() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Message_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getMessage(endpoint);
    }

    public com.java.soap.Message getMessage(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.java.soap.MessageSoapBindingStub _stub = new com.java.soap.MessageSoapBindingStub(portAddress, this);
            _stub.setPortName(getMessageWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setMessageEndpointAddress(java.lang.String address) {
        Message_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.java.soap.Message.class.isAssignableFrom(serviceEndpointInterface)) {
                com.java.soap.MessageSoapBindingStub _stub = new com.java.soap.MessageSoapBindingStub(new java.net.URL(Message_address), this);
                _stub.setPortName(getMessageWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("Message".equals(inputPortName)) {
            return getMessage();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://soap.java.com", "MessageService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://soap.java.com", "Message"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Message".equals(portName)) {
            setMessageEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
