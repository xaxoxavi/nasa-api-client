package com.esliceu.dwes.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;

/**
 * "rover": {
 *          "id": 5,
 *          "name": "Curiosity",
 *          "landing_date": "2012-08-06",
 *          "launch_date": "2011-11-26",
 *          "status": "active",
 *          "max_sol": 2256,
 *          "max_date": "2018-12-11",
 *          "total_photos": 344298,
 *          "cameras": [
 *          {
 *          "name": "FHAZ",
 *          "full_name": "Front Hazard Avoidance Camera"
 *          },
 *          {
 *          "name": "NAVCAM",
 *          "full_name": "Navigation Camera"
 *          },
 *          {
 *          "name": "MAST",
 *          "full_name": "Mast Camera"
 *          },
 *          {
 *          "name": "CHEMCAM",
 *          "full_name": "Chemistry and Camera Complex"
 *          },
 *          {
 *          "name": "MAHLI",
 *          "full_name": "Mars Hand Lens Imager"
 *          },
 *          {
 *          "name": "MARDI",
 *          "full_name": "Mars Descent Imager"
 *          },
 *          {
 *          "name": "RHAZ",
 *          "full_name": "Rear Hazard Avoidance Camera"
 *          }
 *          ]
 *          }
 */
public class Rover {

    private Integer id;
    private RoverName name;
    private Date landingDate;
    private Date launchDate;
    private String status;
    private Integer maxSol;
    private Date maxDate;
    private Integer totalPhotos;
    private List<Camera> cameras;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public RoverName getName() {
        return name;
    }

    public void setName(RoverName name) {
        this.name = name;
    }

    public Date getLandingDate() {
        return landingDate;
    }

    @JsonProperty("landing_date")
    @JsonFormat(
            shape = JsonFormat.Shape.STRING,
            pattern = "yyyy-MM-dd")
    public void setLandingDate(Date landingDate) {
        this.landingDate = landingDate;
    }

    public Date getLaunchDate() {
        return launchDate;
    }

    @JsonProperty("launch_date")
    @JsonFormat(
            shape = JsonFormat.Shape.STRING,
            pattern = "yyyy-MM-dd")
    public void setLaunchDate(Date launchDate) {
        this.launchDate = launchDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getMaxSol() {
        return maxSol;
    }

    @JsonProperty("max_sol")
    public void setMaxSol(Integer maxSol) {
        this.maxSol = maxSol;
    }

    public Date getMaxDate() {
        return maxDate;
    }
    @JsonProperty("max_date")
    @JsonFormat(
            shape = JsonFormat.Shape.STRING,
            pattern = "yyyy-MM-dd")
    public void setMaxDate(Date maxDate) {
        this.maxDate = maxDate;
    }

    public Integer getTotalPhotos() {
        return totalPhotos;
    }

    @JsonProperty("total_photos")
    public void setTotalPhotos(Integer totalPhotos) {
        this.totalPhotos = totalPhotos;
    }

    public List<Camera> getCameras() {
        return cameras;
    }

    public void setCameras(List<Camera> cameras) {
        this.cameras = cameras;
    }
}
