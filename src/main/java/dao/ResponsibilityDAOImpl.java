package dao;

import org.springframework.stereotype.Repository;

import model.Responsibility;

@Repository
public class ResponsibilityDAOImpl extends AbstractHibernateDAO<Responsibility> {

	public ResponsibilityDAOImpl() {
		setClazz(Responsibility.class);
	}

}
