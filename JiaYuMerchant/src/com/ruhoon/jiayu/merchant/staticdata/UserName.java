package com.ruhoon.jiayu.merchant.staticdata;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserName {

	public static boolean isMobileNO(String mobiles) {
		Pattern p = Pattern
				.compile("^((13[0-9])|(15[^4,\\D])|(18[0-9]))\\d{8}$");
		Matcher m = p.matcher(mobiles);
		return m.matches();
	}
}
