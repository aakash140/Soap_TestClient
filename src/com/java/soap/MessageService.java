/**
 * MessageService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.java.soap;

public interface MessageService extends javax.xml.rpc.Service {
    public java.lang.String getMessageAddress();

    public com.java.soap.Message getMessage() throws javax.xml.rpc.ServiceException;

    public com.java.soap.Message getMessage(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
