package com.controller;

import com.controller.LoginController;

import javax.xml.ws.Endpoint;

/**
 * Created by Lin_Yang on 2014/12/16.
 */
public class publish {
    public static void main(String args[]){
        Object implementor = new news();
        String address = "http://localhost:8989/news";     //发布到的地址
        Endpoint.publish(address, implementor);
        System.out.println("发布成功");
    }
}