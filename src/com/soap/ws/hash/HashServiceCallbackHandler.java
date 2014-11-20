
/**
 * HashServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package com.soap.ws.hash;

    /**
     *  HashServiceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class HashServiceCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public HashServiceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public HashServiceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for getSHA384 method
            * override this method for handling normal response from getSHA384 operation
            */
           public void receiveResultgetSHA384(
                    com.soap.ws.hash.HashServiceStub.GetSHA384ResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getSHA384 operation
           */
            public void receiveErrorgetSHA384(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getMD5 method
            * override this method for handling normal response from getMD5 operation
            */
           public void receiveResultgetMD5(
                    com.soap.ws.hash.HashServiceStub.GetMD5ResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getMD5 operation
           */
            public void receiveErrorgetMD5(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for breakHash method
            * override this method for handling normal response from breakHash operation
            */
           public void receiveResultbreakHash(
                    com.soap.ws.hash.HashServiceStub.BreakHashResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from breakHash operation
           */
            public void receiveErrorbreakHash(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getSHA512 method
            * override this method for handling normal response from getSHA512 operation
            */
           public void receiveResultgetSHA512(
                    com.soap.ws.hash.HashServiceStub.GetSHA512ResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getSHA512 operation
           */
            public void receiveErrorgetSHA512(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getSHA1 method
            * override this method for handling normal response from getSHA1 operation
            */
           public void receiveResultgetSHA1(
                    com.soap.ws.hash.HashServiceStub.GetSHA1ResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getSHA1 operation
           */
            public void receiveErrorgetSHA1(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getSHA256 method
            * override this method for handling normal response from getSHA256 operation
            */
           public void receiveResultgetSHA256(
                    com.soap.ws.hash.HashServiceStub.GetSHA256ResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getSHA256 operation
           */
            public void receiveErrorgetSHA256(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getHashType method
            * override this method for handling normal response from getHashType operation
            */
           public void receiveResultgetHashType(
                    com.soap.ws.hash.HashServiceStub.GetHashTypeResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getHashType operation
           */
            public void receiveErrorgetHashType(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getPBKDF2 method
            * override this method for handling normal response from getPBKDF2 operation
            */
           public void receiveResultgetPBKDF2(
                    com.soap.ws.hash.HashServiceStub.GetPBKDF2ResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getPBKDF2 operation
           */
            public void receiveErrorgetPBKDF2(java.lang.Exception e) {
            }
                


    }
    