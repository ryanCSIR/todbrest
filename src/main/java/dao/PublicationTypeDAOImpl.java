package dao;

import org.springframework.stereotype.Repository;

import model.PublicationType;

@Repository
public class PublicationTypeDAOImpl extends
		AbstractHibernateDAO<PublicationType> {
	public PublicationTypeDAOImpl() {
		setClazz(PublicationType.class);
	}

}
