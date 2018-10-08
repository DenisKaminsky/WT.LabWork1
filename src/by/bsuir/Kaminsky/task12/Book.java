package by.bsuir.Kaminsky.task12;

public class Book implements Cloneable{
	
	private String title;
    private String author;
    private int price;
    private static int edition;
    
    public String GetTitle()
    {
    	return title;
    }
    
    public String GetAuthor()
    {
    	return author;
    }
    
    public int GetPrice()
    {
    	return price;
    }
    
	public Book(String title,String author, int price)
	{
		this.title = title;
		this.author = author;
		this.price = price;
		edition = 3;
	}
	
	@Override
	public Book clone()
	{
		try {
            return (Book)super.clone();
        }
        catch (CloneNotSupportedException ex){
            throw new InternalError();
        }
	}
	
	@Override
	public int hashCode()
	{
		final int primeNumber = 23;
	    int result = 1;
	    result = primeNumber * result + price; 
	    result = primeNumber * result + ((title == null) ? 0 : title.hashCode());             
	    result = primeNumber * result + ((author == null) ? 0 : author.hashCode()); 
	    return result;
	}
	
	@Override
	public boolean equals(Object obj) 
	{
		if (obj == this) 
			return true;
		if (obj == null || obj.getClass() != this.getClass())
            return false;
		Book book = (Book) obj;
        return (price == book.price) && (title == book.title ||
            (title != null && title.equals(book.GetTitle())))
                && (author == book.author || (author != null && author.equals(book.GetAuthor())));
	}
	
	@Override
	public String toString()
	{
		return  "Class: " + getClass().getName()+
                ", title: " + title +
                ", author: " + author +
                ", price: " + price +
                ", edition: "+ edition;
	}
}
