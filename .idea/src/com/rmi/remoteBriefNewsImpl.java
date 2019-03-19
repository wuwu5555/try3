package com.rmi;

import com.entity.NewsEntity;
import com.service.INewsService;
import com.service.impl.NewsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;


import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;


public class remoteBriefNewsImpl extends UnicastRemoteObject implements Serializable, remoteBriefNews {

    private static final long serialVersionUID = -5809782572943999L;

    protected remoteBriefNewsImpl() throws RemoteException {
    }

   /* public remoteBriefNewsImpl() throws RemoteException{
        this.sqlSession = SqlSessionAssist.getSession();;
        this.newsmapper = sqlSession.getMapper(newsmapper.class);
    }
*/
    @Override
    public List<String> getBriefNews() throws RemoteException {
        INewsService newsService=new NewsServiceImpl();
        List<NewsEntity> newsList;
        newsList= newsService.findAll();
        List<String> l = new ArrayList<String>();
       for(int i=0;i<newsList.size();i++)
       {
           l.add(newsList.get(i).getContent().substring(0,5)+ "..."+"\n");
           //System.out.println(newsList.get(i).getContent().substring(0,2));
       }
        System.out.println("服务端被调用");
        for(String s: l){
            System.out.println(s);
        }
        return l;
    }

    @Override
    public String helloworld() throws RemoteException {
        System.out.println("服务端被调用");
        return "helloworld";
    }
}
