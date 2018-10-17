package br.edu.iftm.igrejasonline.services.exceptions;

import org.springframework.remoting.RemoteTimeoutException;

public class ObjectNotFoundException extends RemoteTimeoutException {

	private static final long serialVersionUID = 1L;

	public ObjectNotFoundException(String msg) {
		super(msg);

	}

	public ObjectNotFoundException(String msg, Throwable cause) {
		super(msg, cause);
	}
}
