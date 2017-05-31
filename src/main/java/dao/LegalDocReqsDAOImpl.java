package dao;

import org.springframework.stereotype.Repository;

import model.LegalDocReqs;

@Repository
public class LegalDocReqsDAOImpl extends AbstractHibernateDAO<LegalDocReqs> {
	public LegalDocReqsDAOImpl() {
		setClazz(LegalDocReqs.class);
	}

}
