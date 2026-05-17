package cellbiology;

public class PlantCell extends BiologicalCell {
    private boolean hasChloroplasts;

    public PlantCell (String cellType, int cellSize, boolean hasChloroplasts) {
        super (cellType, cellSize);
        this.hasChloroplasts = hasChloroplasts;
    }

    @Override
    public void printCellDetails() {
        System.out.println("Plant Cell Type: " + getCellType() );
        System.out.println("Size: " + getCellSize() + " microns");
        System.out.println("Contains Chloroplasts: " + hasChloroplasts);
    }
}
