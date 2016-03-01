package hello.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

@Component
public class DebugFilter implements Filter {

    private static Logger logger = LoggerFactory.getLogger(DebugFilter.class);

    // TODO    @Autowired
    //    private RequestCounterService requestCounterService;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        // nothing to do
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        String foo = request.getParameter("foo");
        logger.debug("Parameter foo: {}", foo);
        // TODO        requestCounterService.increment("requests_total");
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        // nothing to do
    }
}
