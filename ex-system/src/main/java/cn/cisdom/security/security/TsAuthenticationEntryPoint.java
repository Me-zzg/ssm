package cn.cisdom.security.security;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Serializable;

/**
 * @author zhaozhenguo
 * @Description TODO 当用户尝试访问安全的REST资源而不提供任何凭据时，将调用此方法发送401 响应
 * @date 2019-04-11 17:10
 */
@Component
public class TsAuthenticationEntryPoint implements AuthenticationEntryPoint, Serializable {

    @Override
    public void commence(HttpServletRequest request,
                         HttpServletResponse response,
                         AuthenticationException authException) throws IOException, ServletException {

        System.out.println("我都报异常了你到底处理不处理啊~~~");

        response.sendError(HttpServletResponse.SC_UNAUTHORIZED, authException==null?"Unauthorized":authException.getMessage());

    }
}