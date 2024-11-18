package wayheng.cn.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import org.springframework.stereotype.Component;


@WebFilter(urlPatterns = "/*", filterName = "MyFilter")
@Component
public class MyFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) {
        // 初始化过滤器时的操作
        System.out.println("SS MyLoggingFilter initialized");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        // 处理请求前的逻辑（打印请求信息）
        System.out.println("SS Request received at: " + System.currentTimeMillis());

        // 继续请求处理链
        chain.doFilter(request, response);

        // 处理响应后的逻辑（打印响应信息）
        System.out.println("SS Response sent at: " + System.currentTimeMillis());
    }

    @Override
    public void destroy() {
        // 销毁过滤器时的操作
        System.out.println("SS MyLoggingFilter destroyed");
    }
}
