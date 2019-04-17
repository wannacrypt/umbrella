package kz.virtlabs.umbrella.controllers;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.*;

@RestController
public class VideoController {

    @GetMapping("/download")
    public void pullData(HttpServletResponse response) throws IOException {
        InputStream inputStream = new FileInputStream(new File("files/video.mp4"));

        response.addHeader("Content-disposition", "attachment;filename=video.mp4");
        response.setContentType("video/mp4");

        IOUtils.copy(inputStream, response.getOutputStream());
        response.flushBuffer();
    }

}
