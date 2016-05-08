

/**
 * OrderProcessing.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v10  Built on : Sep 04, 2013 (02:02:54 UTC)
 */

    package org.wso2.carbon.order.stub;

    /*
     *  OrderProcessing java interface
     */

    public interface OrderProcessing {
          

        /**
          * Auto generated method signature
          * 
                    * @param cancelOrder9
                
         */

         
                     public boolean cancelOrder(

                        com.org.beans.xsd.User user10,java.lang.String itemnum11)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param cancelOrder9
            
          */
        public void startcancelOrder(

            com.org.beans.xsd.User user10,java.lang.String itemnum11,

            final org.wso2.carbon.order.stub.OrderProcessingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getAvailableItems14
                
         */

         
                     public com.org.beans.xsd.Item[] getAvailableItems(

                        )
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getAvailableItems14
            
          */
        public void startgetAvailableItems(

            

            final org.wso2.carbon.order.stub.OrderProcessingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param hasItem17
                
         */

         
                     public boolean hasItem(

                        java.lang.String inId18)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param hasItem17
            
          */
        public void starthasItem(

            java.lang.String inId18,

            final org.wso2.carbon.order.stub.OrderProcessingCallbackHandler callback)

            throws java.rmi.RemoteException;

     
       /**
         * Auto generated method signature for Asynchronous Invocations
         * 
         */
        public void  payForOrder(
         com.org.beans.xsd.User user22

        ) throws java.rmi.RemoteException
        
        ;

        

        /**
          * Auto generated method signature
          * 
                    * @param getPaymentAmount23
                
         */

         
                     public int getPaymentAmount(

                        com.org.beans.xsd.User user24)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getPaymentAmount23
            
          */
        public void startgetPaymentAmount(

            com.org.beans.xsd.User user24,

            final org.wso2.carbon.order.stub.OrderProcessingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param login27
                
         */

         
                     public boolean login(

                        java.lang.String username28,java.lang.String password29)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param login27
            
          */
        public void startlogin(

            java.lang.String username28,java.lang.String password29,

            final org.wso2.carbon.order.stub.OrderProcessingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param buyItem32
                
         */

         
                     public boolean buyItem(

                        com.org.beans.xsd.User user33,java.lang.String itemnum34)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param buyItem32
            
          */
        public void startbuyItem(

            com.org.beans.xsd.User user33,java.lang.String itemnum34,

            final org.wso2.carbon.order.stub.OrderProcessingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        
       //
       }
    