package test.struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import test.struts.model.TestDTO;

//prepare, modelDriven 다시구현
public class FormAction implements Preparable, ModelDriven<TestDTO> {

	private TestDTO dto = null;
	private HttpServletRequest request = null;
	private HttpSession session = null;

	public String execute() {
		return "success";
	}

	public String pro() {
		System.out.println(dto.getName());
		System.out.println(dto.getNumber());

		request = ServletActionContext.getRequest();
		String name = request.getParameter("name");

		// session = (HttpSession) ServletActionContext.getContext().getSession();
		session = request.getSession();
		String id = (String) session.getAttribute("id");

		return "success";
	}

	@Override
	public TestDTO getModel() {
		System.out.println("getModel");
		return dto;
	}

	@Override
	public void prepare() throws Exception {
		System.out.println("prepare");
		dto = new TestDTO(); // 저장소 생성
	}

	public HttpServletRequest getRequest() {
		return request;
	}

	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}

	public HttpSession getSession() {
		return session;
	}

	public void setSession(HttpSession session) {
		this.session = session;
	}

}
