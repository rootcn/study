package com.tongtech.ti.cxf.demo.security.X509.client;

import java.io.IOException;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.apache.ws.security.WSPasswordCallback;

public class UTPasswordClientCallBack implements CallbackHandler {

	public void handle(Callback[] callbacks) throws IOException,
			UnsupportedCallbackException {
		WSPasswordCallback pc = (WSPasswordCallback) callbacks[0];
		pc.setPassword("keypass");
		System.out.println("Client Identifier=" + pc.getIdentifier());
		System.out.println("Client Password=" + pc.getPassword());
	}

}