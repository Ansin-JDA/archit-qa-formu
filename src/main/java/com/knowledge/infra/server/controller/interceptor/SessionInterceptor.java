package com.knowledge.infra.server.controller.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.knowledge.infra.server.model.User;


public class SessionInterceptor  implements HandlerInterceptor{
    
	public String[] allowUrls;//��û���ֿ���ֱ�����ò����ص���Դ�������ڴ����������ų�
	
	public void setAllowUrls(String[] allowUrls) {
		this.allowUrls = allowUrls;
	}

	
	
	

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse arg1,
			Object arg2) throws Exception {
		String requestUrl = request.getRequestURI().replace(request.getContextPath(), "");  
		System.out.println(requestUrl);
		if(null != allowUrls && allowUrls.length>=1)
			for(String url : allowUrls) {  
				if(requestUrl.contains(url)) {  
					return true;  
				}  
			}
		
		User user = (User) request.getSession().getAttribute("user");
		if(user != null) {  
			return true;  //����true�������������ú����ŵ���postHandle(),  afterCompletion()
		}else{
			// δ��¼  ��ת����¼ҳ��
			throw new RuntimeException("session timeout");//���ص������ļ��ж����·��
		}
	}





	@Override
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}





	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse resp,
			Object arg2, ModelAndView arg3) throws Exception {
		// TODO Auto-generated method stub
		
	}

}