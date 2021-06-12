package hello.servlet.web.frontcontroller.v4;

import java.util.Map;

public interface ControllerV4 {
    /**
     * v4: 단순하고 실용적인 컨트롤러
     * v3와 유사하나 구현 입장에서 ModelView를 직접 생성해서 반환하지 않도록 편리한 인터페이스를 제공
     * @param paramMap
     * @param model
     * @return viewName
     */
    String process(Map<String, String> paramMap, Map<String, Object> model);
}
