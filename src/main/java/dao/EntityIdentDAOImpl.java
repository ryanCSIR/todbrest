package dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import model.EntityIdent;

@Repository
public class EntityIdentDAOImpl extends AbstractHibernateDAO<EntityIdent> {
	public EntityIdentDAOImpl() {
		setClazz(EntityIdent.class);
	}

	public List<EntityIdent> getEmployees() {
		return em.createNamedQuery("getEmployees").getResultList();
	}
}
