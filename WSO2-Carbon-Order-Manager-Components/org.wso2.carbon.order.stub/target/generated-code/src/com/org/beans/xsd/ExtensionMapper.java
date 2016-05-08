
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v10  Built on : Apr 16, 2014 (01:16:09 UTC)
 */

        
            package com.org.beans.xsd;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://beans.org.com/xsd".equals(namespaceURI) &&
                  "Item".equals(typeName)){
                   
                            return  com.org.beans.xsd.Item.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://beans.org.com/xsd".equals(namespaceURI) &&
                  "User".equals(typeName)){
                   
                            return  com.org.beans.xsd.User.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    