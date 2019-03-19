package com.controller;

import com.entity.PersonEntity;
import com.service.IPersonService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/my")
public class InsertController {
   @Autowired
   IPersonService personService;
   @Autowired
   PersonEntity personEntity;
    @RequestMapping("/insert")
    public ModelAndView Insert(String name,String password)
    {
        System.out.println(name);
        System.out.println(password);
        personEntity.setName(name);
        personEntity.setPassword(password);
        System.out.println(personEntity.getName());
        ModelAndView mv = new ModelAndView();
        System.out.println("1");
        Configuration cig = new Configuration().configure();
        System.out.println("1");
        SessionFactory sessionFactory = cig.buildSessionFactory();
        System.out.println("1");
        Session session = sessionFactory.openSession();
        System.out.println("1");
        Transaction t = session.beginTransaction();
        System.out.println("1");
       // PersonEntity c = new PersonEntity();
        //c.setName("zhanghuanha");
        //c.setPassword("123456");
        session.save(personEntity);
        // session.update(c);
        t.commit();
        session.close();
        sessionFactory.close();
        //personService.save(personEntity);

        if(name.equals("")||password.equals(""))
        {
            mv.setViewName("insert");
        }
        else {
            mv.setViewName("login");
        }
        return mv;
    }
}
