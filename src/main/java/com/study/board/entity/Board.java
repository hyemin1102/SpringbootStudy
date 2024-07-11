package com.study.board.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String content;
    private String fileName;
    private String filePath;

    public String getTitle() { return title;}

    public String getContent() { return content;}

    public void setTitle(String title) {
        this.title = title;
    }
    public void setContent(String content) {
        this.content = content;
    }

    public String getFilename() { return fileName;}

    public String getFilepath() { return filePath;}

    public void setFilename(String fileName) {
        this.fileName = fileName;
    }

    public void setFilepath(String filePath) {
        this.filePath = filePath;
    }

}
