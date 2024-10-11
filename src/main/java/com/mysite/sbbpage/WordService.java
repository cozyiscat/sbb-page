package com.mysite.sbbpage;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WordService {
	@Autowired
	private WordMapper wordMapper;

	public PageDTO getWordList(int page, int size){
		int offset = (page - 1) * size;
		List<Word> content = wordMapper.getWordList(offset, size);
		int totalElements = wordMapper.countTotal();
		int totalPages =(int)Math.ceil((double) totalElements/size);
		//select * from table limit x offset y;
		PageDTO pageDTO = new PageDTO(page, size, totalPages, totalElements, content);
		return pageDTO ;
	}
	
	public Word getWordById(Integer id){
		return wordMapper.getWordById(id);
	}
}
