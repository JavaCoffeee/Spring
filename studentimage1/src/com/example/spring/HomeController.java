package com.example.spring;

import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletOutputStream;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	byte[] fileBytes;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView startUpPage() {
		return new ModelAndView("view", "command", new Student());
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String uploadImage(
			@RequestParam(value = "uploadfile", required = false) MultipartFile fileu,
			ModelMap model) {
		String fName = fileu.getOriginalFilename();

		File file = new File("tmp");

		if (!(file.exists())) {
			file.mkdir();
		} else {
			// byte[] fileBytes;
			try {
				String uploadPath = ("/home/jagir/Documents/workspace-sts-3.6.3.SR1/studentimage1/WebContent/tmp/" + fName);
				fileBytes = fileu.getBytes();
				BufferedOutputStream buffStream = new BufferedOutputStream(
						new FileOutputStream(new File(uploadPath)));
				buffStream.write(fileBytes);
				buffStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		model.addAttribute("msg", "You have successfully upload " + fName + ".");
		return "add";
	}

	@RequestMapping(value = "/display")
	public String displayFile(HttpServletResponse response) throws IOException {
		
		File file = new File(
				"/home/jagir/Documents/workspace-sts-3.6.3.SR1/studentimage1/WebContent/tmp/schedule.png");
		ServletOutputStream ouputStream = response.getOutputStream();
		InputStream is = new ByteArrayInputStream(fileBytes);
		try {
			int b;
			while ((b = is.read()) != -1) {
				ouputStream.write(b);
			}

		} finally {
			ouputStream.flush();
			ouputStream.close();
			is.close();
		}
		return "add";
	}
}
