package dao;

import org.springframework.stereotype.Repository;

import model.ReqProject;

@Repository
public class ReqProjectDAOImpl extends
		AbstractHibernateDAO<ReqProject> {

	public ReqProjectDAOImpl() {
		setClazz(ReqProject.class);
	}

}
