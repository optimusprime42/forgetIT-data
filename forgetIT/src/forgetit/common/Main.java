package forgetit.common;

import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import forgetit.db.DBEntityHandler;
import forgetit.db.DBEntityProvider;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Display display = new Display();
		// new MainWindow(display);
		// display.dispose();

		DBEntityHandler handler = new DBEntityHandler();
		DBEntityProvider provider = new DBEntityProvider();
		
		/*
		 * // Add a example tuple to the databse
		Entity entityOne = new Entity();
		entityOne.setDescription("Hello there!");
		entityOne.setTitle("SomeTestEntity");
		handler.addEntity(entityOne);
		*/
		
		// Get all entities from the database and also list them
		List<Entity> entities = provider.getEntities();
		for (Iterator<Entity> iter = entities.iterator(); iter.hasNext();) {
			Entity element = (Entity) iter.next();
			System.out.println(element);
			System.out.println(element.getId());
			System.out.println(element.getTitle());
			System.out.println(element.getDescription());
		}
		
	}
}
