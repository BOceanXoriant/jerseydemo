package com.bo.service;


import java.io.IOException;
 

import javax.ws.rs.GET;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import com.bo.parser.XMLtoJsonConverter;

import net.sf.json.JSON;
 
@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "users")
@Path("/users")
public class UserResource 
{
    //private static Map<Integer, User> DB = new HashMap<>(); 
     
    @GET
    @Produces("application/json")
    public JSON getAllUsers() throws IOException {
        /*Users users = new Users();
        users.setUsers(new ArrayList<>(DB.values()));*/
        return XMLtoJsonConverter.convertJOSN();
    }
     
}
