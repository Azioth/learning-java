package ar.com.azioth.javanotes.learn.chapter4;

import ar.com.azioth.javanotes.utils.Mosaic;

import java.awt.*;

/**
 * Created by ssandri on 18/07/2016.
 */
public class RandomConvert {
    final static int ROWS = 40;        // Number of rows in the mosaic.
    final static int COLUMNS = 40;     // Number of columns in the mosaic.
    final static int SQUARE_SIZE = 10;  // Size of each square in the mosaic.

    public static void main(String[] args) {
        Mosaic.open(ROWS, COLUMNS, SQUARE_SIZE, SQUARE_SIZE);
        fillWithRandomColors();
        Mosaic.setUse3DEffect(false);
        while (Mosaic.isOpen()) {
            int randomRow = (int) (ROWS * Math.random());
            int randomColumn = (int) (COLUMNS* Math.random());
            convertRandomNeighbor(randomRow, randomColumn);
            Mosaic.delay(1);
        }
    }

    static void fillWithRandomColors() {
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLUMNS; col++) {
                int r = (int)(256*Math.random());
                int g = (int)(256*Math.random());
                int b = (int)(256*Math.random());
                Mosaic.setColor(row,col,r,g,b);
            }
        }
    }

    private static void convertRandomNeighbor(int currentRow, int currentColumn) {
        Color currentColor = Mosaic.getColor(currentRow, currentColumn);
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
        Mosaic.setColor(currentRow, currentColumn, currentColor);
    }
}
