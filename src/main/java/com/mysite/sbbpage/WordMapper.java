package com.mysite.sbbpage;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface WordMapper {
	List<Word> getWordList(@Param("offset") int offset,@Param("size") int size);
	Integer countTotal();
	Word getWordById(Integer id);
}
