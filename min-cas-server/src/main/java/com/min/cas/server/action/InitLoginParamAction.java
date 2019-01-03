package com.min.cas.server.action;

import org.springframework.webflow.action.AbstractAction;
import org.springframework.webflow.execution.Event;
import org.springframework.webflow.execution.RequestContext;

public class InitLoginParamAction extends AbstractAction {

	@Override
	protected Event doExecute(RequestContext context) throws Exception {
		//自定义参数初始化
		context.getFlowScope().asMap().put("minUrl", "/cas/hello");
		return result("success");
	}

}
