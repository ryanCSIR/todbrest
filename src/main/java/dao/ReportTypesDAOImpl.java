package dao;

import org.springframework.stereotype.Repository;

import model.ReportTypes;

@Repository
public class ReportTypesDAOImpl extends AbstractHibernateDAO<ReportTypes> {

	public ReportTypesDAOImpl() {
		setClazz(ReportTypes.class);
	}
}
