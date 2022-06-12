package basic.Article.controller;

import basic.Article.service.ArticleService;

import basic.Article.vo.ArticleVo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
@RequestMapping("/article")
public class ArticleController {

    private static final Logger logger = LoggerFactory.getLogger(ArticleController.class);

    private final ArticleService articleService;


    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }


    //등록 페이지 이동
    @RequestMapping("/write")
    public String writeGET(){
        logger.info("write GET....");
        return "/article/write";
    }

    //등록처리
    @RequestMapping(value = "/write", method = RequestMethod.POST)
    public String writePost(ArticleVo vo, RedirectAttributes redirectAttributes) throws Exception{
        logger.info("write Post......");
        logger.info(vo.toString());
        articleService.create(vo);
        redirectAttributes.addFlashAttribute("msg", "regSuccess");

        return "redirect:/article/list";

    }

    @RequestMapping(value="list", method = RequestMethod.GET)
    public String list(Model model) throws Exception{
        logger.info("read Article");
        model.addAttribute("articles", articleService.listAll());

        return "/article/list";
    }

    @RequestMapping(value="/read" , method = RequestMethod.GET)
    public String read(@RequestParam("articleNo") int articleNo, Model model) throws Exception{
        logger.info("read.....");
        model.addAttribute("article", articleService.read(articleNo));

        return "/article/read";
    }



}
