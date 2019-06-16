package cctv.come.controller;

import cctv.domain.User;
import org.springframework.jmx.support.ObjectNameManager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/user")
public class UserController {


  /*  @RequestMapping(value="/quick23")
    @ResponseBody
    public void save23(String username, MultipartFile[] uploadFile) throws IOException {
        System.out.println(username);
        for (MultipartFile multipartFile : uploadFile) {
            String originalFilename = multipartFile.getOriginalFilename();
            multipartFile.transferTo(new File("C:\\upload\\"+originalFilename));
        }
    }

    @RequestMapping(value="/quick22")
    @ResponseBody
    public void save22(String username, MultipartFile uploadFile,MultipartFile uploadFile2) throws IOException {
        System.out.println(username);
        //获得上传文件的名称
        String originalFilename = uploadFile.getOriginalFilename();
        uploadFile.transferTo(new File("C:\\upload\\"+originalFilename));
        String originalFilename2 = uploadFile2.getOriginalFilename();
        uploadFile2.transferTo(new File("C:\\upload\\"+originalFilename2));
    }

    @RequestMapping(value="/quick21")
    @ResponseBody
    public void save21(@CookieValue(value = "JSESSIONID") String jsessionId) throws IOException {
        System.out.println(jsessionId);
    }

    @RequestMapping(value="/quick20")
    @ResponseBody
    public void save20(@RequestHeader(value = "User-Agent",required = false) String user_agent) throws IOException {
        System.out.println(user_agent);
    }


    @RequestMapping(value="/quick19")
    @ResponseBody
    public void save19(HttpServletRequest request, HttpServletResponse response, HttpSession session) throws IOException {
        System.out.println(request);
        System.out.println(response);
        System.out.println(session);
    }

    @RequestMapping(value="/quick18")
    @ResponseBody
    public void save18(Date date) throws IOException {
        System.out.println(date);
    }

    // localhost:8080/user/quick17/zhangsan
    @RequestMapping(value="/quick17/{name}")
    @ResponseBody
    public void save17(@PathVariable(value="name") String username) throws IOException {
        System.out.println(username);
    }

    @RequestMapping(value="/quick16")
    @ResponseBody
    public void save16(@RequestParam(value="name",required = false,defaultValue = "itcast") String username) throws IOException {
        System.out.println(username);
    }

    @RequestMapping(value="/quick15")
    @ResponseBody
    public void save15(@RequestBody List<User> userList) throws IOException {
        System.out.println(userList);
    }

    @RequestMapping(value="/quick14")
    @ResponseBody
    public void save14(VO vo) throws IOException {
        System.out.println(vo);
    }


    @RequestMapping(value="/quick13")
    @ResponseBody
    public void save13(String[] strs) throws IOException {
        System.out.println(Arrays.asList(strs));
    }

    @RequestMapping(value="/quick12")
    @ResponseBody
    public void save12(User user) throws IOException {
        System.out.println(user);
    }

    @RequestMapping(value="/quick11")
    @ResponseBody
    public void save11(String username,int age) throws IOException {
        System.out.println(username);
        System.out.println(age);
    }

    @RequestMapping(value="/quick10")
    @ResponseBody
    //期望SpringMVC自动将User转换成json格式的字符串
    public User save10() throws IOException {
        User user = new User();
        user.setUsername("lisi2");
        user.setAge(32);

        return user;
    }

    @RequestMapping(value="/quick9")
    @ResponseBody
    public String save9() throws IOException {
        User user = new User();
        user.setUsername("lisi");
        user.setAge(30);
        //使用json的转换工具将对象转换成json格式字符串在返回
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(user);

        return json;
    }



    }*/

    @RequestMapping("/like8")
    @ResponseBody   //告知springmvc 框架 不进行试图跳转
    public String show8(User user){
        user.setAge(18);
        user.setUsername("aini");
       return null;
    }







    @RequestMapping("/like7")
    @ResponseBody   //告知springmvc 框架 不进行试图跳转
    public String show7(){
        return "{\"username\":\"wwww\",\"age\":18}";
    }

    @RequestMapping("/like6")
  @ResponseBody   //告知springmvc 框架 不进行试图跳转
  public String show6(){
      return "hello world";
  }




  @RequestMapping("/like5")
  public void show5(HttpServletResponse request) throws IOException {
      request.getWriter().print("zouni");

  }



 @RequestMapping("/like4")
  public String show4(HttpServletRequest request){
      request.setAttribute("username","qqqqq");

      //return "/jsp/success.jsp";
     return "success";

  }



  @RequestMapping("/like3")
  public String show3(Model s){

      s.addAttribute("username","66666");
      return "/success.jsp";


  }






    @RequestMapping("/like2")
    public ModelAndView show2(ModelAndView s){
        s.addObject("username","come on");
        s.setViewName("success.jsp");

        return s;
    }



    @RequestMapping("/like1")
    public String show1(User user){

        System.out.println(user);


        return "success.jsp";
    }


    @RequestMapping("/like")
    public String show(){
        System.out.println("zouno");


        return "success.jsp";
    }
}
