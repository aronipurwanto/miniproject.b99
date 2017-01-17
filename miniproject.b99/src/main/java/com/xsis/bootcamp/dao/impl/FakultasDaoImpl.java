package com.xsis.bootcamp.dao.impl;

import java.util.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.xsis.bootcamp.dao.FakultasDao;
import com.xsis.bootcamp.model.FakultasModel;

@Repository
public class FakultasDaoImpl implements FakultasDao {
	private SessionFactory sessionFactory;
	private Log log = LogFactory.getLog(getClass());
	
	@Autowired
	public FakultasDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public Collection<FakultasModel> getAllData() throws Exception {
		Collection<FakultasModel> result = null;
		Session session = null;
		try {
			session = this.sessionFactory.openSession();
			result = session.createQuery("select f from FakultasModel f order by f.id").list();
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		} finally {
			try {
				session.flush();
				session.close();
			} catch (Exception e) {
			}
		}
		return result;
	}

	@Override
	public Collection<FakultasModel> getSearchData(String keySearch) throws Exception {
		Collection<FakultasModel> result = null;
		Session session = null;
		try {
			session = this.sessionFactory.openSession();
			Query query = session.createQuery(
					"select f from FakultasModel f where f.kode like :keySearch or f.nama like :keySearch order by f.id");
			query.setParameter("keySearch", "%" + keySearch + "%");
			result = query.list();
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		} finally {
			try {
				session.flush();
				session.close();
			} catch (Exception e) {
			}
		}
		return result;
	}

	@Override
	public FakultasModel getDataById(int id) throws Exception {
		FakultasModel result = new FakultasModel();
		Session session = null;
		try {
			session = this.sessionFactory.openSession();
			result = (FakultasModel) session.get(FakultasModel.class, id);
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		} finally {
			try {
				session.flush();
				session.close();
			} catch (Exception e) {
			}
		}
		return result;
	}

	@Override
	public boolean insert(FakultasModel model) throws Exception {
		boolean result = false;
		Session session = null;
		try {
			session = this.sessionFactory.openSession();
			session.beginTransaction();
			session.save(model);
			session.getTransaction().commit();
			result = true;
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		} finally {
			try {
				session.flush();
				session.close();
			} catch (Exception e) {
			}
		}

		return result;
	}

	@Override
	public boolean update(FakultasModel model) throws Exception {
		boolean result = false;
		Session session = null;
		try {
			session = this.sessionFactory.openSession();
			session.beginTransaction();
			session.update(model);
			session.getTransaction().commit();
			result = true;
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		} finally {
			try {
				session.flush();
				session.close();
			} catch (Exception e) {
			}
		}

		return result;
	}

	@Override
	public boolean delete(FakultasModel model) throws Exception {
		boolean result = false;
		Session session = null;
		try {
			session = this.sessionFactory.openSession();
			session.beginTransaction();
			session.delete(model);
			session.getTransaction().commit();
			result = true;
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		} finally {
			try {
				session.flush();
				session.close();
			} catch (Exception e) {
			}
		}

		return result;
	}

}
