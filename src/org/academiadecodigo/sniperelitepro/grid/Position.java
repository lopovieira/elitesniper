package org.academiadecodigo.sniperelitepro.grid;

/**
 * Created by cadet on 28/09/15.
 */
public class Position {

    private int col;
    private int row;

    public Position() {

        this.col = (int) (Math.random() * Grid.getWidth());
        this.row = (int) (Math.random() * Grid.getHeight());

    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    public void setCol(int col) {
        if (col > Grid.getWidth()) {
            this.col = Grid.getWidth();
        } else if (col < 0){
            this.col = 0;
        } else {
            this.col = col;
        }
    }

    public void setRow(int row) {
        if (row > Grid.getHeight()) {
            this.row = Grid.getHeight();
        } else if (row < 0) {
            this.row = 0;
        } else {
            this.row = row;
        }
    }

    public boolean equals(Position pos) {
        if (this.getCol() == pos.getCol() && this.getRow() == pos.getRow()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Position{" +
                "col=" + col +
                ", row=" + row +
                '}';
    }
}

