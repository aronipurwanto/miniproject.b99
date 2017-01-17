package com.xsis.bootcamp.dao;

import java.util.Collection;

import com.xsis.bootcamp.model.FakultasModel;

public interface FakultasDao {
	public Collection<FakultasModel> getAllData() throws Exception;
	public Collection<FakultasModel> getSearchData(String keySearch) throws Exception;
	public FakultasModel getDataById(int id ) throws Exception;
	public boolean insert(FakultasModel model) throws Exception;
	public boolean update(FakultasModel model) throws Exception;
	public boolean delete(FakultasModel model) throws Exception;
}
