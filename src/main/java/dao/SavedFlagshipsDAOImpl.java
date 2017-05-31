package dao;

import org.springframework.stereotype.Repository;

import model.SavedFlagships;

@Repository
public class SavedFlagshipsDAOImpl extends AbstractHibernateDAO<SavedFlagships> {
	
	public SavedFlagshipsDAOImpl() {
		setClazz(SavedFlagships.class);
	}

}
