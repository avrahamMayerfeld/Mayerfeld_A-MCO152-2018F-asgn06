package HTMLdecorative;

import HTMLbasic.HTML;

public abstract class HTMLDecorator extends HTML {
	HTML decoratedSet;
	String decTag;

	public HTMLDecorator(HTML html) {
		decoratedSet = html;
		
	}   
	
	@Override
    	public String toHTMLString() {
		return "<" + decTag + ">" + decoratedSet.toHTMLString() + "</" + decTag + ">";
	}
	
}
