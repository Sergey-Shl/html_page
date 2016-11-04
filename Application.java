import java.util.ArrayList;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> links = new ArrayList<>();
		links.add("Menu");
		links.add("FAQ");
		links.add("Blog");
		Document D = new Document(new Header("Site 1", "Site1.com/img.jpg"), new Content(5), new Footer("2016", links));
		
		D.showDocument();
		
		D = null;
		
		D.getF1().printFooter();
		
		
	}

}
