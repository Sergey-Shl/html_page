import java.util.ArrayList;

public class Document {
	private Header H1;
	private Content C1;
	private Footer F1;
	
	Document(Header H1, Content C1, Footer F1) {
		this.H1 = H1;
		this.C1 = C1;
		this.F1 = F1;
	}
	
	public Header getH1() {
		return H1;
	}

	public void setH1(Header h1) {
		H1 = h1;
	}

	public Content getC1() {
		return C1;
	}

	public void setC1(Content c1) {
		C1 = c1;
	}

	public Footer getF1() {
		return F1;
	}

	public void setF1(Footer f1) {
		F1 = f1;
	}
	
	void showDocument() {
		H1.printHeader();
		C1.printContent();
		F1.printFooter();
	}
	
}
