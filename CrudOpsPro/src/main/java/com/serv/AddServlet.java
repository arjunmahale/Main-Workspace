package com.serv;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig; // ✅ Required for file upload
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;

import com.bean.Student;
import com.db.DBConnection;

@WebServlet("/AddServlet")
@MultipartConfig(  // ✅ This is REQUIRED for multipart form uploads
    fileSizeThreshold = 1024 * 1024 * 2,   // 2MB
    maxFileSize = 1024 * 1024 * 10,        // 10MB
    maxRequestSize = 1024 * 1024 * 50      // 50MB
)
public class AddServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        res.setContentType("text/html");
        PrintWriter writer = res.getWriter();

        String sname = req.getParameter("sname");
        String smobile = req.getParameter("smobile");
        String sclass = req.getParameter("sclass");
        String semail = req.getParameter("semail");

        Part partfile = req.getPart("simage"); // ✅ name="file" must match input field

        if (partfile == null) {
            writer.println("No file was uploaded. Please check your form.");
            return;
        }

        String fileName = Paths.get(partfile.getSubmittedFileName()).getFileName().toString();

        String projectPath = "C:\\Users\\Admin\\Documents\\GitHub\\Main-Workspace\\CrudOpsPro\\src\\main\\webapp\\images";
//        File uploadDir = new File(projectPath);
//        if (!uploadDir.exists()) uploadDir.mkdirs();


        String savePath = projectPath + File.separator + fileName;
        partfile.write(savePath); // ✅ Uploads the file to target folder
        
        String realPath = getServletContext().getRealPath("/images");
        String savePath2 = realPath + File.separator + fileName;
        partfile.write(savePath2);

        Student student = new Student(sname, smobile, sclass, semail, fileName);
        int result = DBConnection.addstudent(student);

        if (result > 0) {
            res.sendRedirect("show.jsp");
        } else {
            writer.print("Error occurred while saving data.");
            writer.print("<a href=\"index.jsp\">Try again</a>");
        }
    }
}
