<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>



    <div class="container">
      <hr>
      
      <footer>
        <div class="row">
          <div class="col-lg-12">
            <p >
            Copyright &copy; 2013 &middot; UI based on Bootstrap 3 
                                  &middot; <a href="<%=basePath %>adminlogin" target="_blank">admin</a>
                                  &middot; starlee2008@163.com 
                                  &middot;访问人数：${count}
                            
            </p>
          </div>
        </div>
      </footer>

    </div>
  
    <script src="<%=basePath %>bootstrap/js/bootstrap.js"></script>
    
  </body>
</html>
