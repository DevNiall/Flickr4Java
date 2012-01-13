/*
 * Copyright (c) 2005 Aetrion LLC.
 */
package com.flickr4java.flickr.photos;

import com.flickr4java.flickr.photos.Photo;

/**
 * @author Anthony Eden
 */
public class PhotoContext {
	private static final long serialVersionUID = 12L;

    private Photo previousPhoto;
    private Photo nextPhoto;

    public PhotoContext() {

    }

    public Photo getPreviousPhoto() {
        return previousPhoto;
    }

    public void setPreviousPhoto(Photo previousPhoto) {
        this.previousPhoto = previousPhoto;
    }

    public Photo getNextPhoto() {
        return nextPhoto;
    }

    public void setNextPhoto(Photo nextPhoto) {
        this.nextPhoto = nextPhoto;
    }

}