package com.datum.tes.daos.daosImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.datum.tes.daos.ZoneDao;
import com.datum.tes.models.enum_zone;

@Repository
public class ZoneDaoImpl implements ZoneDao{
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<enum_zone> getAll() {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(enum_zone.class);
		List<enum_zone> zoneList = criteria.list();
		session.close();
		return zoneList;
		
	}

}
