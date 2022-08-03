package exercise.B2;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Manager {
    List<Document> list;

    public Manager() {
        this.list = new ArrayList<>();
    }

    public void add(Document document) {
        this.list.add(document);
    }

    public void deleteDocumentByID(String id) {
        Document doc = this.list.stream().filter(document -> document.getId().equals(id))
                .findFirst().orElse(null);
        if (doc == null) {
            System.out.println("No document has id = " + id);
            return;
        }
        this.list.remove(doc);
    }

    public void showDocument() {
        this.list.forEach(document -> System.out.println(document.toString()));
        return;
    }

    public void showDocumentEachType() {
        System.out.println("List of Book:");
        this.list.stream().filter(doc -> doc instanceof Book).forEach(doc -> System.out.println(doc.toString()));
        System.out.println("List of Journal:");
        this.list.stream().filter(doc -> doc instanceof Journal).forEach(doc -> System.out.println(doc.toString()));
        System.out.println("List of Paper:");
        this.list.stream().filter(doc -> doc instanceof Paper).forEach(doc -> System.out.println(doc.toString()));
    }
}
