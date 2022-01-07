package com.fbugraaydin.multitenancy.interceptor;

import com.fbugraaydin.multitenancy.TenantContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Component
public class RequestInterceptor implements HandlerInterceptor {
    private Logger logger = LoggerFactory.getLogger(RequestInterceptor.class);

    @Value("${tenants}")
    List<String> validTenants;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        logger.info("Request is intercepted");
        String requestURI = request.getRequestURI();
        //String host = request.getHeader("Host"); // -> if you want to get tenant via domain, uncomment this.
        String tenant = request.getHeader("tenant");
        logger.info("RequestURI: " + requestURI + "|| Search for tenant: " + tenant);
        if(tenant != null && !validTenants.contains(tenant)){
            response.getWriter().write("tenant " + tenant +" is not permitted.");
            response.setStatus(400);
            return false;
        }
        TenantContext.setCurrentTenant(tenant);
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        TenantContext.clear();
    }
}
