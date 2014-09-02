package azeroth.org;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddOrgServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String orgId = (String)request.getParameter("orgId");
		String orgName = (String) request.getParameter("orgName");
		HashMap map = new HashMap();
		map.put("orgId", orgId);
		map.put("orgName",orgName);
		OrgService service = new OrgService();
		service.addOrg(map);
	}
}
