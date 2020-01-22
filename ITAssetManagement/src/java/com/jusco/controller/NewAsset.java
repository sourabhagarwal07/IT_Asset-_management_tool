/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jusco.controller;

import com.jusco.servises.LoginServises;
import com.jusco.servises.LoginServisesImpl;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
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
public class NewAsset {

    @Autowired
    private LoginServises services;

    @RequestMapping(value = "/NewAsset", method = RequestMethod.GET)
    public String getNewAsset() {
        return "NewAsset";
    }

    @RequestMapping(value = "/NewAsset", method = RequestMethod.POST)
    public String postNewAsset(ModelMap map, @ModelAttribute("newasset") com.jusco.model.NewAsset newasset, HttpSession session, HttpServletRequest request, HttpServletResponse response) {
        services.saveNewAsset(newasset);

        return "NewAsset";
    }
}
