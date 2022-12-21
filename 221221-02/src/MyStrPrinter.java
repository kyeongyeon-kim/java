public class MyStrPrinter {
	private MyCharPrinter p;
	
	public MyStrPrinter(MyCharPrinter p) {
		this.p = p;
	}
	
	public void printChar(char c) {
		p.PrintChar(c);
	}
	
	public void printString(String str) {
		for (int i = 0; i < str.length(); i++) {
			p.PrintChar(str.charAt(i));
		}
	}
}
