package org.example.searchbookmark.service;

import org.example.searchbookmark.model.vo.KeywordSearch;
import org.springframework.stereotype.Service;

import java.util.List;

//@Service // Spring Container에 Component로 등록
public interface SearchService {
    List<KeywordSearch> searchByKeyword(String keyword) throws Exception;

}
