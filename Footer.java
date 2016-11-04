import java.util.ArrayList;

public class Footer {
	private String Copyright;
	private ArrayList<String> links = new ArrayList<String>();
	
	public Footer(String copyright, ArrayList<String> links) {
		super();
		Copyright = copyright;
		this.links = links;
	}
	
	public String getCopyright() {
		return Copyright;
	}

	public void setCopyright(String copyright) {
		Copyright = copyright;
	}

	public ArrayList<String> getLinks() {
		return links;
	}

	public void setLinks(ArrayList<String> links) {
		this.links = links;
	}
	
	public void printFooter() {
		System.out.println(Copyright);
		for (int i = 0; i < links.size(); i++)
			System.out.println(links.get(i));
	}
}
