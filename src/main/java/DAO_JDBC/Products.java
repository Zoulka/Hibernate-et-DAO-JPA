package DAO_JDBC;

public class Products {

    private Long id;
    private String name;

    public Products(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

      // ici on va faire un toString. ca nous permet de recevoir l'information si on f appel à un objet
    @Override
    public String toString() {
        return "Products{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
