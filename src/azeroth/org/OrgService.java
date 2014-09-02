package azeroth.org;

import java.util.HashMap;

public class OrgService {
	
	public void addOrg(HashMap map){
		try {
			OrgDao.addOrg(map);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
