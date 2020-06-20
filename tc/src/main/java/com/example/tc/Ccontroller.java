package com.example.tc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartException;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Controller
public class Ccontroller {
    @Autowired
    CourseServiceimpl courseService;
    @Autowired
    TotalServiceimpl totalService;
    private static final String UPLOADED_FOLDER = "C:/Users/CYH/Desktop/test";
    private static final String Downfile = "C:/Users/CYH/Desktop/test/学生签到信息.txt";
    @RequestMapping("")
    public String answer(Model model){
        List<Course> courses = courseService.getCourse();
        model.addAttribute("courses",courses);
        return "index";
    }
    @RequestMapping("/refresh")
    public String ref(Model model){
        List<Course> courses = courseService.getCourse();
        model.addAttribute("courses",courses);
        return "index";
    }
    @PostMapping("/addstu")
    public String addstu(@RequestParam("cno") String cno, @RequestParam("cname") String cname, @RequestParam("sname") String sname, @RequestParam("snumber") String snumber, Model model){
        courseService.addStu(new Course(cno, cname, sname, snumber));
        List<Course> courses = courseService.getCourse();
        model.addAttribute("courses",courses);
        return "index";
    }
    @RequestMapping("/delstu")
    public String delstu(String sname){
        courseService.delStu(sname);
        return "index";
    }
    @PostMapping("/upload")
    public String singleFileUpload(@RequestParam("file") MultipartFile file,
                                   RedirectAttributes redirectAttributes) throws IOException {
        if (file.isEmpty()) {
            redirectAttributes.addFlashAttribute("message", "Please select a file to upload");
            return "redirect:uploadStatus";
        }

        try {
            // Get the file and save it somewhere
            byte[] bytes = file.getBytes();
            Path path = Paths.get(UPLOADED_FOLDER + file.getOriginalFilename());
            Files.write(path, bytes);

            redirectAttributes.addFlashAttribute("message",
                    "You successfully uploaded '" + file.getOriginalFilename() + "'");

        } catch (IOException e) {
            e.printStackTrace();
        }
        InputStreamReader isr = new InputStreamReader(new FileInputStream(UPLOADED_FOLDER + file.getOriginalFilename()), "UTF-8");
        BufferedReader br = new BufferedReader(isr);
        String line = null;
        int count = 0;
        Course course = new Course("0","0","0","0");
        while ((line = br.readLine()) != null) {
            String[] arr = line.split(" ");
            if (arr.length >= 4) {
                course.setCno(arr[0]);
                course.setCname(arr[1]);
                course.setSname(arr[2]);
                course.setSnumber(arr[3]);
            }
            courseService.addStu(course);
            count++;
        }
        return "redirect:";
    }
    @ControllerAdvice
    public class GlobalExceptionHandler {

        @ExceptionHandler(MultipartException.class)
        public String handleError1(MultipartException e, RedirectAttributes redirectAttributes) {
            redirectAttributes.addFlashAttribute("message", e.getCause().getMessage());
            return "redirect:";
        }
    }
    @PostMapping("/down")
    public String down(){
        List<Total> totals = totalService.gettotal();
        FileWriter fw = null;

        try {
            fw = new FileWriter(Downfile,true);
            fw.write("课程号   课程名    姓名      手机号      签到次数\n");
            for(Total w : totals){
                String c = w.toString()+"\r\n";
                fw.write(c);
            }
            fw.close();
        } catch (IOException e1) {
            e1.printStackTrace();
            System.out.println("写入失败");
            System.exit(-1);
        }
        return "index";
    }
}
