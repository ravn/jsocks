package com.runjva.sourceforge.jsocks.helpers;

import java.net.Socket;

import com.runjva.sourceforge.jsocks.protocol.ProxyServer;
import com.runjva.sourceforge.jsocks.server.UserPasswordAuthenticator;
import com.runjva.sourceforge.jsocks.server.UserValidation;

/** Test file for UserPasswordAuthentictor */

public class UPSOCKS implements UserValidation {
	String user, password;

	UPSOCKS(String user, String password) {
		this.user = user;
		this.password = password;
	}

	public boolean isUserValid(String user, String password, Socket s) {
		System.err.println("User:" + user + "\tPassword:" + password);
		System.err.println("Socket:" + s);
		return (user.equals(this.user) && password.equals(this.password));
	}

	public static void main(String args[]) {
		String user, password;

		if (args.length == 2) {
			user = args[0];
			password = args[1];
		} else {
			user = "user";
			password = "password";
		}

		final UPSOCKS us = new UPSOCKS(user, password);
		final UserPasswordAuthenticator auth = new UserPasswordAuthenticator(us);
		final ProxyServer server = new ProxyServer(auth);

		server.start(1080);
	}
}
