/***
 * Excerpted from "Functional Programming Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/mbfpp for more book information.
***/
package com.yourtion.Pattern11.ex1;

public class FavoriteVideosService {

	private VideoService videoService;
	private FavoritesService favoritesService;
	
	private FavoriteVideosService(VideoService videoService, 
			FavoritesService favoritesService){
		this.videoService = videoService;
		this.favoritesService = favoritesService;
	}
}
