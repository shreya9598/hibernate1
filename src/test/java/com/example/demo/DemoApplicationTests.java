package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
//import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Sort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;

import com.example.demo.entities.Product;
import com.example.demo.repos.EmployeeRepository;
import com.example.demo.repos.ProductRepository;

@SpringBootTest
class DemoApplicationTests {
	
	@Autowired
	 EmployeeRepository er;

	 @Autowired
	 ProductRepository repository;

	@Test
	void contextLoads() {
	}

	

	//  @Test
	// public void testCreate(){
	// 	Product product = new Product();
		
	// 	product.setId(2);
	// 	product.setName("Iwatch");
	// 	product.setDescription("Awesome watch");
	// 	product.setPrice(15000d);
		
	// 	repository.save(product);
	// }

	// @Test
	// public void testRead(){
	// 	Product product =repository.findById(1).get();
	// 	assertNotNull(product);
	// 	assertEquals("Iphone", product.getName());
	// }

	// @Test
	// public void testUpdate(){
	// 	Product product =repository.findById(1).get();
	// 	product.setPrice(1200d);

	// 	repository.save(product);
	// }

	// @Test
	// public void testDelete(){
	// 	if(repository.existsById(1)){
	// 		repository.deleteById(1);
	// 	}
	// }

	// @Test
	// public void testCount(){
	// 	repository.count();
	// }

	
	

	// @Test
	// public void testFindByName(){
	// 	List<Product> products = repository.findByName("Iwatch");
	// 	products.forEach(p-> System.out.println(p.getPrice()));
	// }
	
	// @Test
	// public void testFindByNameAndDesc(){
	// 	List<Product> products = repository.findByNameAndDesc("Iwatch","Awesomw watch");
	// 	products.forEach(p-> System.out.println(p.getPrice()));
	// }

	// @Test
	// public void testFindByPriceGreaterThan(){
	// 	List<Product> products = repository.findByPriceGreaterThan(500d);
	// 	products.forEach(p-> System.out.println(p.getName()));
	// }

	// @Test
	// public void testFindByDescContains(){
	// 	List<Product> products = repository.findByDescContains("I");
	// 	products.forEach(p-> System.out.println(p.getName()));
	// }

	// @Test
	// public void testFindByPriceBetween(){
	// 	List<Product> products = repository.findByPriceBetween(200d, 2000d);
	// 	products.forEach(p-> System.out.println(p.getName()));
	// }


	// @Test
	// public void testFindByDescLike(){
	// 	List<Product> products = repository.findByDescLike("% I %");
	// 	products.forEach(p-> System.out.println(p.getName()));
	// }

	// @Test
	// public void testFindByIdsIn(){
	//	Pageable pageable= new PageRequest(1,2);
	// 	List<Product> products = repository.findByIdIn(Arrays.asList(1,2),pageable);
	// 	products.forEach(p-> System.out.println(p.getName()));
	// }



	
	

		@Test
		public void testFindAllPaging(){
			Pageable pageable = PageRequest.of(0,1);   //pagenumber,size
			
			Page<Product> results= repository.findAll(pageable);
			results.forEach(p->System.out.println(p.getName()));

		}

		@Test
		public void testFindAllSorting(){
			repository.findAll(Sort.by(new Sort.Order(Direction.DESC, "name") ));
			//repository.findAll(new Sort(Direction.DESC,"name","price")).forEach(p->System.out.println(p.getName()));
		}

		@Test
		public void testFindAllPagingAndSorting(){
			Pageable pageable = PageRequest.of(0,1);
		
			repository.findAll(pageable).forEach(p->System.out.println(p.getName()));
		}



















	// @Test
	//  public void testCreate(){
	//  	Employee employee = new Employee();
		
	//  	employee.setName("John");
		
	//  	er.save(employee);
	//  }
}
