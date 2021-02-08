package com.cos.book.service;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import com.cos.book.domain.BookRepository;



/*
 * 단위테스트 (service와 관련된 것들만 메모리에 띄우면 됨)
 * BoardRepository => 가짜 객체로 만들 수 있음
*/

@ExtendWith(MockitoExtension.class) //스프링부트로 환경 설정
public class BookServiceUnitTest {
	
	@InjectMocks //BookService객체가 만들어질 때 BookServiceUnitTest 파일에 @Mock로 등록된 모든 것들을 주입받는다.
	private BookService bookService;
	
	@Mock
	private BookRepository bookRepository;

	//저장하기
	
}
