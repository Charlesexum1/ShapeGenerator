public class RightArrow extends ShapeBase implements ShapeInterface {
	public int length;
	public int width;
	
	public RightArrow() {}
	public RightArrow(int newLength, int newWidth, int o) {
		if (newWidth % 2 > 0 && newWidth >= 3) {
			width = newWidth;
			}
		length = newLength;
		offset = o;	
		}
	
	public void setOffset(int off) {
		offset = off;
		}
	public int getOffset() {
		return offset;
		}
	
	public void setLength(int l) {
		length = l;
		}
	public int getLength() {
		return length;
		}
	public void setWidth(int w) {
		if (w % 2 > 1 && w >= 3) {
			width = w;
			}		
		}
	public int getWidth() {
		return width;
		}
	
	public static void skipSpaces(int n) {
		for (int count = 0; count < n; count++)
			System.out.print(' ');
		}		
	
	public void drawHead() {
		int startLine = getOffset() + length;
		skipSpaces(startLine);
		System.out.println('*');
		System.out.println();
		int spacing = 2;		
		for (int x = 0; x < width - 3; x++ ) {			
			skipSpaces(startLine);
			System.out.print('*');
			skipSpaces(spacing);
			System.out.println('*');
			System.out.println();
			spacing += 2;
			}
		
		drawTail();	
		System.out.println();	
		spacing = ((width - 2) * 2) - 2;	
		for (int y = 0; y < width - 3; y++) {
			skipSpaces(startLine);
			System.out.print('*');
			skipSpaces(spacing);
			System.out.println('*');
			System.out.println();
			spacing -= 2;			
			}
		skipSpaces(startLine);
		System.out.println('*');	
		}
	public void drawTail() {
		
		int startLine = getOffset();
		skipSpaces(startLine);
		for (int x = 0; x < length; x++) {
			System.out.print('*');
			}
		System.out.print('*');
		for (int y = 0; y < (width - 2) * 2; y++) {
			System.out.print(' ');
			}
		System.out.print('*');		
		System.out.println();	
		}	
		
	public void drawHere() {
		drawHead();
		}
	public static void main(String[] args) {
		RightArrow demo = new RightArrow(30, 17, 9);
		demo.drawAt(3);
		}	
	}
