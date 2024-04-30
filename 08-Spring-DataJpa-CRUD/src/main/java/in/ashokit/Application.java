package in.ashokit;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.Book;
import in.ashokit.repo.BookRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
		BookRepository repo = run.getBean(BookRepository.class);
//		System.out.println(repo.getClass().getName());

//		Adding data to table

		/*
		 * Book b = new Book(); b.setBookId(101); b.setBookName("Spring");
		 * b.setBookPrice(1200.00);
		 * 
		 * repo.save(b);
		 */


//		Adding multiple obj at a time 
		
		Book b = new Book();
		b.setBookId(101);
		b.setBookName("Java");
		b.setBookPrice(1500.00);

		Book b1 = new Book();
		b1.setBookId(102);
		b1.setBookName("Microservices");
		b1.setBookPrice(1500.00);
		
		Book b2 = new Book();
		b2.setBookId(103);
		b2.setBookName("Angular");
		b2.setBookPrice(800.00);
		
		repo.saveAll(Arrays.asList(b,b1,b2));
		
	
		
//		checking is record available in project
		
//		boolean status = repo.existsById(104);
//		
//        System.out.println("Record exist " + status);
		
//		check number of records in table
		
//		long count = repo.count();
//		System.out.println("number of record in table "+ count);
		
//		Retrieving data
		
//		Optional<Book> byId = repo.findById(102);
//		if(byId.isPresent()) {
//			System.out.println(byId.get());
//		}

//		Retrieving list of data
		
		/*
		 * Iterable<Book> allById = repo.findAllById(Arrays.asList(101,102,103));
		 * 
		 * for(Book book : allById) { System.out.println(book); }
		 */

		
//		findAll()
		/*
		 * Iterable<Book> all = repo.findAll();
		 * 
		 * for(Book bk : all) { System.out.println(bk); }
		 */
		
		
//		Deleting records
		
//		repo.deleteById(103);
		
//		boolean existsById = repo.existsById(103);
//		
//		if(existsById == false) {
//			System.out.println("Record not available");
//		}
		
//		repo.deleteAll();
		
		
//		find all books whose price > 1000 
		
//		by creating our own method according to which query will be created in background
//		List<Book> bPGT = repo.findByBookPriceGreaterThan(1000.00);
//		
//		for(Book bk : bPGT) {
//			System.out.println(bk);
//		}
//		
//		List<Book> bPLT = repo.findByBookPriceLessThan(1000.00);
//		
//		for(Book bk : bPLT) {
//			System.out.println(bk);
//		}
		
		
/*		findByBookName
		List<Book> bBN = repo.findByBookName("Java");
		
		for(Book bk : bBN) {
			System.out.println(bk);
		}
	*/
		
//		Native query
		
		 repo.getBooks();
		
//		for(Book ab : books) {
//			
//			System.out.println(ab);
//		}
		
		
	}

}
