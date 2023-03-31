package org.example.mvc;

import org.example.mvc.controller.Controller;

public interface HandlerMapping {
    Object findHandler(HandlerKey handlerKey); // 애노테이션 형태도 받기위해서 Controller -> Object 로 리턴 타입 변경.
}
