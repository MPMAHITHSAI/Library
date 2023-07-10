package Lbrarydata;


class Libbook {
	public static int issue(int n) {
		int giv=0;
		if(n==100) {
			 giv = 55;
		}
		return giv;
	}
}
	
class book extends Libbook{
	String author;
	
}

class Magazine extends book{
	int bookid;
	String bookname;
	int year;
}
public class Librarydata12 extends Magazine{
	

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Librarydata12 issue=new Librarydata12();
		issue.bookid=100;
		issue.bookname="my life my rules";
		issue.year=2022;
		issue.author="MPMS";
		
		//int approvel_date=approvel(issue.bookid);
		
		System.out.println(issue.bookid);
		System.out.println(issue.bookname);
		System.out.println(issue.year);
		System.out.println(issue.author);
		//System.out.println(approvel_date);
		
		
		
	}

	
}