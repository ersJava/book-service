package com.company.noteservice.model;


import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

public class Note {

    private Integer noteId;

    @NotNull(message = "Book ID must have a value")
    private Integer bookId;

    @Size(max = 255)
    @NotEmpty(message = "Please supply content for the note")
    private String note;

    public Integer getNoteId() {
        return noteId;
    }

    public void setNoteId(Integer noteId) {
        this.noteId = noteId;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Note)) return false;
        Note note1 = (Note) o;
        return Objects.equals(getNoteId(), note1.getNoteId()) &&
                getBookId().equals(note1.getBookId()) &&
                Objects.equals(getNote(), note1.getNote());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNoteId(), getBookId(), getNote());
    }

    @Override
    public String toString() {
        return "Note{" +
                "noteId=" + noteId +
                ", bookId=" + bookId +
                ", note='" + note + '\'' +
                '}';
    }
}
