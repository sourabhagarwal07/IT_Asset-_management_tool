/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jusco.controller;

import com.jusco.model.Users;
import com.jusco.servises.LoginServises;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author ACHIN
 */
@Controller
public class LoginCotroller {

    @Autowired
    private LoginServises login;
    JdbcTemplate jdbc = new JdbcTemplate();

    @RequestMapping(value = "/Login", method = RequestMethod.GET)
    public String loginServices(ModelMap map, HttpSession session, HttpServletRequest request, HttpServletResponse response) {
        System.out.println("=======================Login=================");

        return "Login";
    }

    @RequestMapping(value = "/Login", method = RequestMethod.POST)
    public String loginServices1(ModelMap map, @ModelAttribute("loginPage") Users loginPage, HttpSession session, HttpServletRequest request, HttpServletResponse response) {
        // System.out.println("=======================Success=================");
        //System.out.println(loginPage.getUsername());
        // System.out.println(loginPage.getPasswrd());
        List<Users> list = login.getLogin(loginPage);
        int a = loginPage.getA();
        if (list.size() > 0) {
            String userid = list.get(0).getUsername();
            session.setAttribute("userid", userid);
            if (a == 1) {
                return "AssetREg";
            } else if (a == 2) {
                return "AssetTrf";
            } else {
                session.removeAttribute("userid");
                map.addAttribute("result", "Invalid Request.");
                map.addAttribute("username", loginPage.getUsername());
                return "Login";
            }

        } else {
            map.addAttribute("result", "Invalid password or username.!!");
            map.addAttribute("username", loginPage.getUsername());
            return "Login";
        }
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String getHome() {
        return "Home";
    }
    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logoutServices(ModelMap map, HttpSession session, HttpServletRequest request, HttpServletResponse response) {
       session.removeAttribute("userid");
                map.addAttribute("result", "Logged Out Succesfully");
               
        return "Home";
    }
}
