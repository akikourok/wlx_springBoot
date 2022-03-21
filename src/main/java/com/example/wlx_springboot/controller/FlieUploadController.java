package com.example.wlx_springboot.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;

@RestController
public class FlieUploadController{
    SimpleDateFormat sdf = new SimpleDateFormat ( "yyyy/MM/dd/" );
    @PostMapping("/upload")
    public String upload(MultipartFile uploadFile, HttpServletRequest req)
    {
        String realPath=req.getSession().getServletContext().getRealPath("/uploadFlie");
        return null;
    }
}

