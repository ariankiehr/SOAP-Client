package com.soap.client;

import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.List;

import org.apache.axis2.AxisFault;

import com.soap.ws.hash.HashServiceStub;

public class HashInterface {
	
	public static String getMD5(String hash) {
		
		HashServiceStub hstub = null;
		try {
			hstub = new HashServiceStub();
		} catch (AxisFault e) {
			e.printStackTrace();
		}
		
		HashServiceStub.GetMD5E gmd5e = new HashServiceStub.GetMD5E();
		HashServiceStub.GetMD5 gmd5 = new HashServiceStub.GetMD5();
		
		HashServiceStub.GetMD5ResponseE gmd5re = new HashServiceStub.GetMD5ResponseE();
		
		
		gmd5.setArg0( hash );
		gmd5e.setGetMD5(gmd5);
		
		try {
			gmd5re = hstub.getMD5( gmd5e );
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
		return gmd5re.getGetMD5Response().get_return() ;

	}
	
	
	public static String getSHA1(String hash) {
		
		HashServiceStub hstub = null;
		try {
			hstub = new HashServiceStub();
		} catch (AxisFault e) {
			e.printStackTrace();
		}
		
		HashServiceStub.GetSHA1E gmd5e = new HashServiceStub.GetSHA1E();
		HashServiceStub.GetSHA1 gmd5 = new HashServiceStub.GetSHA1();
		
		HashServiceStub.GetSHA1ResponseE gmd5re = new HashServiceStub.GetSHA1ResponseE();
		
		
		gmd5.setArg0( hash );
		gmd5e.setGetSHA1(gmd5);
		
		try {
			gmd5re = hstub.getSHA1(gmd5e );
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
		return gmd5re.getGetSHA1Response().get_return() ;
	}
	
	public static String getSHA256(String hash) {
		
		HashServiceStub hstub = null;
		try {
			hstub = new HashServiceStub();
		} catch (AxisFault e) {
			e.printStackTrace();
		}
		
		HashServiceStub.GetSHA256E gmd5e = new HashServiceStub.GetSHA256E();
		HashServiceStub.GetSHA256 gmd5 = new HashServiceStub.GetSHA256();
		
		HashServiceStub.GetSHA256ResponseE gmd5re = new HashServiceStub.GetSHA256ResponseE();
		
		
		gmd5.setArg0( hash );
		gmd5e.setGetSHA256(gmd5);
		
		try {
			gmd5re = hstub.getSHA256( gmd5e );
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
		return gmd5re.getGetSHA256Response().get_return() ;
	}
	
	
	public static String getSHA384(String hash) {
		
		HashServiceStub hstub = null;
		try {
			hstub = new HashServiceStub();
		} catch (AxisFault e) {
			e.printStackTrace();
		}
		
		HashServiceStub.GetSHA384E gmd5e = new HashServiceStub.GetSHA384E();
		HashServiceStub.GetSHA384 gmd5 = new HashServiceStub.GetSHA384();
		
		HashServiceStub.GetSHA384ResponseE gmd5re = new HashServiceStub.GetSHA384ResponseE();
		
		
		gmd5.setArg0( hash );
		gmd5e.setGetSHA384(gmd5);
		
		try {
			gmd5re = hstub.getSHA384( gmd5e );
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
		return gmd5re.getGetSHA384Response().get_return() ;
	}
	
	
	public static String getSHA512(String hash) {
		
		HashServiceStub hstub = null;
		try {
			hstub = new HashServiceStub();
		} catch (AxisFault e) {
			e.printStackTrace();
		}
		
		HashServiceStub.GetSHA512E gmd5e = new HashServiceStub.GetSHA512E();
		HashServiceStub.GetSHA512 gmd5 = new HashServiceStub.GetSHA512();
		
		HashServiceStub.GetSHA512ResponseE gmd5re = new HashServiceStub.GetSHA512ResponseE();
		
		
		gmd5.setArg0( hash );
		gmd5e.setGetSHA512(gmd5);
		
		try {
			gmd5re = hstub.getSHA512( gmd5e );
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
		return gmd5re.getGetSHA512Response().get_return() ;
	}
	
	
	
	public static String getPBKDF2(String hash) {
		
		HashServiceStub hstub = null;
		try {
			hstub = new HashServiceStub();
		} catch (AxisFault e) {
			e.printStackTrace();
		}
		
		HashServiceStub.GetPBKDF2E gmd5e = new HashServiceStub.GetPBKDF2E();
		HashServiceStub.GetPBKDF2 gmd5 = new HashServiceStub.GetPBKDF2();
		
		HashServiceStub.GetPBKDF2ResponseE gmd5re = new HashServiceStub.GetPBKDF2ResponseE();
		
		
		gmd5.setArg0( hash );
		gmd5e.setGetPBKDF2(gmd5);
		
		try {
			gmd5re = hstub.getPBKDF2( gmd5e );
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
		return gmd5re.getGetPBKDF2Response().get_return() ;
	}
	
	
	public static List<String> detectHash(String hash) {
		HashServiceStub hstub = null;
		try {
			hstub = new HashServiceStub();
		} catch (AxisFault e) {
			e.printStackTrace();
		}
		
		HashServiceStub.GetHashTypeE bhe = new HashServiceStub.GetHashTypeE();
		HashServiceStub.GetHashType bh =  new HashServiceStub.GetHashType();
		HashServiceStub.GetHashTypeResponseE bhre = new HashServiceStub.GetHashTypeResponseE();
		
		bh.setArg0(hash);
		bhe.setGetHashType(bh);
		
		try {
			bhre = hstub.getHashType(bhe);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
		return Arrays.asList( bhre.getGetHashTypeResponse().get_return() );
		
		
	}
	
	
	
	public static String crackHash(String hash, String timeout, String type) {
		HashServiceStub hstub = null;
		try {
			hstub = new HashServiceStub();
		} catch (AxisFault e) {
			e.printStackTrace();
		}
		
		HashServiceStub.BreakHashE bhe = new HashServiceStub.BreakHashE();
		HashServiceStub.BreakHash bh =  new HashServiceStub.BreakHash();
		HashServiceStub.BreakHashResponseE bhre = new HashServiceStub.BreakHashResponseE();
		
		HashServiceStub.HashToBreak htb = new HashServiceStub.HashToBreak();
		
		htb.setHash( hash );
		if( "MD5".equals(type) ) {
			htb.setType( HashServiceStub.EnumType.MD5);
		} else if ( "SHA1".equals(type) ) {
			htb.setType( HashServiceStub.EnumType.SHA1);
		} else {
			return "Wrong algorithm type";
		}
		
		
		try {
			htb.setTimeout( Integer.parseInt(timeout) );
		} catch (NumberFormatException e1) {
			return "Time our must be an integer";
		}
		
		
		bh.setArg0(htb);
		bhe.setBreakHash(bh);
		
		try {
			bhre = hstub.breakHash(bhe);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
		return bhre.getBreakHashResponse().get_return();

	}

}
