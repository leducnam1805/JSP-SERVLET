/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.36
 * Generated at: 2020-06-24 06:31:43 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.BT3;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class lienhe_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/views/BT3/inc/footer.jsp", Long.valueOf(1592971729920L));
    _jspx_dependants.put("/views/BT3/inc/leftmenu.jsp", Long.valueOf(1592971628305L));
    _jspx_dependants.put("/views/BT3/inc/header.jsp", Long.valueOf(1592979663072L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<title>VinaEnter Edu - Web tin tức</title>\r\n");
      out.write("<script src=\"http://code.jquery.com/jquery-1.10.1.min.js\"></script>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\r\n");
      out.write("<meta name=\"robots\" content=\"index, follow\" />\r\n");
      out.write("<meta name=\"keywords\"\r\n");
      out.write("\tcontent=\"tin tuc viet nhat, tin tức việt nhật, tin nhật bản, tin nhat ban\" />\r\n");
      out.write("<meta name=\"description\"\r\n");
      out.write("\tcontent=\"Tin tức Việt - Nhật, cập nhật liên tục hằng ngày\" />\r\n");
      out.write("<link href=\"");
      out.print(request.getContextPath() );
      out.write("/views/BT3/styles.css\" type=\"text/css\" rel=\"stylesheet\" />\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<a name=\"totop\"></a>\r\n");
      out.write("\t<div class=\"wrapper\">\r\n");
      out.write("\t\t<div id=\"top-nav\">\r\n");
      out.write("\t\t\t<div class=\"main-content\">\r\n");
      out.write("\t\t\t\t<p class=\"fl\">\r\n");
      out.write("\t\t\t\t\t<a href=\"/lien-he/\" title=\"\">TRUNG TÂM ĐÀO TẠO VINAENTER\r\n");
      out.write("\t\t\t\t\t\tEDU</a>\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t<p class=\"fr mail-icon\">\r\n");
      out.write("\t\t\t\t\t<a href=\"\" title=\"\">HOT line: 0909.123.456 - 064.3456.789</a>\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t<div class=\"clr\"></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div id=\"top-menu\">\r\n");
      out.write("\t\t\t<div class=\"main-content\">\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li class=\"parent current\"><a href=\"");
      out.print(request.getContextPath() );
      out.write("/views/BT3/index.jsp\">Trang\r\n");
      out.write("\t\t\t\t\t\t\tchủ</a></li>\r\n");
      out.write("\t\t\t\t\t<li class=\"parent\"><a href=\"");
      out.print(request.getContextPath() );
      out.write("/views/BT3/gioithieu.jsp\">Giới thiệu</a></li>\r\n");
      out.write("\t\t\t\t\t<li class=\"parent\"><a href=\"");
      out.print(request.getContextPath() );
      out.write("/views/BT3/lienhe.jsp\">Liên hệ</a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t<div class=\"clr\"></div>\r\n");
      out.write("\t\t\t\t<div class=\"clr\"></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>");
      out.write("\r\n");
      out.write("<div id=\"main-body\">\r\n");
      out.write("\t<div class=\"main-content\">\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("<div class=\"body-left fl\">\r\n");
      out.write("\t\t\t\t\t<div class=\"left-menu\">\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"parent\"><a href=\"");
      out.print(request.getContextPath() );
      out.write("/views/BT3/danhmuc.jsp\">Toàn cảnh\r\n");
      out.write("\t\t\t\t\t\t\t\t\tNhật Bản</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"parent\"><a href=\"");
      out.print(request.getContextPath() );
      out.write("/views/BT3danhmuc.jsp\">Tin tức\r\n");
      out.write("\t\t\t\t\t\t\t\t\tViệt - Nhật</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"parent\"><a href=\"");
      out.print(request.getContextPath() );
      out.write("/views/BT3danhmuc.jsp\">Tin tức\r\n");
      out.write("\t\t\t\t\t\t\t\t\tgiải trí</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"parent\"><a href=\"");
      out.print(request.getContextPath() );
      out.write("/views/BT3danhmuc.jsp\">Du học\r\n");
      out.write("\t\t\t\t\t\t\t\t\tNhật Bản</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"clr\"></div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"support\">\r\n");
      out.write("\t\t\t\t\t\t<p>Hỗ trợ trực tuyến</p>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"yahoo\">\r\n");
      out.write("\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"ymsgr:sendIM?trandangx\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttitle=\"Chat with Mr.Xuân\">Mr.Xuân</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"ymsgr:sendIM?itsontran\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttitle=\"Chat with Mr.Sơn\">Mr.Sơn</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t<div cl\r\n");
      out.write("\t\t\t\t\t\t\tass=\"clr\"></div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"skype\">\r\n");
      out.write("\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"Skype:trandangx?chat\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttitle=\"Chat with Mr.Xuân\">Mr.Xuân</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"Skype:itsontran?chat\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttitle=\"Chat with Mr.Sơn\">Mr.Sơn</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"clr\"></div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"orther\">\r\n");
      out.write("\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\tEmail: <span>vinaenter@gmail.com</span>\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\tSố điện thoại: <span>0903154678</span>\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"advs\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"\" title=\"\"> <img src=\"");
      out.print(request.getContextPath() );
      out.write("/views/BT3/images/qc1.jpg\" alt=\"\" />\r\n");
      out.write("\t\t\t\t\t\t</a> <a href=\"\" title=\"\"> <img src=\"");
      out.print(request.getContextPath() );
      out.write("/views/BT3/images/qc2.jpg\" alt=\"\" />\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>");
      out.write("\r\n");
      out.write("\t\t<div class=\"body-right fr\">\r\n");
      out.write("\t\t\t<div class=\"news-block\">\r\n");
      out.write("\t\t\t\t<h2 class=\"title-cat\">Liên hệ</h2>\r\n");
      out.write("\t\t\t\t<div class=\"content-cat1\">\r\n");
      out.write("\t\t\t\t\t<div class=\"content-detail\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"FromBox\">\r\n");
      out.write("\t\t\t\t\t\t\t<h4>Liên hệ javionline.net</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<form name=\"fcontact\" method=\"post\" action=\"\" id=\"fcontact\"\r\n");
      out.write("\t\t\t\t\t\t\t\tenctype=\"multipart/form-data\" novalidate=\"novalidate\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"FieldRow\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label>Họ và tên:<span class=\"RSM_form_star_color\">(*)</span></label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" value=\"\" class=\"\" maxlength=\"50\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tname=\"HO_VA_TEN\" id=\"HO_VA_TEN\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"FieldRow\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label>Email:<span class=\"RSM_form_star_color\">(*)</span></label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" value=\"\" class=\"\" maxlength=\"50\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tname=\"EMAIL\" id=\"EMAIL\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"FieldRow\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label>Điện thoại:</label> <input type=\"text\" value=\"\" class=\"\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tmaxlength=\"50\" name=\"PHONE\" id=\"PHONE\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"FieldRow\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label>Website:</label> <input type=\"text\" value=\"\" class=\"\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tmaxlength=\"50\" name=\"WEBSITE\" id=\"WEBSITE\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"FieldRow\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label>Nội dung:<span class=\"RSM_form_star_color\">(*)</span></label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<textarea class=\"\" style=\"width: 100%; height: 140px;\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tname=\"CONTENT\" id=\"CONTENT\"></textarea>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"FieldRow\" style=\"margin-top: 24px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input class=\"button_submit\" type=\"submit\" id=\"submit\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tname=\"submit\" value=\"Gửi liên hệ\"> <input\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"button_submit\" type=\"reset\" id=\"submit\" name=\"submit\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tvalue=\"Nhập lại\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"clr\"></div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"footer\">\r\n");
      out.write("\t\t\t<div class=\"main-content\">\r\n");
      out.write("\t\t\t\t<p class=\"fl\">\r\n");
      out.write("\t\t\t\t\tCopyright &copy; 2017. <span>VinaEnter Edu</span> giữ toàn\r\n");
      out.write("\t\t\t\t\tquyền.\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t<div class=\"search fl\">&nbsp;</div>\r\n");
      out.write("\t\t\t\t<div class=\"backtotop fr\">\r\n");
      out.write("\t\t\t\t\t<a href=\"#totop\" title=\"\">Về đầu trang</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"clr\"></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
