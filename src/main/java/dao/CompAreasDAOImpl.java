package dao;

import org.springframework.stereotype.Repository;

import model.CompAreas;

@Repository
public class CompAreasDAOImpl extends AbstractHibernateDAO<CompAreas> {
	public CompAreasDAOImpl() {
		setClazz(CompAreas.class);
	}

}
