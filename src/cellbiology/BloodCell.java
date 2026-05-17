package cellbiology;

public class BloodCell extends BiologicalCell {

    protected String oxygenCapacity;

    public BloodCell (String cellType, int cellSize, String oxygenCapacity) {
        super (cellType, cellSize);
        this.oxygenCapacity = oxygenCapacity;
    }

    @Override
    public void printCellDetails() {
        System.out.println("Blood Cell Type: " + getCellType() );
        System.out.println("Size: " + getCellSize() + " microns");
        System.out.println("Oxygen Carrying Level: " + oxygenCapacity);
    }
}
