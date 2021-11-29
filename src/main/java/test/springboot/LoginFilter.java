/*
 * package test.springboot;
 * 
 * import java.io.IOException; import java.security.GeneralSecurityException;
 * import javax.servlet.Filter; import javax.servlet.FilterChain; import
 * javax.servlet.FilterConfig; import javax.servlet.ServletException; import
 * javax.servlet.ServletRequest; import javax.servlet.ServletResponse; import
 * javax.servlet.http.HttpServletRequest; import
 * javax.servlet.http.HttpServletResponse;
 * 
 * public class LoginFilter implements Filter {
 * 
 * @Override public void init(FilterConfig filterConfig) throws ServletException
 * { System.out.println("init /login filter"); }
 * 
 * @Override public void doFilter(ServletRequest servletRequest, ServletResponse
 * servletResponse, FilterChain filterChain) throws IOException,
 * ServletException {
 * 
 * String idToken = ((HttpServletRequest)
 * servletRequest).getHeader("X-ID-TOKEN"); HttpServletResponse response =
 * (HttpServletResponse) servletResponse;
 * System.out.println("filtered /login request: " + idToken);
 * 
 * if (idToken != null) { final Payload payload; try { payload =
 * GoogleTokenVerifier.verify(idToken); if (payload != null) { // TODO: 5/6/17
 * get this username from DB (createOrGet) String username = "myUniqueUser";
 * AppTokenProviderAndAuthenticator.addAuthentication(response, username);
 * filterChain.doFilter(servletRequest, response); return; } } catch
 * (GeneralSecurityException | InvalidTokenException e) { // This is not a valid
 * token, we will send HTTP 401 back } }
 * 
 * ((HttpServletResponse)
 * servletResponse).sendError(HttpServletResponse.SC_UNAUTHORIZED); }
 * 
 * @Override public void destroy() { } }
 */