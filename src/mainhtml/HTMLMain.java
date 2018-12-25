package mainhtml;

import HTMLbasic.HTML;
import HTMLbasic.div;
import HTMLbasic.p;
import HTMLdecorative.em;
import HTMLdecorative.i;
import HTMLdecorative.small;
import HTMLdecorative.strong;

public class HTMLMain {
   public static void main(String[] args) {
	  
	   HTML block = new strong(new i(new small(new p())));
	   
	   System.out.println(block.toHTMLString());
	   
	   HTML h = new div();
	   h.setWrappedtext("Hello World");
	   HTML html = new i(new strong(new em(h)));
	   System.out.println(html.toHTMLString());
   }
}
