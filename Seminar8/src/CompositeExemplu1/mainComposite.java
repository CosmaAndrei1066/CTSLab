package CompositeExemplu1;

public class mainComposite {

	public static void main(String[] args) {
		//La nodurile leaf arunci not implemented exception, ca sa poti sa ai procedurile de Add si Remove in interfata
		
		File file1 = new File("File1.text");
		File file2 = new File("File2.docx");
		File file3 = new File("File3.pdf");
		
		Folder rootFolder = new Folder("RootFolder");
		rootFolder.addItem(file1);
		rootFolder.addItem(file2);
		
		Folder subFolder = new Folder("SubFolder");
		subFolder.addItem(file3);
		
		rootFolder.addItem(subFolder);
		
		rootFolder.printName();
	}

}
