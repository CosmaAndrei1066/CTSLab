//product interface
interface Document{
	void open();
	void save();
}

//Concrete Products
class TextDocument implements Document{
	@Override
	public void open() {
		System.out.println("TextDocument Opened");
	}
	
	@Override
	public void save() {
		System.out.println("TextDocument Saved");
	}
}

class ImageDocument implements Document{
	@Override
	public void open() {
		System.out.println("ImageDocument Opened");
	}
	
	@Override
	public void save() {
		System.out.println("ImageDocument Saved");
	}
}

//Creator interface(Factory Method)
interface DocumentFactory{
	Document createDocument();
}
//Concrete Creators
class TextDocumentFactory implements DocumentFactory{
	@Override
	public Document createDocument() {
		return new TextDocument();
	}
	public TextDocumentFactory() {
		//constructor if you have more attributes
	}
}
class ImageDocumentFactory implements DocumentFactory{
	@Override
	public Document createDocument() {
		return new ImageDocument();
	}
	
	public ImageDocumentFactory() {
		//constructor if you have more attributes
	}
}

public class Factory_Method_ex2 {
	public static void main(String[] args) {
		
		DocumentFactory textDocumentFactory = new TextDocumentFactory();
		Document textDocument = textDocumentFactory.createDocument();
		textDocument.open();
		textDocument.save();
		
		
		DocumentFactory imageDocumentFactory = new ImageDocumentFactory();
		Document imageDocument = imageDocumentFactory.createDocument();
		imageDocument.open();
		imageDocument.save();
		
		Document imageDocument2 = imageDocumentFactory.createDocument();
		imageDocument2.open();
		imageDocument2.save();
	}
}
