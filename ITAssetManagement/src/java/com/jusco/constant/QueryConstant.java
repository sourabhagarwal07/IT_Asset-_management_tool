/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jusco.constant;

/**
 *
 * @author BHBPM3289C
 */
public interface QueryConstant {

    String loginUser = "SELECT * FROM users WHERE username = ? AND passwrd = ?";
    String saveAssetTrf = "INSERT INTO asset (aid_j, s_emp_id, d_emp_id) VALUES(?, ?, ?)";
    String saveAssetREg = "INSERT INTO asset (emp_id ,emp_name, ph_no ,email_id, dept, div, bld, flr, a_name, aid_c, aid_j, doi) values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?)";
    String saveNewAsset = "INSERT INTO arf (emp_id ,emp_name, ph_no ,email_id, dept, div, bld, flr, a_name, rem, sremp_id, sremail_id) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?)";
    String saveOldAsset = "INSERT INTO arf (emp_id ,emp_name, ph_no ,email_id, dept, div, bld, flr, a_name, aid_c, aid_j, doi, r_type, rem) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
}
