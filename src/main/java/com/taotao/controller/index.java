package com.taotao.controller;

import java.awt.List;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class index {
//	clean tomcat7:run
	@RequestMapping("/updata")
	public String name() {
		System.out.println("---++++++-----");
		return "uploand";
	}
	@RequestMapping(value="/uploadzip",method=RequestMethod.POST)
	public void uploadzip(@RequestParam(name = "file")MultipartFile file) throws IOException {
		InputStream is;
		System.out.println("来了");
		System.out.println(file.getOriginalFilename());
		String filename = file.getOriginalFilename();	
		if (!filename.endsWith("zip")) {	
			System.out.println("文件格式错误");
			return;
		}
		ZipEntry zipEntry;
		 is = new ByteArrayInputStream(file.getBytes());
//		ZipInputStream zis = new ZipInputStream(file.getInputStream(), Charset.defaultCharset());
//		while((zipEntry=zis.getNextEntry())!=null) {
//			System.out.println(zipEntry.getName());
//		}
		ZipFile zipfile=new ZipFile(InputStream);
	}
}
