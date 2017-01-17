package com.xsis.bootcamp.service.impl;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xsis.bootcamp.dao.FakultasDao;
import com.xsis.bootcamp.model.FakultasModel;
import com.xsis.bootcamp.service.FakultasService;

@Service
@Transactional
public class FakultasServiceImpl implements FakultasService {
	@Autowired private FakultasDao dao;
	
	@Override
	public Collection<FakultasModel> getAllData() throws Exception {
		return this.dao.getAllData();
	}

	@Override
	public Collection<FakultasModel> getSearchData(String keySearch) throws Exception {
		return this.dao.getSearchData(keySearch);
	}

	@Override
	public FakultasModel getDataById(int id) throws Exception {
		return this.dao.getDataById(id);
	}

	@Override
	public boolean insert(FakultasModel model) throws Exception {
		return this.dao.insert(model);
	}

	@Override
	public boolean update(FakultasModel model) throws Exception {
		return this.dao.update(model);
	}

	@Override
	public boolean delete(FakultasModel model) throws Exception {
		return this.dao.delete(model);
	}

}
