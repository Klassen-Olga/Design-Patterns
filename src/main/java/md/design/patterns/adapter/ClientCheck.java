package md.design.patterns.adapter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * It is a class adaptee which can change the name of the function in the future
 * we use the adapter so there is no need to change name everywhere
 * we change it only in adapter
 */
public class ClientCheck {

	public boolean namenameCheck(String text){
		Pattern p=Pattern.compile("^[a-zA-Z]*$");
		Matcher matcher=p.matcher(text);
		return matcher.find();
	}
}
