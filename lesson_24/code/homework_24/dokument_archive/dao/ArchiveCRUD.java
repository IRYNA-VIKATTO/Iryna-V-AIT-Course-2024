package homework_24.dokument_archive.dao;

import homework_24.dokument_archive.model.Document;

public interface ArchiveCRUD {

    boolean addDocument(Document document);

    Document findDocument(long documentId);

    Document removeDocument(long documentId);

    int getSize();

    void printDocuments();

    Document findDocumentByAuthor(String author);


}
