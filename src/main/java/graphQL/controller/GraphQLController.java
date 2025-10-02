package graphQL.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GraphQLController {

	@GetMapping("/")
    public String index() {
        return "index.html";
    }

    @GetMapping("/user")
    public String userPage() {
        return "user.html";
    }

    @GetMapping("/category")
    public String categoryPage() {
        return "category.html";
    }

    @GetMapping("/product")
    public String productPage() {
        return "product.html";
    }
    // Similar updateUser/updateCategory/updateProduct implementations can be added
}
