package forgetit.db;

import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.laliluna.example.Honey;

import forgetit.common.Entity;

/**
 * 
 * @author David Henn
 * @date 2.3.2011 Implementation of IDBNote
 * @see IDBNote
 * 
 */

public class DBNoteHandler implements IDBNote {

	final static Logger logger = LoggerFactory.getLogger(DBNoteHandler.class);
	
	

	/*public DBNoteHandler() {
		super();
		 try {
			    Class.forName("com.mckoi.JDBCDriver");
			  }
			  catch (Exception e) {
				  logger.debug("JDBC Driver could not be instantiated");
			  }
	}*/

	public void addNote(Entity note) {

		Transaction tx = null;
		Session session = SessionFactoryUtil.getInstance().getCurrentSession();
		try {
			tx = session.beginTransaction();
			session.save(note);
			//session.saveOrUpdate(note);
			//session.flush();
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null && tx.isActive()) {
				try {
					// Second try catch as the rollback could fail as well
					tx.rollback();
				} catch (HibernateException e1) {
					logger.debug("Error rolling back transaction");
				}
				// throw again the first exception
				throw e;
			}
		}
		/*finally {
		    session.close();
		    // Session gets already closed somewhere above ...
		}*/

	}
	

	
	public List<Entity> listNotes() {

		Transaction tx = null;
		Session session = SessionFactoryUtil.getInstance().getCurrentSession();
		try {
			tx = session.beginTransaction();
			List entities = session.createQuery("select e from Entity as e").list();
			for (Iterator iter = entities.iterator(); iter.hasNext();) {
				Entity element = (Entity) iter.next();
				logger.debug("{}", element);
				System.out.println(element.getId());
				System.out.println(element.getTitle());
				System.out.println(element.getDescription());
			}
			tx.commit();
			
			
		} catch (RuntimeException e) {
			if (tx != null && tx.isActive()) {
				try {
					// Second try catch as the rollback could fail as well
					tx.rollback();
				} catch (HibernateException e1) {
					logger.debug("Error rolling back transaction");
				}
				// throw again the first exception
				throw e;
			}

		}
		return null;
		
		
	}


	public void deleteNode(Entity note) {

		Transaction tx = null;
		Session session = SessionFactoryUtil.getInstance().getCurrentSession();
		try {
			tx = session.beginTransaction();
			session.delete(note);
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null && tx.isActive()) {
				try {
					// Second try catch as the rollback could fail as well
					tx.rollback();
				} catch (HibernateException e1) {
					logger.debug("Error rolling back transaction");
				}
				// throw again the first exception
				throw e;
			}
		
		}
		

	}

	public void changeNote(Entity note) {

		Transaction tx = null;
		Session session = SessionFactoryUtil.getInstance().getCurrentSession();
		try {
			tx = session.beginTransaction();
			session.update(note);
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null && tx.isActive()) {
				try {
					// Second try catch as the rollback could fail as well
					tx.rollback();
				} catch (HibernateException e1) {
					logger.debug("Error rolling back transaction");
				}
				// throw again the first exception
				throw e;
			}
		}

	}

}
