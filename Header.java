
public class Header {
	private String SiteName;
	private String ImgUrl;
	
	public Header(String siteName, String imgUrl) {
		super();
		SiteName = siteName;
		ImgUrl = imgUrl;
	}
	
	void printHeader() {
		System.out.println(SiteName);
		System.out.println("*" + ImgUrl + "*");
	}
}
