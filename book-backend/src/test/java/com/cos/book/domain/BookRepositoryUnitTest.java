package com.cos.book.domain;

import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.transaction.annotation.Transactional;

/*
 * 단위 테스트 (DB 관련된 Bean이 IoC에 등록되면 됨)
 * @AutoConfigureTestDatabase = 실제 DB가 아닌 가짜 DB로 테스트, Replace.NONE 실제 DB로 테스트
*/

@Transactional
@AutoConfigureTestDatabase(replace = Replace.ANY) 
@DataJpaTest //jpa관련된것만 메모리에 뜸, Repository들을 다 IoC에 등록해줌
public class BookRepositoryUnitTest {

	@Autowired
	private BookRepository bookRepository;
}
