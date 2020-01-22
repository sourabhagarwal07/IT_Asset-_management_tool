/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jusco.servises;

import com.jusco.constant.QueryConstant;
import com.jusco.model.NewAsset;
import com.jusco.model.AssetREg;
import com.jusco.model.AssetTrf;
import com.jusco.model.OldAsset;
import com.jusco.model.Users;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 *
 * @author ACHIN
 */
public class LoginServisesImpl extends JdbcDaoSupport implements LoginServises {

    @Override
    public List<Users> getLogin(Users users) {
        int flag = 0;
        int a = 0;
        List<Users> lists = getJdbcTemplate().query(
                QueryConstant.loginUser, new Object[]{users.getUsername(), users.getPasswrd()}, new ResultSetExtractor<List<Users>>() {

            public List<Users> extractData(ResultSet rs) /*error add override*/
                    throws SQLException {
                List<Users> list = new ArrayList<Users>();
                while (rs.next()) {
                    Users login = new Users();
                    login.setUsername(rs.getString("USERNAME"));
                    // login.setPasswrd(rs.getString(""));
                    list.add(login);
                }
                return list;
            }
        });
        if (lists.size() > 0 && lists != null) {
            flag = 1;
        }
        return lists;
    }

    @Override
    public int saveAssetTrf(AssetTrf assettrf) {
        int flag = 0;
        flag = getJdbcTemplate().update(QueryConstant.saveAssetTrf, new Object[]{assettrf.getAid(), assettrf.getS_emp_id(), assettrf.getD_emp_id()});
        return flag;
    }

    @Override
    public int saveAssetREg(AssetREg assetreg) {
        int flag = 0;
        try {
            Date doi = new Date(new SimpleDateFormat("dd-MM-yyyy").parse(assetreg.getDoi()).getTime());
            flag = getJdbcTemplate().update(QueryConstant.saveAssetREg, new Object[]{assetreg.getEmp_id(), assetreg.getEmp_name(), assetreg.getPh_no(), assetreg.getEmail_id(), assetreg.getDept(), assetreg.getDiv(), assetreg.getBld(), assetreg.getFlr(), assetreg.getA_name(), assetreg.getAid_c(), assetreg.getAid_j(), doi});
            getJdbcTemplate();
        } catch (Exception e) {
            e.getMessage();
            e.printStackTrace();
        }

        return flag;
    }

    @Override
    public int saveNewAsset(NewAsset newasset) {
        int flag = 0;
        flag = getJdbcTemplate().update(QueryConstant.saveNewAsset, new Object[]{newasset.getEmp_id(), newasset.getEmp_name(), newasset.getPh_no(), newasset.getEmail_id(), newasset.getDept(), newasset.getDiv(), newasset.getBld(), newasset.getFlr(), newasset.getA_name(), newasset.getRem(), newasset.getSremp_id(), newasset.getSremail_id()});
        return flag;
    }

    @Override
    public int saveOldAsset(OldAsset oldasset) {
        int flag = 0;
        try {
            Date doi = new Date(new SimpleDateFormat("dd-MM-yyyy").parse(oldasset.getDoi()).getTime());
            flag = getJdbcTemplate().update(QueryConstant.saveOldAsset, new Object[]{oldasset.getEmp_id(), oldasset.getEmp_name(), oldasset.getPh_no(), oldasset.getEmail_id(), oldasset.getDept(), oldasset.getDiv(), oldasset.getBld(), oldasset.getFlr(), oldasset.getA_name(), oldasset.getAid_c(), oldasset.getAid_j(), doi, oldasset.getR_type(), oldasset.getRem()});
            getJdbcTemplate();
        } catch (Exception e) {
            e.getMessage();
            e.printStackTrace();
        }

        return flag;
    }
}