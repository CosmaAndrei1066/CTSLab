package Example2;

public class Button implements GUIComponent{
	private String name;
	
	public Button(String name) {
		this.name=name;
	}
	
	@Override
	public void draw() {
		System.out.println("Drawing Button: "+name);
	}
}
