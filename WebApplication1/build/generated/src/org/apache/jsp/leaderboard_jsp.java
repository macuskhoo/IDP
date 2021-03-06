package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class leaderboard_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"css/main.css\" rel=\"stylesheet\" type = \"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("        <!-- Optional theme -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap-theme.min.css\">\n");
      out.write("\n");
      out.write("        <!-- Latest compiled and minified JavaScript -->\n");
      out.write("        <script src=\"http://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.11.1.min.js\"></script>\n");
      out.write("        <script src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js\"></script>\n");
      out.write("        <title>Leaderboard</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"top\">\n");
      out.write("            <div id=\"title\" align=\"center\">\n");
      out.write("                <font size=\"10\" color =\"white\" face=\"verdana\"><b>Leaderboard</b></font>\n");
      out.write("                <div class=\"dropdown\">\n");
      out.write("                    <button class=\"btn btn-default dropdown-toggle\" type=\"button\" id=\"dropdownMenu1\" data-toggle=\"dropdown\">\n");
      out.write("                        Dropdown <span class=\"caret\"></span>\n");
      out.write("                    </button>\n");
      out.write("                    <ul class=\"dropdown-menu\" role=\"menu\" aria-labelledby=\"dropdownMenu1\">\n");
      out.write("                        <li role=\"presentation\"><a role=\"menuitem\" tabindex=\"-1\" href=\"/WebApplication1/achievements.jsp\">Achievements / Badges</a></li>\n");
      out.write("                        <li role=\"presentation\"><a role=\"menuitem\" tabindex=\"-1\" href=\"/WebApplication1/adventure.jsp\">Play Adventure Mode</a></li>\n");
      out.write("                        <li role=\"presentation\"><a role=\"menuitem\" tabindex=\"-1\" href=\"/WebApplication1/leaderboard.jsp\">Leaderboard</a></li>\n");
      out.write("                        <li role=\"presentation\"><a role=\"menuitem\" tabindex=\"-1\" href=\"/WebApplication1/faq.jsp\">Ask a question / FAQ</a></li>\n");
      out.write("                        <li role=\"presentation\"><a role=\"menuitem\" tabindex=\"-1\" href=\"/WebApplication1/submission.jsp\">Submission</a></li>\n");
      out.write("                        <li role=\"presentation\" class=\"divider\"></li>\n");
      out.write("                        <li role=\"presentation\"><a role=\"menuitem\" tabindex=\"-1\" href=\"/WebApplication1/login.jsp\">Logout</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"homeRedirect\" style=\"cursor:pointer\" onclick=\"window.location = '/WebApplication1/homepage.jsp'\">>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div id=\"stripes\" align=\"center\">\n");
      out.write("            <div class=\"first\">\n");
      out.write("                <img src=\"./images/first.jpg\">\n");
      out.write("                <div id=\"stripes\" style=\"margin-top:0px\" align=\"center\">\n");
      out.write("                    <div class=\"first\">\n");
      out.write("                        <img src=\"./images/second.jpg\">\n");
      out.write("                        <div id=\"stripes\" style=\"margin-top:0px\">\n");
      out.write("                            <div class=\"first\">\n");
      out.write("                                <img src=\"./images/third.jpg\">\n");
      out.write("                                <div id=\"stripes\" style=\"margin-top:0px\">\n");
      out.write("                                    <div class=\"first\">\n");
      out.write("                                        <img src=\"./images/forth.jpg\">\n");
      out.write("                                        <div id=\"stripes\" style=\"margin-top:0px\">\n");
      out.write("                                            <div class=\"first\">\n");
      out.write("                                                <img src=\"./images/fifth.jpg\">\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
