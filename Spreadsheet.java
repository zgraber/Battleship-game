public class Spreadsheet implements Grid {

   EmptyCell[][] cellArray; 
   
   //Constructor
   public Spreadsheet() {
      cellArray = new EmptyCell[20][12];
      
      for (int row = 0; row < cellArray.length; row++) {
         for (int col = 0; col < cellArray[row].length; col++) {
            cellArray[row][col] = new EmptyCell();
         }
      }  
   }
   
   @Override
   public String processCommand(String command)
   {
   	// TODO Auto-generated method stub
      return "";
   }

   @Override
   public int getRows()
   {
   	// TODO Auto-generated method stub
      return cellArray.length;
   }

   @Override
   public int getCols()
   {
   	// TODO Auto-generated method stub
      return cellArray[0].length;
   }
   
   
   //Returns cell at specified location
   @Override
   public Cell getCell(Location loc)
   {
   	// TODO Auto-generated method stub
      return null;
   }
   
   //Prints grid in proper format
   @Override
   public String getGridText()
   {
   	// TODO Auto-generated method stub
      return null;
   }

}
