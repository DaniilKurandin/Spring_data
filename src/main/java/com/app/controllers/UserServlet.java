package com.app.controllers;

import com.app.dao.interfaces.UserDao;
import com.app.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/users")
public class UserServlet {
    //    List<User> list = new ArrayList<>();
    UserDao userDAO;

    //@RequestMapping(value = "/form", method = RequestMethod.GET)
    @GetMapping(value = "/add")
    public String getForm() {
        return "addUser.jsp";
    }

    @PostMapping(value = "/add")
    public ModelAndView passDataFromUser(@ModelAttribute("user") User user, ModelAndView modelAndView) {
        modelAndView.setViewName("newUser.jsp");
        userDAO.addUser(user);
        modelAndView.addObject("user", user);

        return modelAndView;
    }

    @GetMapping(value = "/all")
    public ModelAndView listAll(ModelAndView modelAndView) {
        modelAndView.addObject("list", userDAO.getAllUser());
        modelAndView.setViewName("allUsers.jsp");

        return modelAndView;
    }

    @GetMapping(value = "/findUserByEmail")
    private String getFindUserEmail() {
        return "findUserByEmail.jsp";
    }

    @PostMapping(value = "/findUserByEmail")
    public ModelAndView findUserByEmail(@RequestParam("email") String email, ModelAndView modelAndView) {
        modelAndView.addObject("list", userDAO.getUserByEmail(email));
        modelAndView.setViewName("emailUserResult.jsp");
        return modelAndView;
    }

    @Autowired
    public void setUserDAO(UserDao userDAO) {
        this.userDAO = userDAO;
    }
}
