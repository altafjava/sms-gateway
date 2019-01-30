package com.javaaltaf;

/**
 * @author Altaf
 *
 */
public class MessageSender {
	public String sendSMS(String mobile, String message) {
		return "SMS sending....to " + mobile + "  with messsage=" + message;
	}
}
