package dao;

import org.springframework.stereotype.Repository;

import model.ResearchData;

@Repository
public class ResearchDataDAOImpl extends AbstractHibernateDAO<ResearchData> {
	public ResearchDataDAOImpl() {
		setClazz(ResearchData.class);
	}
}
