
interface Libraryitem
{
 void CheckAvailability();
 void DisplayInfo();
}
class Books implements Libraryitem
{
 private String bookname;
 private String Author;
 private Boolean AvailableOrnot;

 public Books(String bookname,String Author,Boolean AvailableOrnot)
 {
  this.bookname=bookname;
  this.Author=Author;
  this.AvailableOrnot=AvailableOrnot;
 }
  @Override
   public void DisplayInfo()
   {
    System.out.println("Book name is : " +bookname);
    System.out.println("Author is : " +Author);
    System.out.println("Availability : " +(AvailableOrnot ? "AVAILABLE" : "NOT AVAILABLE"));
   }
  @Override
   public void CheckAvailability()
   {
    if(AvailableOrnot){
    System.out.println("The book is Available");}
    else{
    System.out.println("The book is Not available");
   }
 }
}
class Magazines implements Libraryitem
{
 private String title;
 private int issuenumber;
 private Boolean AvailableOrnot;

 public Magazines(String title,int issuenumber,Boolean AvailableOrnot)
 {
  this.title=title;
  this.issuenumber=issuenumber;
  this.AvailableOrnot=AvailableOrnot;
 }
  @Override
   public void DisplayInfo()
   {
    System.out.println("Title is : " +title);
    System.out.println("issuenumber is : " +issuenumber);
    System.out.println("Availability : " +(AvailableOrnot ? "AVAILABLE" : "NOT AVAILABLE"));
   }
  @Override
   public void CheckAvailability()
   {
    if(AvailableOrnot){
    System.out.println("The Magazine is Available");}
    else{
    System.out.println("The Magazine is Not available");
   }
  }
}

class Library1
{
    public static void main(String args[])
    {
        Libraryitem books = new Books("RAMAYAN", "VALMIKI", true);
        books.DisplayInfo();      
        books.CheckAvailability(); 

        Libraryitem Magazines = new Magazines("SUNSET", 634537, false);
        Magazines.DisplayInfo();       
        Magazines.CheckAvailability(); 
    }
}