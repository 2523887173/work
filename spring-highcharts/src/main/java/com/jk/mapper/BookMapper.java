package com.jk.mapper;

import java.util.List;
import java.util.Map;

public interface BookMapper {
    List<Map<String, Object>> queryBook();

    List<Map<String, Object>> queryBookBing();

    List<Map<String, Object>> queryBookShuzhuang();

    List<Map<String, Object>> queryZhuxing();
}
