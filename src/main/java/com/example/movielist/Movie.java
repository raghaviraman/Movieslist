package com.example.movielist;

public class Movie {
public int id;
public String movieName;
public Movie(int id, String movieName) {
	super();
	this.id = id;
	this.movieName = movieName;
}
public Movie() {}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getMovieName() {
	return movieName;
}
public void setMovieName(String movieName) {
	this.movieName = movieName;
}
@Override
public String toString() {
	return "Movie [id=" + id + ", movieName=" + movieName + "]";
}


}
