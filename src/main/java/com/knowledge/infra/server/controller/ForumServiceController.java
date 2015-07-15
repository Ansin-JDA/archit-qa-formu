package com.knowledge.infra.server.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.support.RequestContextUtils;

import com.knowledge.infra.server.controller.vo.GetServerResp;
import com.knowledge.infra.server.dao.UserDao;
import com.knowledge.infra.server.model.User;
import com.knowledge.infra.server.service.UserService;
import com.knowledge.infra.server.util.JacksonUtils;

@RestController
public class ForumServiceController {

	@Autowired
	private UserService userService;

	
	@ExceptionHandler
	public String handleException(Exception e) {

		return null;
	}

	@RequestMapping(value = "/forum_service/Register", method = RequestMethod.POST, produces = { "text/javascript;charset=UTF-8" })
	@ResponseBody
	public String register(HttpServletRequest request) {

		User user = new User();

		return "hehe";//redirect to prev page (in request)

	}

	@RequestMapping(value = "/forum_service/test", method = RequestMethod.POST, produces = { "text/javascript;charset=UTF-8" })
	@ResponseBody
	public String testData(HttpServletRequest request) {

		// 添加两条数据
		
		

		return "hehe";

	}
	
	
	
	@RequestMapping(value = "/forum_service/login", method = RequestMethod.POST, produces = { "text/javascript;charset=UTF-8" })
	@ResponseBody
	public String login(HttpServletRequest request) {

		// 添加两条数据
		
		

		return "hehe";

	}

	@RequestMapping(value = "/forum_service/logout", method = RequestMethod.POST, produces = { "text/javascript;charset=UTF-8" })
	@ResponseBody
	public String logout(HttpServletRequest request) {

		User user = new User();
		// 添加两条数据

		return "hehe";//redirect to main page 

	}

	@RequestMapping(value = "/forum_service/exist_user", method = RequestMethod.POST, produces = { "text/javascript;charset=UTF-8" })
	@ResponseBody
	public String existUser(HttpServletRequest request) {

		String email = request.getParameter("email");
		Map<String, Object> m = new HashMap<String, Object>(1);
		m.put("email", email);
		GetServerResp resp = new GetServerResp();
		List<User> users = this.userService.getUser(m);

		if (users != null && users.isEmpty()) {

			resp.setCode(400);
			resp.setMsg("exist the same email");
		} else {
			resp.setCode(200);
		}
		return JacksonUtils.toJson(resp);

	}
///main page	
    
	@RequestMapping(value = "/forum/main_page/", method = RequestMethod.GET, produces = { "text/javascript;charset=UTF-8" })
	@ResponseBody
	public ModelAndView showMainPage(HttpServletRequest request) {

		ModelAndView container=new ModelAndView();
	
		return container ;

	}

	
	
//// forum question 

    
	@RequestMapping(value = "/forum/show_question_detail/{question_id}", method = RequestMethod.GET, produces = { "text/javascript;charset=UTF-8" })
	@ResponseBody
	public ModelAndView getQuestionDetail(HttpServletRequest request,@PathVariable int question_id) {

		ModelAndView container=new ModelAndView();
	
		return container ;

	}

	@RequestMapping(value = "/forum_service/get_more_answer/{question_id}/{pageindex}", method = RequestMethod.GET, produces = { "text/javascript;charset=UTF-8" })
	@ResponseBody
	public String getMoreAnswer(HttpServletRequest request,@PathVariable int question_id,@PathVariable int pageindex) {

		
	
		return "" ;

	}
	
	@RequestMapping(value = "/forum_service/vote_answer/{answer_id}/{status}", method = RequestMethod.GET, produces = { "text/javascript;charset=UTF-8" })
	@ResponseBody
	public String voteAnswer(HttpServletRequest request,@PathVariable int question_id,@PathVariable int status) {

		
	
		return "" ;

	}
	
	
	@RequestMapping(value = "/forum_service/reply_question/{question_id}", method = RequestMethod.POST, produces = { "text/javascript;charset=UTF-8" })
	@ResponseBody
	public String replyQuestion(HttpServletRequest request,@PathVariable int question_id) {

		
	
		return "" ;

	}
	
	
	@RequestMapping(value = "/forum_service/reply_answer/{answer_id}", method = RequestMethod.POST, produces = { "text/javascript;charset=UTF-8" })
	@ResponseBody
	public String replyAnswer(HttpServletRequest request,@PathVariable int answer_id) {

		
	
		return "" ;

	}
	
	@RequestMapping(value = "/forum_service/search_question/{keyword}", method = RequestMethod.POST, produces = { "text/javascript;charset=UTF-8" })
	@ResponseBody
	public String searchQuestion(HttpServletRequest request,@PathVariable String keyword) {

		
	
		return "" ;

	}
	
	
}
