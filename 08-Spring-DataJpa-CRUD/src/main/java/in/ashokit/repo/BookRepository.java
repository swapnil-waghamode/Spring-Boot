package in.ashokit.repo;



import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import in.ashokit.entity.Book;

public interface BookRepository extends CrudRepository<Book, Integer>{

/* 
  select * from book where book_price > : price  --> internally perform this query for below method
  which is created by us
*/
/*
 * public List<Book> findByBookPriceGreaterThan(Double price);
 * 
 * // select * from book where book_price < : price
 * 
 * public List<Book> findByBookPriceLessThan(Double price);
 * 
 * public List<Book> findByBookName(String bookName);
 */
	
//	custom query 
	
	// native sql
	@Query(value="select * from book" , nativeQuery = true)
	public List<Book> getAllBooks();
	
	// hql query
	
	@Query("from Book")
	public List<Book> getBooks();
	
	
}
