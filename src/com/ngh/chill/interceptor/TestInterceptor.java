package com.ngh.chill.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class TestInterceptor implements Interceptor {

	private static final long serialVersionUID = 1L;

	@Override
	public void destroy() {
		System.out.println("destroy()");
	}

	@Override
	public void init() {
		System.out.println("init()");
	}

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		System.out.println("pre");
		String invoke = arg0.invoke();
		System.out.println("post");
		return invoke;
	}

}
