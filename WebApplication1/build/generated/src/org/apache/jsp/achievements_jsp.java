package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class achievements_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link href=\"css/achievement.css\" rel=\"stylesheet\" type = \"text/css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Optional theme -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap-theme.min.css\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Latest compiled and minified JavaScript -->\r\n");
      out.write("        <script src=\"http://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.11.1.min.js\"></script>\r\n");
      out.write("        <script src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("        <title>Achievements</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div id=\"achievementTop\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <div id=\"title\" align=\"center\">\r\n");
      out.write("                <font size=\"10\" color =\"white\" face=\"verdana\"><b>Achievements</b></font>\r\n");
      out.write("                <div class=\"dropdown\">\r\n");
      out.write("                    <button class=\"btn btn-default dropdown-toggle\" type=\"button\" id=\"dropdownMenu1\" data-toggle=\"dropdown\">\r\n");
      out.write("                        Dropdown <span class=\"caret\"></span>\r\n");
      out.write("                    </button>\r\n");
      out.write("                    <ul class=\"dropdown-menu\" role=\"menu\" aria-labelledby=\"dropdownMenu1\">\r\n");
      out.write("                        <li role=\"presentation\"><a role=\"menuitem\" tabindex=\"-1\" href=\"/WebApplication1/achievements.jsp\">Achievements / Badges</a></li>\r\n");
      out.write("                        <li role=\"presentation\"><a role=\"menuitem\" tabindex=\"-1\" href=\"/WebApplication1/adventure.jsp\">Play Adventure Mode</a></li>\r\n");
      out.write("                        <li role=\"presentation\"><a role=\"menuitem\" tabindex=\"-1\" href=\"/WebApplication1/leaderboard.jsp\">Leaderboard</a></li>\r\n");
      out.write("                        <li role=\"presentation\"><a role=\"menuitem\" tabindex=\"-1\" href=\"/WebApplication1/faq.jsp\">Ask a question / FAQ</a></li>\r\n");
      out.write("                        <li role=\"presentation\"><a role=\"menuitem\" tabindex=\"-1\" href=\"/WebApplication1/submission.jsp\">Submission</a></li>\r\n");
      out.write("                        <li role=\"presentation\" class=\"divider\"></li>\r\n");
      out.write("                        <li role=\"presentation\"><a role=\"menuitem\" tabindex=\"-1\" href=\"/WebApplication1/login.jsp\">Logout</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div id=\"homeRedirect\" style=\"cursor:pointer\" onclick=\"window.location = '/WebApplication1/homepage.jsp'\">>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"whitespace\"></div>\r\n");
      out.write("         <div id=\"image1\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"whitespace\"></div>\r\n");
      out.write("        <div id=\"image2\"></div>\r\n");
      out.write("        <div class=\"whitespace\"></div>\r\n");
      out.write("        <div id=\"image3\"></div>\r\n");
      out.write("        <div class=\"whitespace\"></div>\r\n");
      out.write("        <div id=\"image4\"></div>\r\n");
      out.write("        <div class=\"whitespace\"></div>\r\n");
      out.write("        <div id=\"image5\"></div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
