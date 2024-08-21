//Design a Java program to manage a library system using inheritance.
class Book
{
	String Title, Author, ISBN;
	Book(String Title, String Author, String ISBN)
	{
		this.Title=Title;
		this.Author=Author;
		this.ISBN=ISBN;
	}
	public void displayInfo()
	{	
		System.out.println("Title of the Book: "+Title+"\nAuthor of the Book: "+Author+"\nISBN: "+ISBN);
	}
}
class Ebook extends Book
{
	double FileSize;
	String downloadLink;
	Ebook(String Title, String Author, String ISBN, double FileSize, String downloadLink)
	{
		super(Title, Author, ISBN);
		this.FileSize=FileSize;
		this.downloadLink=downloadLink;
	}
	@Override
	public void displayInfo()
	{
		super.displayInfo();
		System.out.println("Size of the file: "+FileSize+"\nDownload Link: "+downloadLink);
	}
}
class PrintedBook extends Book
{
	int numPages;
	String coverType;
	PrintedBook(String Title, String Author, String ISBN, int numPages, String coverType)
	{
		super(Title, Author, ISBN);
		this.numPages=numPages;
		this.coverType=coverType;	
	}
	@Override
	public void displayInfo()
	{
		super.displayInfo();
		System.out.println("Number of Pages: "+numPages+"\nType of Cover: "+coverType);
	}
}
class main2
{
	public static void main(String args[])
	{
		Book[] books=new Book[2];
		books[0]=new Ebook("Digital Fortress", "Dan Brown", "1234567890", 2.5, "http://downloadlink.com/ebook");
		books[1]=new PrintedBook(" Inferno", "Dan Brown", "0987654321", 480, "Hardcover");
		for (Book book : books) 
		{
            		book.displayInfo();
            		System.out.println();  
		}
	}
}		