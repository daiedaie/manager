package com.paytong.platform.manager.controller.system;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

	private long userId;
	private Long roleId;
	private Long organId;
	private Long deptId;
	private String userFunc;
	
	private String oldPwd;
	private String newPwd;
	private String conPwd;

	
	
}
