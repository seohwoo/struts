package test.struts.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

import test.struts.model.TestDAO;

public class DAOInterceptor implements Interceptor {

	private TestDAO dao = null;

	@Override
	public void init() { // 최초 1회 실행
		dao = new TestDAO();
	}

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		// action으로 도달하기 전에 실행

		// 다른 클래스도 들어갈 수 있기 때문에 상위객체로 선언하는 것이 바람직하다.
		Object obj = arg0.getAction();
		// 만약 헤당 클래스 or 인터페이스가 있으면 객체를 받아온다.
		if (obj instanceof DAOInterface) {// DAOInterface를 구현하고 있는가
			DAOInterface di = (DAOInterface) obj;
			di.setDao(dao);
		}
		arg0.invoke(); // action으로 보내줌(action -> execute)
		// action으로 도달한 후에 실행
		return null;
	}

	@Override
	public void destroy() {
	}

}