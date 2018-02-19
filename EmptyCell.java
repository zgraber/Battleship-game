
public class EmptyCell implements Cell {
   private String value;
   
   public EmptyCell() {
      value = "";
   }
   
   public String abbreviatedCellText() {
      return value;
   }
   
   public String fullCellText() {
      return value;
   }
}