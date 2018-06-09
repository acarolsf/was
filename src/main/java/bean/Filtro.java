package bean;

import java.io.IOException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;




@WebFilter (servletNames = {"Faces Servlet"})
public class Filtro implements Filter {
	
	private EntityManagerFactory emf;
	
	public void init(FilterConfig filterConfig) throws ServletException {
		this.emf = Persistence.createEntityManagerFactory("Mapeamento");
	}
	
	public void destroy() {
		this.emf.close();
	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {

				EntityManager em = this.emf.createEntityManager();
				request.setAttribute("EntityManager", em);
				em.getTransaction().begin();
				
				chain.doFilter(request, response);
				
				try{
					em.getTransaction().commit();
				}catch(Exception e){
					em.getTransaction().rollback();
				}finally{
					em.close();
				}
	}

}
