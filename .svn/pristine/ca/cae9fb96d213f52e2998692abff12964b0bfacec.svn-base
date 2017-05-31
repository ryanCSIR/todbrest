package dao;

import java.util.List;

import model.ProjectId;

import org.springframework.stereotype.Repository;

@Repository
public class ProjectIdDAOImpl extends AbstractHibernateDAO<ProjectId> {

	public ProjectIdDAOImpl() {
		setClazz(ProjectId.class);
	}

	public List<ProjectId> getProjectNo() {
		List<ProjectId> oldList = em.createNamedQuery("getProjectNo")
				.getResultList();

		return oldList;
	}
}
