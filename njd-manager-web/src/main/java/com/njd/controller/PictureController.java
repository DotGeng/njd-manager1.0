package com.njd.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.njd.common.util.JsonUtils;
import com.njd.manager.service.PictureService;


@Controller
public class PictureController {
	@Autowired
	private PictureService pictureService;
	
	@RequestMapping("/pic/upload")
	@ResponseBody
	public String uploadPicture(MultipartFile uploadFile) throws Exception {
		Map result = pictureService.uploadPicture(uploadFile);
		return JsonUtils.objectToJson(result);
	}
}
