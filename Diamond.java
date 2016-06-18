public class Diamond extends ShapeBase implements DiamondInterface {
	private int side;
	public Diamond() {
		side = 0;
		}
	public Diamond(int newOffset, int newSide) {
		offset = newOffset;
		side = newSide;
		}
	public void drawHere() {
		drawTop();
		drawBottom();
		}
	public int getOffset() {
		return offset;
		}
	public void setOffset(int n) {
		offset = n;
		}	
	public static void skipSpaces(int n) {
		for (int count = 0; count < n; count++)
			System.out.print(' ');
		}
	public void setSide(int n) {
		side = n;
		}			
	public void drawTop() {
		int startOfLine = getOffset() + side / 2;
		skipSpaces(startOfLine);
		System.out.println('*');
		int lineCount = side / 2 - 1;
		int insideWidth = 1;
		for (int count = 0; count < lineCount; count++) {
			startOfLine--;
			skipSpaces(startOfLine);
			System.out.print('*');
			skipSpaces(insideWidth);
			System.out.println('*');
			insideWidth = insideWidth + 2;
			}	
		}
	public void drawBottom() {
		int startOfLine = getOffset();		
		int lineCount = side / 2 - 1;
		int insideWidth = 2 * lineCount - 1;
		for (int count = 0; count < lineCount; count++) {
			startOfLine++;
			skipSpaces(startOfLine);
			System.out.print('*');
			skipSpaces(insideWidth);
			System.out.println('*');
			insideWidth = insideWidth - 2;
			}
		int veryBottom = getOffset() + side / 2;
		skipSpaces(veryBottom);
		System.out.println('*');
		}	
	public static void main(String[] args) {
		Diamond demo = new Diamond(3, 20);
		demo.drawAt(4);
		}				
	}
