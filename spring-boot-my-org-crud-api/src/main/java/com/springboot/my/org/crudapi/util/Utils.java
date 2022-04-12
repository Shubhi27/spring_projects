package com.springboot.my.org.crudapi.util;

import java.util.Date;

public class Utils {
	public static String getCurrentTimestamp() {
		return new Date().toString();
	}
}
