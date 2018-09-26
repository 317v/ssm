package cap.controller;

import cap.model.User;
import cap.service.ArticleService;
import cap.util.PageControl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;


@Controller
@RequestMapping("/article")
public class ArticleController {
    @Resource
    private ArticleService artService;

    @RequestMapping(value = "/manage")
    public String manage(Model model, HttpServletRequest request){
        int userId=Integer.parseInt(request.getParameter("userId"));
        String curPage=request.getParameter("curPage");
        User u=(User) request.getSession().getAttribute("user");
        PageControl pc =artService.getArtilcePageByUserId(curPage,userId);
        model.addAttribute("artList",pc.getList());
        model.addAttribute("curPage",pc.getCurPage());
        model.addAttribute("totalPages",pc.getTotalPages());
        model.addAttribute("user",u);
        return "ArticleManage";

    }
}
