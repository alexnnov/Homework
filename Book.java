import java.util.Arrays;
import java.util.Objects;

public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty=0;
    public Book(String name, Author[] authors, double price){
        this.name=name;
        this.authors=authors;
        this.price=price;
    }
    public Book(String name, Author[] authors, double price,int qty){
        this.name=name;
        this.authors=authors;
        this.price=price;
        this.qty=qty;
    }
    public String getName(){
        return name;
    }
    public Author[] getAuthors(){
        return authors;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public int getQty(){
        return qty;
    }
    public void setQty(int qty){
        this.qty=qty;
    }
    public String authorsToString(){
        String s="{";
        for(int i=0;i<authors.length;i++){
            s=s+"Author[name="+authors[i].getName()+",";
            s=s+"email="+authors[i].getEmail()+",";
            s=s+"gender="+authors[i].getGender()+"]";
            if(i!=authors.length-1){
                s=s+",";
            }
        }
        s=s+"}";
        return s;
    }
    public String toString(){
        return "Book[name="+name+", authors="+authorsToString()+",price="+price+", qty="+qty+"]";
    }
    public String getAuthorsName(){
        String names="";
        for(int i=0;i<authors.length;i++){
            names=names+authors[i].getName();
            if(i!=authors.length-1){
                names=names+",";
            }
        }
        return names;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return Double.compare(book.getPrice(), getPrice()) == 0 &&
                getQty() == book.getQty() &&
                getName().equals(book.getName()) &&
                Arrays.equals(getAuthors(), book.getAuthors());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getName(), getPrice(), getQty());
        result = 31 * result + Arrays.hashCode(getAuthors());
        return result;
    }
}

