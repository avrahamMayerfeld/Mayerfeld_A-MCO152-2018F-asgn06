package HTMLbasic;

public class input extends HTML {
     String type = "";
     String event= "";
     String value = "";
  
     public input() {
		hTag = "input";
		hTag2 = hTag;
	}
    public input(String type) {
		this.type = type;
		hTag = "input type=" + type;
		hTag2 = "input";
		
	}
	public input(String type, String value) {
		this.type = type;
		this.event = event;
		hTag = "input type=" + type + " value="+ value;
		hTag2 = "input";
	}
	public input(String type,String value,String event) {
		this.type = type;
		this.event = event;
		this.value = value;
		hTag = "input type=" + type + " value="+ value +" "+ event;
		hTag2 = "input";
	}
		
	
}
