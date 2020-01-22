/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jusco.controller;

import com.jusco.servises.LoginServises;
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
public class OldAsset {

    @Autowired
    private LoginServises services;

    @RequestMapping(value = "/OldAsset", method = RequestMethod.GET)
    public String getOldAsset() {
        return "OldAsset";
    }

    @RequestMapping(value = "/OldAsset", method = RequestMethod.POST)
    public String postOldAsset(ModelMap map, @ModelAttribute("oldasset") com.jusco.model.OldAsset oldasset, HttpSession session, HttpServletRequest request, HttpServletResponse response) {
        services.saveOldAsset(oldasset);
        return "OldAsset";
    }
}