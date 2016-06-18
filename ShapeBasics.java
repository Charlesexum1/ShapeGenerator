public class ShapeBasics implements ShapeInterface {
	public int offset;
	public ShapeBasics() {
		offset = 0;
		}
	public ShapeBasics(int theOffset) {
		offset = theOffset;
		}
	public void setOffset(int newOffset) {
		offset = newOffset;
		}
	public int getOffset() {
		return offset;
		}
	public void drawAt(int lineNumber) {
		for (int x = 0; x < lineNumber; x++)
			System.out.println();
		drawHere();
		}
	public void drawHere() {}					
	}
