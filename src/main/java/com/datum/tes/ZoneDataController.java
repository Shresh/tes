package com.datum.tes;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.datum.tes.daos.DistrictDao;
import com.datum.tes.daos.ZoneDao;
import com.datum.tes.models.enum_district;
import com.datum.tes.models.enum_zone;

@RestController
@RequestMapping("api/rest")
public class ZoneDataController<E> {
	@Autowired
	private ZoneDao zoneDao;
	
	@Autowired
	private DistrictDao districtDao;
	@RequestMapping(value = "/zone",method = RequestMethod.GET)
	public ResponseEntity<List<enum_zone>> zoneGetAll(){
		List<enum_zone> zoneList = zoneDao.getAll();
		ResponseEntity<List<enum_zone>> response = new ResponseEntity<List<enum_zone>>(zoneList, HttpStatus.OK);
		return response;
	}

	@RequestMapping(value = "/district",method = RequestMethod.GET)
	public ResponseEntity<List<enum_district>> districtGetAll(){
		List<enum_district> districtList = districtDao.getAll();
		ResponseEntity<List<enum_district>> response = new ResponseEntity<List<enum_district>>(districtList, HttpStatus.OK);
		return response;
	}

}
