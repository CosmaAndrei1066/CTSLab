package example1;

public class XMLAdapter implements DataReader {
	private XMLDataReader xmlReader;
	
	public XMLAdapter(XMLDataReader xmlReader) {
		this.xmlReader=xmlReader;
	}
	
	@Override
	public String readData() {
		return xmlReader.readXML();
	}
}
