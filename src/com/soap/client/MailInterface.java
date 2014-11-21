package com.soap.client;

import java.rmi.RemoteException;
import java.util.List;

import org.apache.axis2.AxisFault;

import com.soap.ws.mail.MailServiceStub;


public class MailInterface {
	
	public static boolean validateMail(String address) {
		
		MailServiceStub mstub = null;
		
		try {
			mstub = new MailServiceStub();
		} catch (AxisFault e) {
			e.printStackTrace();
		}
		
		MailServiceStub.ValidateMailAddressE vemaile = new MailServiceStub.ValidateMailAddressE();
		MailServiceStub.ValidateMailAddress vemail = new MailServiceStub.ValidateMailAddress();
		
		MailServiceStub.ValidateMailAddressResponseE vemailre = new MailServiceStub.ValidateMailAddressResponseE();
		
		vemail.setArg0( address );
		vemaile.setValidateMailAddress(vemail);
		
		try {
			vemailre = mstub.validateMailAddress( vemaile );
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
		return vemailre.getValidateMailAddressResponse().get_return();
		
	}
	
	public static boolean sendMail(String from, String pass, List<String> to, String subject, String body ) {

		
		MailServiceStub mstub = null;
		
		try {
			mstub = new MailServiceStub();
		} catch (AxisFault e) {
			e.printStackTrace();
		}
		
		MailServiceStub.SendMailE sendMailE = new MailServiceStub.SendMailE() ;       
        MailServiceStub.SendMail sendMail = new MailServiceStub.SendMail() ;
        MailServiceStub.SendMailResponseE sendMailResponseE = new MailServiceStub.SendMailResponseE() ;

        MailServiceStub.SendMailInfo info = new MailServiceStub.SendMailInfo() ;
        
        info.setBody( body );
        info.setFrom( from );
        info.setPass( pass );
        info.setSubject( subject );
        String[] to1 = new String[to.size()];
        to1 = to.toArray(to1); 
        info.setTo( to1 );
        
        sendMail.setArg0( info );
        
        sendMailE.setSendMail( sendMail );
        

        try {
            sendMailResponseE = mstub.sendMail( sendMailE ) ;
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        
       return sendMailResponseE.getSendMailResponse().get_return() ;

	}

}
