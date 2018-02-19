public class SpreadsheetLocation implements Location {
    private int row;
    private int col;
   
    @Override
    public int getRow() {
        return row;
    }

    @Override
    public int getCol()
    {
        return col;
    }
    
   public SpreadsheetLocation(String cellName) {
      String stringRow = cellName.substring(1);
      char charCol = Character.toUpperCase(cellName.charAt(0));
      row = Integer.parseInt(stringRow) - 1;
      
      if ((int)charCol > 64 && (int)charCol < 91) {
         col = (int)charCol - 65;
      } else {
         throw new IllegalArgumentException();
      }
   }
}
