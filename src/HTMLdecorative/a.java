package HTMLdecorative;

import HTMLbasic.HTML;

public class a extends HTMLDecorator {
	String href = "";
	
	public a(HTML h) {
		super(h);
		decTag = "a";

	}
	public a(HTML h, String href) {
		super(h);
		decTag = "a";
		this.href = href;
	}
	
	
	@Override
	public String toHTMLString() {
		String returnString = "";
		
		if (!href.equals(""))
		returnString =  "<" + decTag + " href+"+href + ">" + decoratedSet.toHTMLString() + "</" + decTag + ">";
		
		else
			returnString = super.toHTMLString();
		
		return returnString;
	}
}