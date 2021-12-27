package models;

public class Post {
    @Id// defines this variable as the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer Id;
    String message;
    Integer authorId;  //Foreign Key to User table
    Integer likes;



}
