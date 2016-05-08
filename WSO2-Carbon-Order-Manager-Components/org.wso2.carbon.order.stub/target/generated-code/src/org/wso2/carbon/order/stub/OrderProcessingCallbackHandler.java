
/**
 * OrderProcessingCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v10  Built on : Sep 04, 2013 (02:02:54 UTC)
 */

    package org.wso2.carbon.order.stub;

    /**
     *  OrderProcessingCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class OrderProcessingCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public OrderProcessingCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public OrderProcessingCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for cancelOrder method
            * override this method for handling normal response from cancelOrder operation
            */
           public void receiveResultcancelOrder(
                    boolean result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from cancelOrder operation
           */
            public void receiveErrorcancelOrder(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getAvailableItems method
            * override this method for handling normal response from getAvailableItems operation
            */
           public void receiveResultgetAvailableItems(
                    com.org.beans.xsd.Item[] result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getAvailableItems operation
           */
            public void receiveErrorgetAvailableItems(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for hasItem method
            * override this method for handling normal response from hasItem operation
            */
           public void receiveResulthasItem(
                    boolean result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from hasItem operation
           */
            public void receiveErrorhasItem(java.lang.Exception e) {
            }
                
               // No methods generated for meps other than in-out
                
           /**
            * auto generated Axis2 call back method for getPaymentAmount method
            * override this method for handling normal response from getPaymentAmount operation
            */
           public void receiveResultgetPaymentAmount(
                    int result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getPaymentAmount operation
           */
            public void receiveErrorgetPaymentAmount(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for login method
            * override this method for handling normal response from login operation
            */
           public void receiveResultlogin(
                    boolean result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from login operation
           */
            public void receiveErrorlogin(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for buyItem method
            * override this method for handling normal response from buyItem operation
            */
           public void receiveResultbuyItem(
                    boolean result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from buyItem operation
           */
            public void receiveErrorbuyItem(java.lang.Exception e) {
            }
                


    }
    