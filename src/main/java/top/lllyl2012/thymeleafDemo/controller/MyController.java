package top.lllyl2012.thymeleafDemo.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
	@GetMapping("/myDemo")
	public String myDemo(Model model) {
		model.addAttribute("name", "应老师");
		List<String> intArr = new ArrayList<>();
		intArr.add("gaga");
		intArr.add("lala");
		intArr.add("kaka");
		model.addAttribute("arr", intArr);
		User user = new User(new BigDecimal(19.27463), new Date());
		model.addAttribute("user", user);
		String specStr = "<b>特殊字符</b>";
		model.addAttribute("specStr", specStr);
		return "demo";
	}

	@GetMapping("/other")
	public String other() {
		return "other";
	}

	@GetMapping("/params")
	@ResponseBody
	public String params(Integer id, String name) {
		return "" + id + ":" + name;
	}

	@GetMapping("/url/c/first")
	@ResponseBody
	public String urlCFirst(String name) {
		return "c : " + name;
	}

	@GetMapping("/url/d/first")
	@ResponseBody
	public String urlDFirst(String name) {
		return "d : " + name;
	}

	@PostMapping("/submitDemo")
	@ResponseBody
	public String submitDemo(String username, String money, String time) {
		return username + "," + money + "," + time;
	}
}
