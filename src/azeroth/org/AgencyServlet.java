package azeroth.org;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import azeroth.util.PageBean;

public class AgencyServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		String orgId = (String)request.getParameter("orgId");
		String orgName = (String) request.getParameter("orgName");
		String msg = null;
		HashMap map = new HashMap();
		map.put("orgId", orgId);
		map.put("orgName",orgName);
		AgencyBo bo = new AgencyBo();
		try {
			bo.addOrg(map);
			msg = "添加成功！";
		} catch (Exception e) {
			e.printStackTrace();
			msg = "系统异常！添加失败！";
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher(PageBean.AGENCY_HEAD);
		request.setAttribute("msg", msg);
		dispatcher.forward(request, response);
	}
}
