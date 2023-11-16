package test.struts.action;

import test.struts.interceptor.DAOInterface;
import test.struts.model.TestDAO;

public class HelloAction implements DAOInterface {

	private TestDAO dao = null;

	@Override
	public void setDao(TestDAO dao) {
		this.dao = dao;
	}

	public String execute() {
		System.out.println(dao);
		System.out.println(dao.getConnection());
		System.out.println(dao.loginCheck());
		return "success";
	}
}
