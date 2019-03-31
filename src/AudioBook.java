import java.util.Comparator;

public class AudioBook implements Comparable<AudioBook> {

    private int id;
    private String name;

    public AudioBook(int id, String name, String category) {
        this.id = id;
        this.name = name;
        this.category = category;
    }

    private String category;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public int compareTo(AudioBook o) {
        return this.getCategory().compareTo(o.getCategory());
    }
}
