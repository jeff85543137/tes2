package com.offcn.service;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.offcn.po.User;

public interface UserService {
/**
 * 查询方法 GET
 */
	@GET
	@Path("/get/{id}")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public User get(@PathParam("id")String id);
	
/**
 * 新增方法 POST	
 */
	 @POST
	 @Path("/post/{id}")
	 @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	 public User post(@PathParam("id")String id,User user);
/**
 * 修改方法 PUT	 
 */
	 @PUT
	 @Path("/put/{id}")
	 @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	 public User put(@PathParam("id")String id,User user);
	 
	/**
	 * 删除方法 DELETE 
	 */
	 @DELETE
	 @Path("/delete/{id}")
	 @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	 public User delete(@PathParam("id")String id);
	 
	 
}
