package dao;

import org.springframework.stereotype.Repository;

import model.Ria;

@Repository
public class ReqRiaDAOImpl extends
		AbstractHibernateDAO<Ria> {
	public ReqRiaDAOImpl() {
		setClazz(Ria.class);
	}

}
