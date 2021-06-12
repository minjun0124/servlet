package hello.servlet.web.frontcontroller.v3;

import hello.servlet.web.frontcontroller.ModelView;

import java.util.Map;

/**
 * v3: Model 추가
 * 서블릿 종속성 제거
 * 뷰 이름 중복 제거
 */
public interface ControllerV3 {
    ModelView process(Map<String, String> paramMap);
}
