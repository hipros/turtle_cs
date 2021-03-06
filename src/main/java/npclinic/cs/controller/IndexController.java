package npclinic.cs.controller;

import com.google.gson.Gson;
import npclinic.cs.dto.user.UserDTO;
import npclinic.cs.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;

//@Controller 밑에 @RequestMapping("/board") 라고 써주면
//이 controller는 www.npclinic.com/board로 시작하는 모든 url을 담는다
//메서드에 @GetMapping("/news") 면 요청 url은 www.npclinic.com/board/news가 된다
@Controller
public class IndexController {

    /*
    UserService는 인터페이스다.
    UserService의 구현체는 NormalUserService와 VipUserService이다
    그런데 여기서 UserService를 사용했다.
    그러면 이 UserService는 Normal인지 Vip인지 모른다
    아래 @Qualifier는 UserService가 무엇을 사용할지 정한다.
     */


    @GetMapping("/") // 클라이언트의 요청 url
    public String index(Model model){
        return "index";
    }



}
