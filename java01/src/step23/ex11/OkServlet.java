package step23.ex11;

import java.io.PrintStream;

public class OkServlet implements Command {

  public void service(PrintStream out) throws Exception {

    out.println("HTTP/1.1 200 OK");
    out.println("Server: BIT Server");
    out.println();
    out.println("<html>");
    out.println("<head>");
    out.println(" <meta charset='UTF-8'>");
    out.println(" <title>hello</title>");
    out.println("</head>");
    out.println("<body>");
    out.println(" <h1>/ok 를 요청하셨세요~</h1>");
    out.println("</body>");
    out.println("</html>");
    out.flush();
  }

}
