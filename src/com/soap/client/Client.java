package com.soap.client;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;

import com.soap.ws.hash.HashServiceStub;
import com.soap.ws.mail.MailServiceStub;
import com.soap.ws.text.TextServiceStub;
import com.sun.mail.imap.protocol.MailboxInfo;

public class Client {
	
	
	public static void main(String[] args) {
		
		HashServiceStub hstub = null;
		try {
			hstub = new HashServiceStub();
		} catch (AxisFault e) {
			e.printStackTrace();
		}
		
		
		HashServiceStub.GetMD5E gmd5e = new HashServiceStub.GetMD5E();
		HashServiceStub.GetMD5 gmd5 = new HashServiceStub.GetMD5();
		
		HashServiceStub.GetMD5ResponseE gmd5re = new HashServiceStub.GetMD5ResponseE();
		
		
		gmd5.setArg0( "akiehr" );
		gmd5e.setGetMD5(gmd5);
		
		try {
			gmd5re = hstub.getMD5( gmd5e );
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
		System.out.println( gmd5re.getGetMD5Response().get_return() );
		
		
		
		MailServiceStub mstub = null;
		
		try {
			mstub = new MailServiceStub();
		} catch (AxisFault e) {
			e.printStackTrace();
		}
		
		MailServiceStub.ValidateMailAddressE vemaile = new MailServiceStub.ValidateMailAddressE();
		MailServiceStub.ValidateMailAddress vemail = new MailServiceStub.ValidateMailAddress();
		
		MailServiceStub.ValidateMailAddressResponseE vemailre = new MailServiceStub.ValidateMailAddressResponseE();
		
		MailServiceStub.SendMailInfo asd = new MailServiceStub.SendMailInfo();
		
		vemail.setArg0( "ariankiehr@gmail.com" );
		vemaile.setValidateMailAddress(vemail);
		
		try {
			vemailre = mstub.validateMailAddress( vemaile );
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
		System.out.println( vemailre.getValidateMailAddressResponse().get_return() );
		
		try {
			TextServiceStub tstub = new TextServiceStub();
		} catch (AxisFault e) {
			e.printStackTrace();
		}
		
		
	}

}
