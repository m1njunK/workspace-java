package b_default;

public class Window {

	public void print (Printable printer) {
		printer.print();
		printer.colorPrint();
	}
	
	public static void main(String[] args) {
		Window window = new Window();
		Printable lg = new LGPrinter();
		window.print(lg);
		Printable hp = new HPPrinter();
		window.print(hp);
	}
}
