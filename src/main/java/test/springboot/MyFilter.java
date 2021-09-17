
package test.springboot;
  
  import org.springframework.boot.web.servlet.FilterRegistrationBean; 
  import org.springframework.context.annotation.Bean; 
  import org.springframework.stereotype.Component;
  import org.springframework.web.filter.GenericFilterBean;
  
  import javax.servlet.*; 
  import javax.servlet.http.HttpServletRequest;
  import javax.servlet.http.HttpServletResponse; import java.io.IOException;
  
  @Component // public class MyFilter extends GenericFilterBean 
  public class MyFilter implements Filter {
  
  @Override public void init(FilterConfig filterConfig) throws ServletException
  { System.out.println("do filter method invoked"); }
  
  @Override public void destroy() {
  System.out.println("do filter method invoked"); }
  
  @Override public void doFilter(ServletRequest request, ServletResponse
  response, FilterChain chain) throws IOException, ServletException {
  HttpServletRequest req = (HttpServletRequest) request; HttpServletResponse
  res = (HttpServletResponse) response;
  
  System.out.println("do filter method invoked");
  System.out.println("Request URI is: " + req.getRequestURI());
  chain.doFilter(request, response);
  System.out.println("Response Status Code is: " + res.getStatus()); }
  
  @Bean public FilterRegistrationBean<MyFilter> filter() {
  FilterRegistrationBean<MyFilter> bean = new FilterRegistrationBean<>();
  
  bean.setFilter(new MyFilter()); bean.addUrlPatterns("/execute/*"); // or, use `setUrlPatterns()`
  
  return bean; } }
 