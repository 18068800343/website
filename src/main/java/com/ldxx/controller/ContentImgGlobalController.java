package com.ldxx.controller;


import com.ldxx.bean.auto.ContentImgGlobal;
import com.ldxx.service.IContentImgGlobalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author xianing
 * @since 2021-01-26
 */
@RestController
@RequestMapping("/ContentImgGlobalController")
public class ContentImgGlobalController {

    @Autowired
    private IContentImgGlobalService iContentImgGlobalService;
    @PostMapping("/getContentImgGlobal")
    public ContentImgGlobal getContentImgGlobal(){
        return iContentImgGlobalService.getById(1);
    }
}
