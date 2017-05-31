package dao;

import org.springframework.stereotype.Repository;

import model.SavedProjects;

@Repository
public class SavedProjectsDAOImpl extends AbstractHibernateDAO<SavedProjects> {
	
	public SavedProjectsDAOImpl() {
		setClazz(SavedProjects.class);
	}

}
