package dao;

import org.springframework.stereotype.Repository;

import model.OssType;

@Repository
public class OssTypeDAOImpl extends AbstractHibernateDAO<OssType>  {

	public OssTypeDAOImpl() {
		setClazz(OssType.class);
	}

}
