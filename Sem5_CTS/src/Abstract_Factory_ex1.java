interface Chair {
	String sitOn();
}

class ModernChair implements Chair {
	@Override
	public String sitOn() {
		return "Sitting on modern chair";
	}
}

class VictorianChair implements Chair {
	@Override
	public String sitOn() {
		return "Sitting on Victorian chair";
	}
}

interface Sofa {
	String sitOn();
}

class ModernSofa implements Sofa {
	@Override
	public String sitOn() {
		return "Sitting on modern Sofa";
	}
}

class VictorianSofa implements Sofa {
	@Override
	public String sitOn() {
		return "Sitting on Victorian Sofa";
	}
}

interface FurnitureFactory{
	Chair createChair();
	Sofa createSofa();
}

class ModernFurnitureFactory implements FurnitureFactory{
	@Override
	public Chair createChair() {
		return new ModernChair();
	}
	@Override
	public Sofa createSofa() {
		return new ModernSofa();
	}
}

class VictorianFurnitureFactory implements FurnitureFactory{
	@Override
	public Chair createChair() {
		return new VictorianChair();
	}
	@Override
	public Sofa createSofa() {
		return new VictorianSofa();
	}
}

class Client{
	private final FurnitureFactory furnitureFactory;
	
	public Client(FurnitureFactory furnitureFactory) {
		this.furnitureFactory=furnitureFactory;
	}
	
	public void useFurniture() {
		Chair chair = furnitureFactory.createChair();
		Sofa sofa = furnitureFactory.createSofa();
		
		System.out.println(chair.sitOn());
		System.out.println(sofa.sitOn());
	}
}

public class Abstract_Factory_ex1 {
	
	public static void main(String[] args) {
		FurnitureFactory modernFactory = new ModernFurnitureFactory();
		FurnitureFactory victorianFactory = new VictorianFurnitureFactory();
		
		System.out.println("ClientUses modern furniture");
		Client client1 = new Client(modernFactory);
		client1.useFurniture();
		
		System.out.println("ClientUses victorian furniture");
		Client client2 = new Client(victorianFactory);
		client2.useFurniture();

	}

}
