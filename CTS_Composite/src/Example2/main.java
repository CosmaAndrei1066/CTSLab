package Example2;

public class main {

	public static void main(String[] args) {
		
		Button button1 = new Button("BTN1");
		Button button2 = new Button("BTN2");
		Button button3 = new Button("BTN3");
		
		Panel panel1 = new Panel("Panel 1");
		
		panel1.addComponent(button1);
		
		Panel panel2 = new Panel("Panel 2");
		
		panel2.addComponent(button2);
		panel2.addComponent(button3);
		
		panel1.addComponent(panel2);
		
		
		panel1.draw();

	}

}
