package step14;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

@WebServlet("/step14/Servlet04")
@SuppressWarnings("serial")
public class Servlet04 extends HttpServlet{
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
      
      String name = partMap.get("name").getString("UTF-8");
      
      FileItem part = partMap.get("file1");
      
      String file1 = part.getName();
      ServletContext sc = this.getServletContext();
      
      File uploadFile = new File(sc.getRealPath("/step14/upload/" + file1));
      part.write(uploadFile);// 여기에 잠시 보관하라?
      
      part = partMap.get("file2");

      String file2 = partMap.get("file2").getName();
      uploadFile = new File(sc.getRealPath("/step14/upload/" + file2));
      part.write(uploadFile);
      

      

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
