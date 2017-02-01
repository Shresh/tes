package com.datum.tes.daos.daosImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.datum.tes.daos.DistrictDao;
import com.datum.tes.models.enum_district;
@Repository
public class DistrictDaoImpl implements DistrictDao{
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<enum_district> getAll() {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(enum_district.class);
		List<enum_district> districtList = criteria.list();
		session.close();
		return districtList;
	}

}
