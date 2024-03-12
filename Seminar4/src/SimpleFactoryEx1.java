
public class SimpleFactoryEx1 {
	public static void main(String[] args) {
		//SIMPLE FACTORY - NOT IN GoF
		//Nu folosesc o clasa anume sa creez o instanta anume
		//Un fel de flag (parametru)
		//UPCAST = pot sa creez dog si cat chit ca declar ca animal
		Animal dog = AnimalFactory.createAnimal("Dog");
		Animal cat = AnimalFactory.createAnimal("Cat");
		dog.sound();
		cat.sound();
	}
}
//SIMPLE FACTORY

interface Animal{
	void sound();
}

class Dog implements Animal{
	@Override
	public void sound() {
		System.out.println("Woof Woof!");
	}
	
}
class Cat implements Animal{
	@Override
	public void sound() {
		System.out.println("Meow!");
	}
}

class AnimalFactory{
	public static Animal createAnimal(String type) {
		if("Dog".equalsIgnoreCase(type)) {
			return new Dog();
		}else if("Dog".equalsIgnoreCase(type)){
			return new Cat();
		}else {
			throw new IllegalArgumentException("Invalid Animal type");
		}
	}
}


