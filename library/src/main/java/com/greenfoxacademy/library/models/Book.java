package com.greenfoxacademy.library.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name ="books")
public class Book {

  @Id
  @GeneratedValue
  private Integer id;
  private String title;
  private String author;
  @Column(name="isbn")
  private String ISBN;

  @OneToOne(mappedBy = "user_id")
  private List<User> borrowedBy;

  public Book() {
  }

  public Book(String author, String ISBN, List<User> borrowedBy) {
    this.author = author;
    this.ISBN = ISBN;
    this.borrowedBy = borrowedBy;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getISBN() {
    return ISBN;
  }

  public void setISBN(String ISBN) {
    this.ISBN = ISBN;
  }

  public List<User> getBorrowedBy() {
    return borrowedBy;
  }

  public void setBorrowedBy(List<User> borrowedBy) {
    this.borrowedBy = borrowedBy;
  }
}
