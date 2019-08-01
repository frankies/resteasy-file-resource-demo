package com.ymsl.toc.rest.service.impl;

import java.io.File;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

import javax.mail.internet.ContentDisposition;
import javax.mail.internet.ParseException;
import javax.ws.rs.core.Response;

import org.jboss.resteasy.plugins.providers.multipart.InputPart;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;

import com.ymsl.toc.rest.service.IFileResourceService;

/**
 *
 * @author  mid0814
 * @version 1.0
 *
 */
public class FileResourceService implements IFileResourceService   {

    @Override
    public void upload(MultipartFormDataInput multipart) throws ParseException {
        Map<String, List<InputPart>> uploadForm = multipart.getFormDataMap();
        List<InputPart> inputParts = uploadForm.get("file_upload");
        InputPart inputPart = inputParts.get(0);
        String dispositionHeader = inputPart.getHeaders().getFirst("Content-Disposition");
        ContentDisposition cd = new ContentDisposition(dispositionHeader);
        String filenameFromHeader = cd.getParameter("filename"); 
        System.out.println("File name:" + filenameFromHeader);
    }

    @Override
    public Response download() {
        File f = Paths.get("f:/Test.java").toFile();
        String fileName = f.getName();
        return Response.ok(f).header("Content-Disposition", "attachment; filename=\"" + fileName + "\"").build();
    }
}
