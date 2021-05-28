package com.pastebin.pastebin;
import javax.persistence.*;

@Entity
@Table(name = "pastes")
public class Pastebin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String paste_text;

    public Pastebin() {
    }

    public Pastebin(Long id, String title, String paste_text) {
        this.id = id;
        this.title = title;
        this.paste_text = paste_text;
    }

    public Pastebin(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPaste_text() {
        return paste_text;
    }

    public void setPaste_text(String paste_text) {
        this.paste_text = paste_text;
    }
}
