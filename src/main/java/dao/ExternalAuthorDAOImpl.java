package dao;

import org.springframework.stereotype.Repository;

import model.ExternalAuthor;

@Repository
public class ExternalAuthorDAOImpl extends AbstractHibernateDAO<ExternalAuthor> {

	public ExternalAuthorDAOImpl() {
		setClazz(ExternalAuthor.class);
	}

}
