package ar.com.azioth.pluralsight.greetings;

import ar.com.azioth.pluralsight.printing.BWCartridge;
import ar.com.azioth.pluralsight.printing.ColorCartridge;
import ar.com.azioth.pluralsight.printing.Printer;

public class HelloWorld {

	public static void main(String[] args)
	{
		Printer<BWCartridge> printer = new Printer<BWCartridge>(true, "MY PRINTER", new BWCartridge());
		
		printer.printUsingCartridge(new ColorCartridge(), "Hi!");
		printer.print(-10);
	}
}
