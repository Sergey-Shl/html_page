
public class Content {
	private int NumColumn;

	public Content(int numColumn) {
		NumColumn = numColumn;
	}
	
	void printContent() {
		for (int i = 0; i < NumColumn; i++)
			System.out.println("Column " + i);
	}
	
}
