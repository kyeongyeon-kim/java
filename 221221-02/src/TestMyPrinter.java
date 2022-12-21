public class TestMyPrinter {
	public static void main(String[] args) {
		MyStrPrinter strP = new MyStrPrinter(new MyCharPrinter());
		
		strP.printChar('c');
		strP.printString("str");
		
	}
}
