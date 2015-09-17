package ar.com.azioth.javanotes.learn.chapter4;

import ar.com.azioth.javanotes.utils.Mosaic;

public class IncrementalMosaicWalk {
	final static int ROWS = 80;        // Number of rows in the mosaic.
	final static int COLUMNS = 80;     // Number of columns in the mosaic.
	final static int SQUARE_SIZE = 5;  // Size of each square in the mosaic.
	
	static int currentRow;
	static int currentColumn;

	public static void main(String[] args) {
        Mosaic.open(ROWS, COLUMNS, SQUARE_SIZE, SQUARE_SIZE);
        currentRow = ROWS / 2;
        currentColumn = COLUMNS / 2;
        Mosaic.setUse3DEffect(false);
        while (Mosaic.isOpen()) {
            turnToGreen(currentRow, currentColumn);
            randomMove();
            Mosaic.delay(1);
	}
}

	static void randomMove() {
	      int directionNum; // Randomly set to 0, 1, 2, or 3 to choose direction.
	      directionNum = (int)(4*Math.random());
	      switch (directionNum) {
	      case 0:  // move up 
	         currentRow--;
	         if (currentRow < 0)
	            currentRow = ROWS - 1;
	         break;
	      case 1:  // move right
	         currentColumn++;
	         if (currentColumn >= COLUMNS)
	            currentColumn = 0;
	         break; 
	      case 2:  // move down
	         currentRow ++;
	         if (currentRow >= ROWS)
	            currentRow = 0;
	         break;
	      case 3:  // move left  
	         currentColumn--;
	         if (currentColumn < 0)
	            currentColumn = COLUMNS - 1;
	         break; 
	      }
    }  // end randomMove

	private static void turnToGreen(int row, int col) {
		int greenLevel = Mosaic.getGreen(row, col);
		greenLevel += 25;
		if ( greenLevel > 255) {
			greenLevel = 255;
		}
		
		Mosaic.setColor(row, col, 0, greenLevel, 0);
		
		
		
	}

		
}