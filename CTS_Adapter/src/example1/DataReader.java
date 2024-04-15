package example1;

public interface DataReader {
	String readData();
}

//adaptee 1
class XMLDataReader{
	String readXML() {
		return "Data from XML";
	}
}

//adaptee 2
class JSONDataReader{
	String readJSON() {
		return "Data from JSON";
	}
}

