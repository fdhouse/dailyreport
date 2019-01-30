package com.jmtbg.dailyreport.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/admin")
public class LoginController {

    /**
     * Login
     *
     * @return String html
     */
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(HttpServletRequest request) {

        return "admin/login";
    }

    /**
     * Login in
     */
    @PostMapping("/loginIn")
    public void loginIn(
            @RequestParam(name = "username", defaultValue = "") String username,
            @RequestParam(name = "password", defaultValue = "") String password,
            HttpServletRequest request,
            HttpServletResponse response
    ) {

    }
}
