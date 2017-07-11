class Book{
	public String getName() {
		return name;
	}


	public String getAuthor() {
		return author;
	}


	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantityinstock() {
		return quantityinstock;
	}

	public void setQuantityinstock(int quantityinstock) {
		this.quantityinstock = quantityinstock;
	}
	String name="";
	String author="";
	double price=0;
	int quantityinstock=0;
	Book(String name,String author,double price , int quantityinprice, int quantityinstock)
	{
		this.name=name;
		this.author=author;
		this.price=price;
		this.quantityinstock=quantityinstock;
	
	}
 }
	
	class Author {
	     String name="";
	     String email="";
	     char gender='f';
	     Author(String name, String email , char gender){
	    	 this.name=name;
	    	 this.email=email;
	    	 this.gender=gender;
	     }
	     public static void main(String[] args) {
		 Author a=new Author("sun","sun@gmail.com",'f');
		 Book b=new Book("hello world","sun@gmail.com",120,50, 'f');
		 System.out.println("Book details\nBookName:"+b.name+"\nAuthorName:"+b.author+"\nPrice"+b.price);
		 System.out.println("\nThe Author name is " +a.name +"\nmail id is " + a.email  +"\ngender is "+ a.gender +"\n") ;
	}
	}
