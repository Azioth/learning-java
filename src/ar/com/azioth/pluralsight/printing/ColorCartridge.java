package ar.com.azioth.pluralsight.printing;

public class ColorCartridge implements ICartridge {

	@Override
	public String toString() {
		return "color!";
	}

	@Override
	public String getFillPercentage() {
		return "97%";
	}
}
