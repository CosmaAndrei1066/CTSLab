package example1;

public class mainAdapter {

	public static void main(String[] args) {
		//Adapter aka nu ai acces la cod e blackbox, poate fi cod extern
		//vreau sa vin cu upgradeuri fara sa dau peste cap structura
		//cross-platform compatibility
		
		
	/*
	 * Imagine a scenario where your application needs to read data from various file formats (e.g., XML,
	CSV, JSON). Instead of rewriting the file reading logic for each file type, you can use the Adapter
	Pattern. You can have a common interface (Target) for reading data, and then implement adapters
	for each file type. The Adaptee would be the specific file reading libraries or classes you are
	adapting to work with your interface.
	 */
		
		DataReader xmlAdapter = new XMLAdapter(new XMLDataReader());
		DataReader jsonAdapter = new JSONAdapter(new JSONDataReader());
		System.out.println(xmlAdapter.readData());
		System.out.println(jsonAdapter.readData());
	}

}
