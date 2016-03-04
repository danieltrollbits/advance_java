import java.io.IOException;

public class Main {

	public static void main(String args[]) {
		TableManager table = new TableManager();
    try{
      table.readFile();  
      table.showMenu();
      table.select();
    }
    catch(IOException e){
      System.out.println("Error thrown : " + e.getMessage());
    }
	}

}