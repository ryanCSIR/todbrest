package dao;

import org.springframework.stereotype.Repository;

import model.RegisteredProxy;

@Repository
public class RegisteredProxyDAOImpl extends
		AbstractHibernateDAO<RegisteredProxy> {
	public RegisteredProxyDAOImpl() {
		setClazz(RegisteredProxy.class);
	}

}
