package azeroth.org;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

import azeroth.util.Util;

public class AgencyDao {

	public static void  addOrg(HashMap map) throws Exception  {
		Connection conn = null;
		PreparedStatement pstm = null;
		String sql = " insert into t_agency (agency_id,agency_name) values(?,?) ";
		try {
			conn = Util.getConnection();
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, (String) map.get("orgId"));
			pstm.setString(2, (String)map.get("orgName"));
			pstm.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}finally{
			try {
				conn.close();
				pstm.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
	}
}
