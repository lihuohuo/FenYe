package main.cn.happy.entity.hqlmapping02.filter;

import main.cn.happy.entity.hqlmapping02.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by lenovo on 2017/10/9.
 */
public class OpenSessionInViewFilter implements Filter {


    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.currentSession();
            System.out.println("filter\t"+session.hashCode());
            tx = session.beginTransaction();
            // 执行请求处理链
            filterChain.doFilter(servletRequest, servletResponse);
            // 返回响应时，提交事务
            tx.commit();
        } catch (HibernateException e) {
            e.printStackTrace();
            tx.rollback();
        } finally {
            // 关闭session
            HibernateUtil.closeSession();
        }
    }

    public void destroy() {

    }
}
