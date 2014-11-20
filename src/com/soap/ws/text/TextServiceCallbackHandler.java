
/**
 * TextServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package com.soap.ws.text;

    /**
     *  TextServiceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class TextServiceCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public TextServiceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public TextServiceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for getMostUsedWords method
            * override this method for handling normal response from getMostUsedWords operation
            */
           public void receiveResultgetMostUsedWords(
                    com.soap.ws.text.TextServiceStub.GetMostUsedWordsResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getMostUsedWords operation
           */
            public void receiveErrorgetMostUsedWords(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for detectLanguage method
            * override this method for handling normal response from detectLanguage operation
            */
           public void receiveResultdetectLanguage(
                    com.soap.ws.text.TextServiceStub.DetectLanguageResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from detectLanguage operation
           */
            public void receiveErrordetectLanguage(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for correctErrors method
            * override this method for handling normal response from correctErrors operation
            */
           public void receiveResultcorrectErrors(
                    com.soap.ws.text.TextServiceStub.CorrectErrorsResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from correctErrors operation
           */
            public void receiveErrorcorrectErrors(java.lang.Exception e) {
            }
                


    }
    