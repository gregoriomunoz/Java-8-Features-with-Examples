package example.java8.optional;

import java.util.Optional;

import example.java8.optional.beans.USB;

public class FilteringOptionalMain {

	public static void main(String[] args) {

		//Rejecting Certain Values Using the filter Method
		
		//old school method
		//		USB usb = ...;
		//		if(usb != null && "3.0".equals(usb.getVersion())){
		//		  System.out.println("ok");
		//		}
		
		//Optional method
		
		USB usb = new USB();
		Optional<USB> maybeUSB = Optional.of(usb);
		maybeUSB.filter(u -> "v1".equals(u.getVersion())).ifPresent((x)->System.out.println("ok")); 
		
		
	}

}
