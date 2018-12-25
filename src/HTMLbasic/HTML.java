package HTMLbasic;

public abstract class HTML {
	String hTag = "";
	String hTag2 = "";
	String hName ="";
	String hId="";
	String input = "";
	
	public void setWrappedtext(String t) {
		input = t;
	}
	public void setName(String name) {
		hName = name;
	}
	public void setID(String id) {
		hId = id;
	}

	
	public String toHTMLString() {
		String returnString = null;
		
		if(hName.equals("") && hId.equals(""))
			returnString = "<"+hTag+">"+input+"</"+hTag2+">";
		
		else if(!hName.equals("") && hId.equals(""))
				returnString = "<"+hTag+" name = "+hName+">"+input+"</"+hTag2+">";
		
		else if(hName.equals("") && !hId.equals(""))
				returnString = "<"+hTag+" id = "+hId+">"+input+"</"+hTag2+">";
		
		else if(!hName.equals("") && !hId.equals(""))
				returnString = "<"+hTag+" name = "+hName+" id = "+hId+">"+input+"</"+hTag2+">";
				
		return returnString;
	}
	
}

/*


Use the decorator pattern to “decorate” an HTML tag that contains a piece of text.
 


All should have the ability to specify a name and an id attribute. 

The <h> tag should have the ability to specify a number between 1 –6 (inclusive)so that it will be rendered as an <h1>, <h2> etc.

And the input should have the ability to specify the type attribute, an event attribute 
(that is configurableto be any event such as “onclick” and “onblur”), and a valueattribute.


Note that the <a> tag should have the ability to specify an href attribute. 

Write a main method that demonstrates the use of your classes.
Here are two examples of what the results of a decorated HTML tag could look like:
	<i><a href="www.touro.edu"><strong><div>Touro</div></strong></a></i><em><small><input type="button" value="action" onclick="javascript:alert('action')"></input></small></em>
*/