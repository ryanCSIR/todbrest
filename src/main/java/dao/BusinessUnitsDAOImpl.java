package dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import model.BusinessUnits;

@Repository
public class BusinessUnitsDAOImpl extends AbstractHibernateDAO<BusinessUnits> {
	public BusinessUnitsDAOImpl() {
		setClazz(BusinessUnits.class);
	}
}
