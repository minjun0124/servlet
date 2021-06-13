package hello.servlet.web.springmvc.old;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * HandlerMapping - 우선 순위
 * 0 = RequestMappingHandlerMapping : 애노테이션 기반의 컨트롤러인 @RequestMapping 에서 사용 (여기서는 없으니까 무시)
 * 1 = BeanNameUrlHandlerMapping : 스프링 빈의 이름으로 핸들러를 찾는다. (여기에 해당. 아래의 Bean 을 찾아서 반환)
 *
 * HandlerAdapter
 * 0 = RequestMappingHandlerAdapter   : 애노테이션 기반의 컨트롤러인 @RequestMapping 에서 사용 
 * 1 = HttpRequestHandlerAdapter      : HttpRequestHandler 처리
 * 2 = SimpleControllerHandlerAdapter : Controller 인터페이스(애노테이션 X, 과거에 사용) 처리 (여기에 해당)
 *
 * 아래의 Override 된 handleRequest 는
 * SimpleControllerHandlerAdapter - handle - handleRequest 에 해당
 *
 * HandleMapping 에서 OldController 라는 핸들러를 반환
 * HandlerAdapter 에서 Controller 인터페이스의 support 를 통해 adapter 를 반환하고
 * 이 adapter 를 통해 OldController 라는 핸들러를 실행.
 */
@Component("/springmvc/old-controller") // spring bean의 이름을 urlpattern으로 맞춘 것.
public class OldController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("OldController.handleRequest");
        return null;
    }
}
