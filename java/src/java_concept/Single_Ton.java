package java_concept;

class Database {
	   private static Database dbObject;

	   private Database() {      
	   }

	   public static Database getInstance() {

	      // create object if it's not already created
	      if(dbObject == null) {
	         dbObject = new Database();
	      }

	       // returns the singleton object
	       return dbObject;
	   }

	   public void getConnection() {
	       System.out.println("You are now connected to the database.");
	   }
	}
public class Single_Ton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Database db1;

	      // refers to the only object of Database
	      db1= Database.getInstance();
	      
	      db1.getConnection();
		
	}

}
