
public class TestMyPrinter {

	public static void main(String[] args) {
		MyPrinter printer = new MyPrinter('@');
		
		printer.printRowCol(4,3);
		
		printer.printingChar('o');
		
		printer.printRowCol(2,2);
	}

}
