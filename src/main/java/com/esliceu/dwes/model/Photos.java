package com.esliceu.dwes.model;

import java.util.List;

public class Photos {
    private List<Photo> photos;

    public List<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }

    public Integer getSize(){
        return photos.size();
    }
}
