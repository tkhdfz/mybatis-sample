package my.sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.processing.SupportedSourceVersion;

import my.sample.domain.model.Book;
import my.sample.domain.model.BookShelf;
import my.sample.domain.service.ProductService;

public class ProductSampleRun {

    public static void main(String[] args) {
        ProductSampleRun productSampleRun = new ProductSampleRun();
        productSampleRun.execute();
    }

    public void execute() {
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        ProductService productService = ctx.getBean(ProductService.class);

        Book param = new Book();
        param.setIsbn("isbn0000000001");
        param.setTitle("author:null, piblisher:null");
        param.setAuthor("");
        param.setPublisher("");

        productService.insertBook(param);

        param.setIsbn("isbn0000000002");
        param.setTitle("author:null, piblisher:empty");
        param.setAuthor(null);
        param.setPublisher(null);

        productService.insertBook(param);

        param.setIsbn("isbn0000000003");
        param.setTitle("author:empty, piblisher:null");
        param.setAuthor("");
        param.setPublisher(null);

        productService.insertBook(param);

        param.setIsbn("isbn0000000004");
        param.setTitle("author:empty, piblisher:empty");
        param.setAuthor("");
        param.setPublisher("");

        productService.insertBook(param);

        param.setIsbn("isbn0000000005");
        param.setTitle("title5");
        param.setAuthor("author5");
        param.setPublisher("publisher5");

        productService.insertBook(param);

        for (Book b : productService.findAll()) {
            System.out.println(b);
        }

        param.setAuthor("");
        param.setPublisher("null");

        productService.updateBook(param);

        for (Book b : productService.findAll()) {
            System.out.println(b);
        }

    }
}
