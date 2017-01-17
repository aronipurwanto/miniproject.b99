package com.xsis.bootcamp.controller;

import java.util.Collection;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xsis.bootcamp.model.FakultasModel;
import com.xsis.bootcamp.service.FakultasService;

@Controller
public class FakultasController {
	private Log log = LogFactory.getLog(getClass());
	
	@Autowired private FakultasService fakultasService;
	
	@RequestMapping("fakultas")
	public String fakultasHome(Model model){
		Collection<FakultasModel> fakultasList = null;
		try {
			fakultasList = this.fakultasService.getAllData();
		} catch (Exception e) {
			log.error(e.getMessage(),e);
		}
		model.addAttribute("listFakultas", fakultasList);
		return "fakultas";
	}
	
	@RequestMapping("fakultasSearch")
	public String fakultasSearch(Model model, HttpServletRequest request){
		Collection<FakultasModel> fakultasList = null;
		String keySearch = request.getParameter("keySearch");
		try {
			fakultasList = this.fakultasService.getSearchData(keySearch);
		} catch (Exception e) {
			log.error(e.getMessage(),e);
		}
		model.addAttribute("listFakultas", fakultasList);
		return "fakultasSearch";
	}
	
	@RequestMapping("fakultasEdit")
	public String fakultasEdit(Model model, HttpServletRequest request){
		FakultasModel fakultas = null;
		int id = Integer.parseInt(request.getParameter("id"));
		try {
			fakultas = this.fakultasService.getDataById(id);
		} catch (Exception e) {
			log.error(e.getMessage(),e);
		}
		model.addAttribute("fakultas", fakultas);
		return "fakultasEdit";
	}
	
	@RequestMapping("fakultasDelete")
	public String fakultasDelete(Model model, HttpServletRequest request){
		FakultasModel fakultas = null;
		int id = Integer.parseInt(request.getParameter("id"));
		boolean success=false;
		
		try {
			fakultas = this.fakultasService.getDataById(id);
			this.fakultasService.delete(fakultas);			
			success=true;
		} catch (Exception e) {
			log.error(e.getMessage(),e);
		}
		model.addAttribute("success", success);
		return "fakultasDelete";
	}
	
	@RequestMapping("fakultasSave")
	public String fakultasSave(Model model,@ModelAttribute FakultasModel fk, HttpServletRequest request){
		String action = request.getParameter("action");
		boolean success = false;
		try {
			if(action.equals("update"))
				this.fakultasService.update(fk);
			if(action.equals("insert"))
				this.fakultasService.insert(fk);
			
			success=true;
		} catch (Exception e) {
			log.error(e.getMessage(),e);
		}
		model.addAttribute("success", success);
		return "fakultasSave";
	}
}
