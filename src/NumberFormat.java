
public class NumberFormat {
	
	private String a;
	private String b;
	private StringBuilder c = new StringBuilder();
	
	public NumberFormat(int a, int b) {
		this.a =  String.valueOf(a);
		this.b =  String.valueOf(b);
	}

	public int format() {
		for(int i = 0; i < maxCharacters(); i++) {
			if(a.length() >= (i + 1)) c.append(a.charAt(i));
			if(b.length() >= (i + 1)) c.append(b.charAt(i));
		}
		return formatResult(c);
	}
	
	public int maxCharacters() {
		if(a.length() > b.length()) {
			return a.length();
		}else {
			return b.length();
		}
	}	
	
	private int formatResult(StringBuilder c) {
		int result = Integer.parseInt(c.toString());
		if(result > 1000000) {
			return -1;
		}else {
			return result;
		}
	}
	

}
