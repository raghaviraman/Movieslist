package com.example.movielist;


import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Movielistcontroller {
	
	
		@RequestMapping("/movie")
		public List<Movie> getMovieinfo() {
			List<Movie> all=new ArrayList<Movie>();
			all.add(new Movie(1,"Spiderman Homecoming"));
			all.add(new Movie(2,"Iron Man 1"));
			
			return all;
		}
		
}

