package src.models;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

@XmlRootElement(name = "products")
@XmlAccessorType (XmlAccessType.NONE)
public class Products {

    @XmlElement(name = "product")
    private List<Product> products = null;

    public Stack<Product> getProducts() {
        var st = new Stack<Product>();
        st.addAll(products);
        return st;
    }

    public void setProducts(List<Product> persons) {
        this.products = persons;
    }

}


