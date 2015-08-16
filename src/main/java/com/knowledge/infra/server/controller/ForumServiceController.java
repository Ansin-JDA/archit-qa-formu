package com.knowledge.infra.server.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
import com.knowledge.infra.server.model.Answer;
import com.knowledge.infra.server.model.Question;
import com.knowledge.infra.server.model.User;
import com.knowledge.infra.server.service.AnswerService;
import com.knowledge.infra.server.service.QuestionService;
import com.knowledge.infra.server.service.UserService;
import com.knowledge.infra.server.util.JacksonUtils;

@RestController
public class ForumServiceController {

	@Autowired
	private UserService userService;

	@Autowired
	private QuestionService questionService;
	
	@Autowired
	private AnswerService answerService;
	
	@ExceptionHandler
	public String handleException(Exception e) {

		return null;
	}

	@RequestMapping(value = "/forum_service/Register", method = RequestMethod.POST, produces = { "text/javascript;charset=UTF-8" })
	@ResponseBody
	public String register(HttpServletRequest request) {

		 User user = JacksonUtils.fromJson(request.getParameter("user"),User.class);
		Map<String, Object> m = new HashMap<String, Object>(1);
		m.put("uname", user.getUname());
		GetServerResp resp = new GetServerResp();
		List<User> users = this.userService.getUsers(m);

		if (users != null && !users.isEmpty()) {

			resp.setCode(400);
			resp.setMsg("exist the same email");
		} 
		
		this.userService.addUser(user);
		user=this.userService.getUserbyId(user.getUserid());
		resp.setCode(200);
		resp.setData(user);	
		return JacksonUtils.toJson(resp);

	}

	@RequestMapping(value = "/forum_service/test", method = RequestMethod.GET, produces = { "text/javascript;charset=UTF-8" })
	@ResponseBody
	public String testData(HttpServletRequest request) {

		// 添加两条数据
		
		

		return "hehe";

	}
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET, produces = { "text/javascript;charset=UTF-8" })
	public ModelAndView  hello(HttpServletRequest request) {

		// 添加两条数据
		
		ModelAndView m = new ModelAndView();
		m.addObject("message","aaa");

		return m;

	}
	
	
	
	
	@RequestMapping(value = "/forum_service/login", method = RequestMethod.POST, produces = { "text/javascript;charset=UTF-8" })
	@ResponseBody
	public String login(HttpServletRequest request) {

		GetServerResp resp = new GetServerResp();
		HttpSession session=request.getSession(false);
		if(session.getAttribute("user")!= null)
		{
			resp.setCode(400);
			resp.setMsg("already login");
			return JacksonUtils.toJson(resp); 
			
		}

        User user = JacksonUtils.fromJson(request.getParameter("user"), User.class);
        if(user.getUname() == null || user.getUpassword()==null){
        	
        	resp.setCode(400);
			resp.setMsg("no passwd or name ");
			return JacksonUtils.toJson(resp);
        }
        Map<String, Object> para = new HashMap<String, Object>(2);
        para.put("uname", user.getUname());
        para.put("upassword", user.getUpassword());
        List<User> users= this.userService.getUsers(para);
        if(users==null || users.isEmpty()){
          	resp.setCode(400);
            resp.setMsg("no proper user found ");
            return JacksonUtils.toJson(resp);
        	
        }
		
        session=request.getSession();
		session.setAttribute("user", users.get(0));
		resp.setCode(200);
		return JacksonUtils.toJson(resp); 
        
        

	}

	@RequestMapping(value = "/forum_service/logout", method = RequestMethod.POST, produces = { "text/javascript;charset=UTF-8" })
	@ResponseBody
	public String logout(HttpServletRequest request) {

		GetServerResp resp = new GetServerResp();
		HttpSession session=request.getSession(false);
		session.removeAttribute("user");
		resp.setCode(200);
		return JacksonUtils.toJson(resp); 

	}

	///Get existing users
	@RequestMapping(value = "/forum_service/exist_user", method = RequestMethod.POST, produces = { "text/javascript;charset=UTF-8" })
	@ResponseBody
	public String existUser(HttpServletRequest request) {

		String email = request.getParameter("email");
		Map<String, Object> m = new HashMap<String, Object>(1);
		m.put("email", email);
		GetServerResp resp = new GetServerResp();
		List<User> users = this.userService.getUsers(m);

		if (users != null && !users.isEmpty()) {

			resp.setCode(400);
			resp.setMsg("exist the same email");
		} else {
			resp.setCode(200);
		}
		return JacksonUtils.toJson(resp);

	}
	
    ///Get ALL Questions for the main page, No paging here
	@RequestMapping(value = "/getallquestions", method = RequestMethod.GET, produces = { "text/javascript;charset=UTF-8" })
	@ResponseBody
	public ModelAndView getAllQuestions(HttpServletRequest request) {
		
		ModelAndView container=new ModelAndView();
		Map<String, Object> m = new HashMap<String, Object>(1);
		m.put("questionid", null);
		List<Question> questions = this.questionService.getQuestions(m);    
		container.addObject("questionList", questions);
		return container;

	}
	
///main page	
    
	@RequestMapping(value = "/main_page", method = RequestMethod.GET, produces = { "text/javascript;charset=UTF-8" })
	@ResponseBody
	public ModelAndView showMainPage(HttpServletRequest request) {

		ModelAndView container=new ModelAndView();
		
	
		return container ;

	}
	///	
    
	
//// quetionDetail page

    
	@RequestMapping(value = "/show_question_detail/{question_id}", method = RequestMethod.GET, produces = { "text/javascript;charset=UTF-8" })

	public ModelAndView getQuestionDetail(HttpServletRequest request,@PathVariable int question_id) {

		ModelAndView container=new ModelAndView();
	
		return container ;

	}

////search page ???

    
	@RequestMapping(value = "/search_question", method = RequestMethod.GET, produces = { "text/javascript;charset=UTF-8" })
	public ModelAndView searchQuestion(HttpServletRequest request) {

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
	public String voteAnswer(HttpServletRequest request,@PathVariable int answer_id,@PathVariable int status) {

	    Answer answer=this.answerService.getAnswer(answer_id);
	    GetServerResp resp = new GetServerResp();
	    if(answer == null )
	    {
	    	resp.setCode(400);
	    	resp.setMsg("no answer id matched");	
	    	return JacksonUtils.toJson(resp);
	    	
	    }	    	 
		answerService.voteAnswer(answer_id,status);
	    resp.setCode(200);
    	return JacksonUtils.toJson(resp);


	}
	
	@RequestMapping(value = "/forum_service/vote_question/{question_id}/{status}", method = RequestMethod.GET, produces = { "text/javascript;charset=UTF-8" })
	@ResponseBody
	public String voteQuestion(HttpServletRequest request,@PathVariable int question_id,@PathVariable int status) {

	    Question question=this.questionService.getQuestion(question_id);
	    GetServerResp resp = new GetServerResp();
	    if(question == null )
	    {
	    	resp.setCode(400);
	    	resp.setMsg("no answer id matched");	
	    	return JacksonUtils.toJson(resp);
	    	
	    }	    	 
	    questionService.voteQuestion(question_id, status);
	    resp.setCode(200);
    	return JacksonUtils.toJson(resp);


	}
	
	
	
	
	@RequestMapping(value = "/forum_service/reply_question/{question_id}", method = RequestMethod.POST, produces = { "text/javascript;charset=UTF-8" })
	@ResponseBody
	public String replyQuestion(HttpServletRequest request,@PathVariable int question_id) {

	    Question question=this.questionService.getQuestion(question_id);
	    GetServerResp resp = new GetServerResp();
	    if(question == null )
	    {
	    	resp.setCode(400);
	    	resp.setMsg("no question id matched");	
	    	return JacksonUtils.toJson(resp);
	    	
	    }	    	
	    String json= request.getParameter("replyContent");
	    Answer  answer= JacksonUtils.fromJson(json, Answer.class);
	    answerService.addAnswer(answer);
	    resp.setCode(200);
	    resp.setData(answer);
    	return JacksonUtils.toJson(resp);

	}
	
	@RequestMapping(value = "/forum_service/ask_question", method = RequestMethod.POST, produces = { "text/javascript;charset=UTF-8" })
	@ResponseBody
	public String replyQuestion(HttpServletRequest request) {

	    Question question=JacksonUtils.fromJson(request.getParameter("question"), Question.class);
	    GetServerResp resp = new GetServerResp();
	    this.questionService.addQuestion(question);
	    resp.setCode(200);
	    resp.setData(question);
    	return JacksonUtils.toJson(resp);

	}
	
	@RequestMapping(value = "/forum_service/reply_answer/{answer_id}", method = RequestMethod.POST, produces = { "text/javascript;charset=UTF-8" })
	@ResponseBody
	public String replyAnswer(HttpServletRequest request,@PathVariable int answer_id) {
		
		Answer answer=this.answerService.getAnswer(answer_id);
	    GetServerResp resp = new GetServerResp();
	    if(answer == null )
	    {
	    	resp.setCode(400);
	    	resp.setMsg("no answer id matched");	
	    	return JacksonUtils.toJson(resp);
	    	
	    }	    	
	    String json= request.getParameter("replyContent");
	    Answer  answer1= JacksonUtils.fromJson(json, Answer.class);
	    answer1.setAcontent(answer1.getAcontent()+"||@"+answer.getAcontent());
	    answerService.addAnswer(answer1);
	    resp.setCode(200);
	    resp.setData(answer1);
    	return JacksonUtils.toJson(resp);
	}
	
	@RequestMapping(value = "/forum_service/search_question/{keyword}", method = RequestMethod.POST, produces = { "text/javascript;charset=UTF-8" })
	@ResponseBody
	public String searchQuestion(HttpServletRequest request,@PathVariable String keyword) {

	
		return "" ;

	}
	
	
}
