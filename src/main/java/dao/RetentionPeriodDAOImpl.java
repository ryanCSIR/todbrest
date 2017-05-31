package dao;

import org.springframework.stereotype.Repository;

import model.RetentionPeriod;

@Repository
public class RetentionPeriodDAOImpl extends
		AbstractHibernateDAO<RetentionPeriod> {

	public RetentionPeriodDAOImpl() {
		setClazz(RetentionPeriod.class);
	}

}
