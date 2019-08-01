package com.ymsl.toc.rest.service;

import javax.mail.internet.ParseException;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;

/**
 *
 * @author  mid0814
 * @version 1.0
 *
 */
@Path("/api")
public interface IFileResourceService {

    @POST
    @Path("/file")
    @Consumes(MediaType.MULTIPART_FORM_DATA)
    void upload(MultipartFormDataInput multipart) throws ParseException;

    @GET
    @Path("/download")
    Response download();

}