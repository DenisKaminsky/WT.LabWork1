package by.bsuir.Kaminsky.task12;

public class Book implements Comparable<Book>,Cloneable{
	
	private String title;
    private String author;
    private int price;
    private int isbn;
    private static int edition = 3;
    
    public Book(String title,String author, int price, int isbn) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.isbn = isbn;
	}
 
    public String getTitle() { 
    	return title; 
    }
    
    public void setTitle(String tiltle) { 
    	this.title = tiltle; 
    } 
    
    public String getAuthor() { 
    	return author; 
    }   
    
    public void setAuthor(String author) { 
    	this.author = author; 
    }   
    
    public int getPrice() { 
    	return price; 
    }
    
    public void setPrice(int price) { 
    	this.price = price; 
    }
    
    public static int getEdition() { 
    	return edition; 
    }
    
    public static void setEdition(int edition) { 
    	Book.edition = edition; 
    }
    
    public int getIsbn() { 
    	return isbn; 
    }
    
    public void setIsbn(int isbn) { 
    	this.isbn = isbn; 
    }
    	
	public int compareTo(Book book){
	    return isbn - book.getIsbn();        
    }
	
	@Override
	public Book clone()	{
		try {
            return (Book)super.clone();
        }
        catch (CloneNotSupportedException ex){
            throw new InternalError();
        }
	}
	
	@Override
	public int hashCode() {
		final int primeNumber = 23;
	    int result = 1;
	    
	    result = primeNumber * result + price; 
	    result = primeNumber * result + ((title == null) ? 0 : title.hashCode());             
	    result = primeNumber * result + ((author == null) ? 0 : author.hashCode()); 
	    return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		Book book;
		
		if (obj == this) 
			return true;
		if (obj == null || obj.getClass() != this.getClass())
            return false;
		book = (Book)obj;
        return (price == book.price) && (title == book.title ||
            (title != null && title.equals(book.getTitle())))
                && (author == book.author || (author != null && author.equals(book.getAuthor())));
	}
	
	@Override
	public String toString() {
		return  "Class: " + getClass().getName()+
                ", title: " + title +
                ", author: " + author +
                ", price: " + price +
                ", edition: "+ edition;
	}
}
