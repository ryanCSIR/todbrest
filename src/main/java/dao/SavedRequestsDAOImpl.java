package dao;

import org.springframework.stereotype.Repository;

import model.SavedRequests;

@Repository
public class SavedRequestsDAOImpl extends AbstractHibernateDAO<SavedRequests> {
	
	public SavedRequestsDAOImpl() {
		setClazz(SavedRequests.class);
	}

}
