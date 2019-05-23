package HTMLbasic;

public class h extends HTML {
	int hTagNumber;
	public h(int num) {
		hTagNumber = num;
		hTag = "h"+hTagNumber;
		hTag2 = hTag;
	}
	public h() {
		hTag = "h";
	}
}
