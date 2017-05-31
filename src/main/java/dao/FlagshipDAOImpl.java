package dao;

import org.springframework.stereotype.Repository;

import model.Flagship;

@Repository
public class FlagshipDAOImpl extends AbstractHibernateDAO<Flagship> {

	public FlagshipDAOImpl() {
		setClazz(Flagship.class);
	}

}
