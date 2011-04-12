package forgetit.logic.note;

import java.util.List;

import forgetit.common.Date;
import forgetit.common.Entity;
import forgetit.common.Tag;
import forgetit.db.DBEntityProvider;
import forgetit.db.IDBEntityProvider;
import forgetit.logic.interfaces.ILogicInternalNoteProvider;

/**
 * 
 * @author David Henn
 * @date 2.3.2011
 * Implementation of ILogicInternalNoteProvider
 * @see ILogicInternalNoteProvider
 */
public class LogicNoteProviderInternal implements ILogicInternalNoteProvider {
	
	private IDBEntityProvider dbNoteProvider;
	
	public LogicNoteProviderInternal(){
		dbNoteProvider = new DBEntityProvider();
	}

	@Override
	public List<Entity> getNotes() {
		return dbNoteProvider.getEntities();
	}

	@Override
	public List<Entity> getNotes(Date startDate, Date endDate) {
		//TODO check input
		return dbNoteProvider.getEntities(startDate, endDate);
	}

	@Override
	public List<Entity> getNotes(Date startDate, Date endDate, List<Tag> tags) {
		// TODO check input
		return dbNoteProvider.getEntities(startDate, endDate, tags);
	}

	@Override
	public List<Entity> getNotes(List<Tag> tags) {
		// TODO check input
		return dbNoteProvider.getEntities(tags);
	}

}
