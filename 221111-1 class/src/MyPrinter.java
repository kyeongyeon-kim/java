
public class MyPrinter {
	private char symbol;
	
	public MyPrinter(char symbol) {
		this.symbol = symbol;
	}
	public void printingChar(char symbol) {
		this.symbol = symbol;
	}
	public void printRowCol(int line, int row) {
		for (int j = 0; j < line; j++) {
			for (int i = 0; i < row; i++) {
				System.out.print(symbol);
			}
			System.out.println();
		}
	}
}
