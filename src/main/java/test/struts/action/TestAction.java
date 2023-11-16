package test.struts.action;

public class TestAction {

	public String execute() {// 메서드명은 무조건 execute로 작성해야 한다.
		System.out.println("===TestAction===");
		return "success";
	}

	public String action() { // struts 지정 메서드 아님
		System.out.println("===action===");
		return "ok"; // struts 지정 단어 아님
	}

}
