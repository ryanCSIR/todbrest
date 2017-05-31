package dao;

import org.springframework.stereotype.Repository;

import model.Departments;

@Repository
public class DepartmentsDAOImpl extends AbstractHibernateDAO<Departments> {
	
	public DepartmentsDAOImpl() {
		setClazz(Departments.class);
	}

}
