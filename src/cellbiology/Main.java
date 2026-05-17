package cellbiology;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        ArrayList<BiologicalCell> cellLabList = new ArrayList<>();

        System.out.println("==========Welcome to Cell Biology Laboratory==========");

        try {
            System.out.print("Enter Blood Cell Subtype (example: T-Cell, B-Cell, Red Blood Cell, White Blood Cell, Platelet, Lymphocyte): ");
            String bName = userInput.nextLine();

            System.out.print("Enter cell size in microns (must be a whole number): ");
            int bSize = userInput.nextInt();
            userInput.nextLine();

            System.out.print("Enter oxygen binding speed (High/Medium/Low): ");
            String bOxygen = userInput.nextLine();

            BloodCell bloodCell = new BloodCell(bName, bSize, bOxygen);
            BiologicalCell cellSample1 = bloodCell;
            cellLabList.add(cellSample1);

            System.out.println("------------------------------------------------------------");

            System.out.print("Enter Plant Cell Subtype (example: Onion Epidermal, Palisade cell, Guard Cell, Xylem Cell, Phloem Cell, Mesophyll Cell): ");
            String pName = userInput.nextLine();

            System.out.print("Enter cell size in microns (must be a whole number): ");
            int pSize = userInput.nextInt();

            PlantCell plantCell = new PlantCell(pName, pSize, true);
            BiologicalCell cellSample2 = plantCell;
            cellLabList.add(cellSample2);

            System.out.println("---Displaying Registered Lab Samples---");
            for (BiologicalCell currentCell : cellLabList) {
                currentCell.printCellDetails();
            }

        } catch (java.util.InputMismatchException e) {
            System.out.println("[Data Entry Error]: You typed words instead of a numeric size");
            System.out.println("Program stopped. Please restart and input numbers for the size");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            System.out.println("Cleaning up assets... Scanner Closed");
            userInput.close();
        }
    }
}