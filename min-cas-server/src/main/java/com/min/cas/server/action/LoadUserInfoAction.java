package com.min.cas.server.action;

import org.jasig.cas.authentication.principal.Principal;
import org.jasig.cas.ticket.InvalidTicketException;
import org.jasig.cas.ticket.TicketGrantingTicket;
import org.jasig.cas.ticket.registry.TicketRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.webflow.action.AbstractAction;
import org.springframework.webflow.execution.Event;
import org.springframework.webflow.execution.RequestContext;

import com.min.entity.MinUserCredential;
import com.min.facility.GlobalContextHolder;
import com.min.service.UserService;
import com.min.view.UserInfo;


public class LoadUserInfoAction extends AbstractAction {

//	@Autowired
	UserService userService;
	
//	@Autowired
	private TicketRegistry ticketRegistry;
	
	@Override
	protected Event doExecute(RequestContext context) throws Exception {
		//自定义加载用户数据
		MinUserCredential  credential = (MinUserCredential) context.getFlowScope().asMap().get("credential");
		//如果有刷新或者从其它系统切换到cas，这两个值需要重新赋值
		if(credential == null || credential.getUsername() == null){
			String ticketGrantingTicketId = (String) context.getFlowScope().asMap().get("ticketGrantingTicketId");
			if(ticketGrantingTicketId == null)
				throw new InvalidTicketException(ticketGrantingTicketId);
			
			TicketGrantingTicket ticketGrantingTicket;
	        ticketGrantingTicket = (TicketGrantingTicket) ticketRegistry.getTicket(ticketGrantingTicketId, TicketGrantingTicket.class);
	        if(ticketGrantingTicket == null)
				throw new InvalidTicketException(ticketGrantingTicketId);
	        
	        Principal principal = ticketGrantingTicket.getAuthentication().getPrincipal();
	        logger.debug("当前principal为" + principal);
	        if(principal != null){
	        	UserInfo userInfo = new UserInfo();
	        	userInfo.setUsername(principal.toString());
	        	GlobalContextHolder.setUserInfo(userInfo);
	        }
		}else{
			UserInfo userInfo = new UserInfo();
        	userInfo.setUsername(credential.getUsername());
        	GlobalContextHolder.setUserInfo(userInfo);
		}
		
		UserInfo userInfo = userService.loadUserByUsername(GlobalContextHolder.getUserInfo().getUsername());
		context.getFlowScope().asMap().put("userInfo", userInfo);
		
		return result("success");
	}

}
