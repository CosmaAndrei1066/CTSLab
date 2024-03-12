import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        OShop oShop = new OShop("Emag", "logo.jpg", new ArrayList<Product>());

        Product product1 = new Product("Laptop", 3200.5, 1,1, 1123, "");
        Product product2 = new Product("Frigider", 207.95, 1,2, 1245, "");

        Product product3 = new Product(product1);

        product3.setQuantity(5);
        product3.setName("Paine");

        oShop.addProduct(product1);
        oShop.addProduct(product2);

        oShop.removeProduct(product1);
        System.out.println(product1.equals(product2));
    }
}

class OShop {
    private String onlineShopName;
    private String imageLink;
    private ArrayList<Product> productList;

    OShop(String name, String imageLink, ArrayList<Product> productList)
    {
        this.productList = new ArrayList<Product>(productList);
        this.imageLink = imageLink;
        this.onlineShopName = name;
        
    }

    public void addProduct(Product p) {
    	this.productList.add(p);
    }
    public void removeProduct(Product p) {
    	this.productList.remove(p);
    }
//    public void modifyProductsList(int what, Prod p)
//    {
//        if(what == 1)
//        {
//            this.products.add(p);
//        }
//        else
//            this.products.remove(p);
//    }

    public String getOnlineShopName() {
        return onlineShopName;
    }

    public void setOnlineShopName(String onlineShopName) {
        this.onlineShopName = onlineShopName;
    }

	public String getImageLink() {
		return imageLink;
	}

	public void setImageLink(String imageLink) {
		this.imageLink = imageLink;
	}
}

class Product
{
    private int id;
    private String name;
    private double price;
    private int type;
    private int category;
    private int quantity;
    private String expirationDate; //expiry date - only for goods
    private String specifications; // ex.: processor, memory, power, volume (for refrigerators etc)

    public Product(String name, double price, int type, int category, int id, String exp)
    {
    	name = name;
        price = price;
        type = type;
        category = category;
        this.id = id;
        this.expirationDate = exp;
    }

    public Product(Product p)
    {
        this.name = p.name;
        this.price = p.price;
        this.type = p.type;
        this.category = p.category;
        this.id = p.id;
        this.category=p.category;
    }

    public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public String getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getSpecifications() {
		return specifications;
	}

	public void setSpecifications(String specifications) {
		this.specifications = specifications;
	}

	public boolean equals(Product product)
    {
		if(this==product) {
			return true;
		}
        if(product.id == this.id)
            return false;
        if(product.name!=this.name)
            return false;
        if(product.price != this.price)
            return false;
        if(product.type != this.type)
            return false;
        if(product.category != this.category)
            return false;

        return true;
    }

//    public void modify(boolean flag, double val)
//    {
//        if(flag)
//            this.productPrice+=this.productPrice*val;
//        if(!flag)
//            this.productPrice-=this.productPrice*val/100;
//    }
    public void increasePriceByPercent(double val) {
    	this.price+=this.price*val/100;
    }
    public void reducePriceByPercent(double val) {
    	this.price-=this.price*val/100;
    }
}

class User
{
    private String name;
    private String id;
    private ArrayList<Order> ordersList;
    //private ArrayList<Order> canceledList;

    public User(String username, String userId)
    {
        this.name = username;
        this.id = userId;
        ordersList=new ArrayList<Order>();
        //canceledList=new ArrayList<Order>();
    }

    public void addToList(Order o)
    {
        ordersList.add(o);
    }
    
    public void removeFromList(Order o)
    {
        ordersList.remove(o);
    }
    
}

class Order
{
    private ArrayList<Product> productList;
    private String address;
    private boolean canceled;

    public Order()
    {
    	productList = new ArrayList<Product>();
    }
    public void addProduct(Product p)
    {
        if(productList.size() > 99) {
        	System.out.println("Your order can't exceed 99 products!");
        	return;
        }
        else {
        	productList.add(p);
        }
    }

    public void removeProduct(Product p)
    {
    	productList.remove(p);
    }
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public boolean isCanceled() {
		return canceled;
	}
	public void setCanceled(boolean canceled) {
		this.canceled = canceled;
	}
    
}

class Inventory
{
    private ArrayList<Product> products;

    public Inventory()
    {
        this.products=new ArrayList<Product>();
    }
    public void addProduct(Product p) {
    	products.add(p);
    }

    public void removeProduct(Product p) {
    	products.remove(p);
    }
    
}
