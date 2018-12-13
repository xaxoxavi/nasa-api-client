package com.esliceu.dwes.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class Photo {

    private Integer id;
    private Integer sol;
    private Camera camera;
    private String imageSrc;
    private Date earthDate;
    private Rover rover;

    public String getImageSrc() {
        return imageSrc;
    }

    @JsonProperty("img_src")
    public void setImageSrc(String imageSrc) {
        this.imageSrc = imageSrc;
    }

    public Date getEarthDate() {
        return earthDate;
    }

    @JsonProperty("earth_date")
    @JsonFormat(
            shape = JsonFormat.Shape.STRING,
            pattern = "yyyy-MM-dd")
    public void setEarthDate(Date earthDate) {
        this.earthDate = earthDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSol() {
        return sol;
    }

    public void setSol(Integer sol) {
        this.sol = sol;
    }

    public Camera getCamera() {
        return camera;
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }

    public Rover getRover() {
        return rover;
    }

    public void setRover(Rover rover) {
        this.rover = rover;
    }
}
