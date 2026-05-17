package cellbiology;

public abstract class BiologicalCell {
    private String cellType;
    private int cellSize;

    public BiologicalCell (String cellType, int cellSize) {
        this.cellType = cellType;
        this.cellSize = cellSize;
    }

    public String getCellType() {
        return cellType;
    }

    public int getCellSize() {
        return cellSize;
    }

    public void setCellType (String cellType) {
        this.cellType = cellType;
    }

    public void setCellSize (int cellSize) {
        this.cellSize = cellSize;
    }

    public abstract void printCellDetails();
}
