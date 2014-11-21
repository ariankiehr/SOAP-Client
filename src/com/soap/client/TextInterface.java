package com.soap.client;

import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.List;

import org.apache.axis2.AxisFault;

import com.soap.ws.text.TextServiceStub;
import com.soap.ws.text.TextServiceStub.Tag;

public class TextInterface {

	public static List<String> getMostUsedWords(String text) {

		TextServiceStub tstub = null;
		try {
			tstub = new TextServiceStub();
		} catch (AxisFault e) {
			e.printStackTrace();
		}

		TextServiceStub.GetMostUsedWords muw = new TextServiceStub.GetMostUsedWords();
		TextServiceStub.GetMostUsedWordsE muwe = new TextServiceStub.GetMostUsedWordsE();
		TextServiceStub.GetMostUsedWordsResponseE muwre = new TextServiceStub.GetMostUsedWordsResponseE();

		muw.setArg0(text);
		muwe.setGetMostUsedWords(muw);

		try {
			muwre = tstub.getMostUsedWords(muwe);
		} catch (RemoteException e) {
			e.printStackTrace();
		}

		return Arrays.asList(muwre.getGetMostUsedWordsResponse().get_return());

	}

	public static String correctErrors(String text) {

		TextServiceStub tstub = null;
		try {
			tstub = new TextServiceStub();
		} catch (AxisFault e) {
			e.printStackTrace();
		}

		TextServiceStub.CorrectErrors ce = new TextServiceStub.CorrectErrors();
		TextServiceStub.CorrectErrorsE cee = new TextServiceStub.CorrectErrorsE();
		TextServiceStub.CorrectErrorsResponseE cere = new TextServiceStub.CorrectErrorsResponseE();

		ce.setArg0(text);
		cee.setCorrectErrors(ce);

		try {
			cere = tstub.correctErrors(cee);
		} catch (RemoteException e) {
			e.printStackTrace();
		}

		return cere.getCorrectErrorsResponse().get_return();
	}

	public static List<Tag> detectLanguage(String text) {
		TextServiceStub tstub = null;
		try {
			tstub = new TextServiceStub();
		} catch (AxisFault e) {
			e.printStackTrace();
		}

		TextServiceStub.DetectLanguage dl = new TextServiceStub.DetectLanguage();
		TextServiceStub.DetectLanguageE dle = new TextServiceStub.DetectLanguageE();
		TextServiceStub.DetectLanguageResponseE dlre = new TextServiceStub.DetectLanguageResponseE();

		dl.setArg0(text);
		dle.setDetectLanguage(dl);

		try {
			dlre = tstub.detectLanguage(dle);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return Arrays.asList(dlre.getDetectLanguageResponse().get_return());

	}

}
