package ObjectsAndClassesExercise.Articles2;

public class Articles2 {

    String title;
    String content;
    String author;

    public Articles2(String title,String content, String author){
        this.title=title;
        this.content=content;
        this.author=author;
    }

    public String getTitle() {
        return title;
    }
    public String getContent() {
        return content;
    }
    public String getAuthor() {
        return author;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void setContent(String content){
        this.content = content;
    }
    public void setAuthor(String author){
        this.author = author;
    }

    @Override
    public String toString() {
        return String.format("%s - %s: %s%n", this.title, this.content, this.author);    }
}
