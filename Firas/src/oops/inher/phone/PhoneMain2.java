package oops.inher.phone;

public class PhoneMain2 {

	public static void main(String[] args) {
		Phones gadget = new Samsung();
		PhoneGadget.touchscreen(gadget);
		
		gadget = new OnePlus();
		PhoneGadget.touchscreen(gadget);
		
		gadget = new Vivo();
		PhoneGadget.touchscreen(gadget);
	}
}
