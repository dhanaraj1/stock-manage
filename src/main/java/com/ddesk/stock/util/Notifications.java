package com.ddesk.stock.util;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Notifications {

	public static void showFormValidationAlert(String message) {
		JOptionPane.showMessageDialog(null, message, ConstMessagesEN.Messages.INFORMATION_TITLE, JOptionPane.INFORMATION_MESSAGE);
	}

	public static void showTableRowNotSelectedAlert() {
		JOptionPane.showMessageDialog(null, ConstMessagesEN.Messages.NON_ROW_SELECTED, ConstMessagesEN.Messages.ALERT_TILE,
				JOptionPane.ERROR_MESSAGE);
	}

	public static void showDeleteRowErrorMessage() {
		JOptionPane.showMessageDialog(null, ConstMessagesEN.Messages.DELETE_ROW_ERROR, ConstMessagesEN.Messages.ALERT_TILE,
				JOptionPane.ERROR_MESSAGE);
	}

	public static Boolean isNotEmptyTextFiled(JTextField jTextField) {
		Boolean valid = Boolean.TRUE;
		System.out.println(jTextField.getText().length());
		if (jTextField.getText() == null && jTextField.getText().length() <= 1) {
			JOptionPane.showMessageDialog(null, splitCamelCase(jTextField.getName()) + ConstMessagesEN.Messages.IS_REQUIRE_FILED,
					ConstMessagesEN.Messages.ALERT_TILE, JOptionPane.ERROR_MESSAGE);
			valid = Boolean.FALSE;
			jTextField.requestFocus();
		}
		return valid;
	}

	private static String splitCamelCase(String s) {
		return s.replaceAll(String.format("%s|%s|%s", "(?<=[^A-Z])(?=[A-Z][a-z])", "(?<=[^A-Z])(?=[A-Z])", "(?<=[A-Za-z])(?=[^A-Za-z])"),
				" ");
	}
}
