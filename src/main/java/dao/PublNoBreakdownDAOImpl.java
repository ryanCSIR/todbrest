package dao;

import org.springframework.stereotype.Repository;

import model.PublNoBreakdown;

@Repository
public class PublNoBreakdownDAOImpl extends
		AbstractHibernateDAO<PublNoBreakdown> {

	public PublNoBreakdownDAOImpl() {
		setClazz(PublNoBreakdown.class);
	}

}

