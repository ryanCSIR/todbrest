package dao;

import org.springframework.stereotype.Repository;

import model.OssLicence;

@Repository
public class OssLicenseDAOImpl extends AbstractHibernateDAO<OssLicence> {
	public OssLicenseDAOImpl() {
		setClazz(OssLicence.class);
	}

}
