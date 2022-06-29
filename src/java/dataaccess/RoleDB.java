
package dataaccess;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import models.Role;

/**
 *
 * @author Hayley
 */
public class RoleDB {
        public List<Role> getAll(int roleID) throws Exception {
        List<Role> roles = new ArrayList<>();
        ConnectionPool cp = ConnectionPool.getInstance();
        Connection con = cp.getConnection(); //returns single connection object 
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        //prepared statment
        String sql = "SELECT * FROM role WHERE role_id=?";
        
        try {
            ps = con.prepareStatement(sql);
            //ps.setInt(1, roleID); // Might need this but not sure 
            rs = ps.executeQuery();
            while (rs.next()) {
                int role_id = rs.getInt(1);
                String role_name = rs.getString(2);
                
                Role role = new Role(role_id,role_name);
                roles.add(role);
            }
        } finally {
            DBUtil.closeResultSet(rs);
            DBUtil.closePreparedStatement(ps);
            cp.freeConnection(con);
        }

        return roles;
    }
}
