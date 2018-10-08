package by.bsuir.Kaminsky.task13;

import by.bsuir.Kaminsky.task12.Book;

public class ProgrammerBook extends Book{	
	private String language;  
	private int level;
	
	public int GetLevel()
	{
		return level;
	}
	
	public String GetLanguage()
	{
		return language;
	}
	
	public ProgrammerBook(String title,String author, int price,String language,int level) 
	{
		super(title, author, price);
		this.language = language;
		this.level = level;		
	}
	
	@Override
	public int hashCode()
	{
		final int primeNumber = 23;
	    int result = super.hashCode();
	    result = primeNumber * result + level; 
	    result = primeNumber * result + ((language == null) ? 0 : language.hashCode());   
	    return result;
	}
	
	@Override
	public boolean equals(Object obj) 
	{
		if (obj == this) 
			return true;
		if (obj == null || obj.getClass() != this.getClass())
            return false;
		ProgrammerBook book = (ProgrammerBook) obj;
        return (super.equals(obj)) && (level == book.level)
        		&& (language == book.language || (language != null && language.equals(book.GetLanguage())));
	}
	
	@Override
    public String toString() {
        return super.toString() + ", language: " + language + ", level: " + level;
    }	
}
