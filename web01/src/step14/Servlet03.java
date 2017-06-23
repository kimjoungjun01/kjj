package step14;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

@WebServlet("/step14/Servlet03")
@SuppressWarnings("serial")
public class Servlet03 extends HttpServlet{
  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    req.setCharacterEncoding("UTF-8"); // 한글받는 처리요 잊지마시지요
    
    DiskFileItemFactory itemFactory = new DiskFileItemFactory();
    ServletFileUpload multipartDataParser = new ServletFileUpload(itemFactory);
    
    
    try {
    
     List<FileItem> parts =  multipartDataParser.parseRequest(req);
     HashMap<String,FileItem> partMap = new HashMap<>();
     for (FileItem part : parts) {
       partMap.put(part.getFieldName(), part);
     }
     
     FileItem part = partMap.get("name");
     String name = part.getString("UTF-8");
     
     String file1 = partMap.get("file1").getName();
     String file2 = partMap.get("file2").getName();
     
     
     resp.setContentType("text/plain;charset=UTF-8");
     PrintWriter out = resp.getWriter();
     
     out.printf("name=%s\n", name);
     out.printf("file1=%s\n", file1);
     out.printf("file2=%s\n", file2);
     
    } catch (Exception e) {
      throw new ServletException(e);
    }
    
  }
}
