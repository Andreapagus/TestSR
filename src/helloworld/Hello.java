package helloworld;

import java.util.logging.*;

public class Hello {
	public static final Logger log= Logger.getLogger("Hello");

	public static void main(String[] args) {
		log.info("Hello World");
	}
}
