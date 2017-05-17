package test;

import java.util.Iterator;
import java.util.List;

import model.Guitar;
import model.GuitarSpec;
import model.Inventory;
import param.Builder;
import param.Type;
import param.Wood;

public class FindGuitarTester {

  public static void main(String[] args) {
    // Set up Rick's guitar inventory
    Inventory inventory = new Inventory();
    initializeInventory(inventory);

    GuitarSpec whatErinLikes = 
      new GuitarSpec("FENDER", "Stratocastor", 
                     "ELECTRIC", 6, "ALDER", "ALDER");
    List matchingGuitars = inventory.search(whatErinLikes);
    if (!matchingGuitars.isEmpty()) {
      System.out.println("Erin, you might like these guitars:");
      for (Iterator i = matchingGuitars.iterator(); i.hasNext(); ) {
        Guitar guitar = (Guitar)i.next();
        GuitarSpec spec = guitar.getSpec();
        System.out.println("  We have a " +
          spec.getBuilder() + " " + spec.getModel() + " " +
          spec.getType() + " guitar:\n     " +
          spec.getBackWood() + " back and sides,\n     " +
          spec.getTopWood() + " top.\n  You can have it for only $" +
          guitar.getPrice() + "!\n  ----");
      }
    } else {
      System.out.println("Sorry, Erin, we have nothing for you.");
    }
  }

  private static void initializeInventory(Inventory inventory) {
    inventory.addGuitar("11277", 3999.95, 
      new GuitarSpec("COLLINGS", "CJ", "ACOUSTIC", 6,
                     "INDIAN_ROSEWOOD","SITKA"));
    inventory.addGuitar("V95693", 1499.95, 
      new GuitarSpec("FENDER", "Stratocastor","ELECTRIC", 6,
                     "ALDER", "ALDER"));
    inventory.addGuitar("V9512", 1549.95, 
      new GuitarSpec("FENDER", "Stratocastor", "ELECTRIC", 6,
                    "ALDER", "ALDER"));
    inventory.addGuitar("122784", 5495.95, 
      new GuitarSpec("MARTIN", "D-18", "ACOUSTIC", 6,
                     "MAHOGANY", "ADIRONDACK"));
    inventory.addGuitar("76531", 6295.95, 
      new GuitarSpec("MARTIN", "OM-28",  "ACOUSTIC", 6,
                     "BRAZILIAN_ROSEWOOD", "ADIRONDACK"));
    inventory.addGuitar("70108276", 2295.95, 
      new GuitarSpec("GIBSON", "Les Paul", "ELECTRIC", 6,
    		  "MAHOGANY", "MAHOGANY"));
    inventory.addGuitar("82765501", 1890.95, 
      new GuitarSpec("GIBSON", "SG '61 Reissue", "ELECTRIC", 6,
    		  "MAHOGANY", "MAHOGANY"));
    inventory.addGuitar("77023", 6275.95, 
      new GuitarSpec("MARTIN", "D-28", "ACOUSTIC", 6,
    		  "BRAZILIAN_ROSEWOOD", "ADIRONDACK"));
    inventory.addGuitar("1092", 12995.95, 
      new GuitarSpec("OLSON", "SJ", "ACOUSTIC", 12,
                     "INDIAN_ROSEWOOD", "CEDAR"));
    inventory.addGuitar("566-62", 8999.95, 
      new GuitarSpec("RYAN", "Cathedral", "ACOUSTIC", 12,
                     "COCOBOLO", "CEDAR"));
    inventory.addGuitar("6 29584", 2100.95, 
      new GuitarSpec("PRS", "Dave Navarro Signature", "ELECTRIC", 
                     6, "MAHOGANY", "MAPLE"));
  }
}
