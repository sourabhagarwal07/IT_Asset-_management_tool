/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jusco.controller;

import com.jusco.servises.LoginServises;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author ACHIN
 */
@Controller
public class AssetReg {

    @Autowired
    private LoginServises services;

    @RequestMapping(value = "/AssetREg", method = RequestMethod.GET)
    public String getAssetREg(ModelMap map, HttpSession session, HttpServletRequest request) {
        String userid = (String) session.getAttribute("userid");
        if (userid == null) {
            int a = Integer.parseInt(request.getParameter("a"));
            System.out.println("A =" + a);
            map.addAttribute("aval", a + "");
            return "Login";
        }
        return "AssetREg";
    }

    @RequestMapping(value = "/AssetREg", method = RequestMethod.POST)
    public String postAssetREg(ModelMap map, @ModelAttribute("assetreg") com.jusco.model.AssetREg assetreg, HttpSession session, HttpServletRequest request, HttpServletResponse response) {
        services.saveAssetREg(assetreg);

        return "AssetREg";
    }
}
