package xyz.vaith.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import xyz.vaith.domain.Book;

import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("/json")
public class JsonController {
    @RequestMapping("/testRequestBody")
    public void setJson(@RequestBody Book book, HttpServletResponse response) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        book.setAuthor("Wee");
        System.out.println(book);
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().println(mapper.writeValueAsString(book));
    }

    @RequestMapping("/testResponseBody")
    @ResponseBody
    public Object getJson() {
        List<Book> list = new ArrayList<Book>();
        list.add(new Book(1, "spring mvc 企业级实战", "小文姬"));
        list.add(new Book(2, "javaee", "Wee"));
        return list;
    }

    @RequestMapping(value = "/xml", method = RequestMethod.POST)
    public void sendxml(@RequestBody Book book) {
        System.out.println(book);
    }

    @RequestMapping(value = "/readxml", method = RequestMethod.POST)
    public @ResponseBody Book readXml() throws Exception {
        JAXBContext context = JAXBContext.newInstance(Book.class);
        Unmarshaller unmar = context.createUnmarshaller();
        InputStream is = this.getClass().getResourceAsStream("/book.xml");
        Book book = (Book) unmar.unmarshal(is);
        return book;
    }
}
