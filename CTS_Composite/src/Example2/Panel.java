package Example2;

import java.util.ArrayList;
import java.util.List;

import Example1.FileSystemItem;

public class Panel implements GUIComponent {
	private List<GUIComponent> items = new ArrayList<>();
	private String name;
	
	public Panel(String name) {
		this.name=name;
	}
	
	public void addComponent(GUIComponent component) {
		this.items.add(component);
	}
	@Override
	public void draw() {
		System.out.println("In the pannel: "+name);
		for(GUIComponent item: items) {
			item.draw();
		}
		
	}
}
