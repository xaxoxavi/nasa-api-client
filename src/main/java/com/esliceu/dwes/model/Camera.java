package com.esliceu.dwes.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * "camera": {
 *          "id": 20,
 *          "name": "FHAZ",
 *          "rover_id": 5,
 *          "full_name": "Front Hazard Avoidance Camera"
 *          }
 *
 */
public class Camera {

    private Integer id;
    private CameraName name;

    private Integer roverId;
    private String fullName;

    public Integer getRoverId() {
        return roverId;
    }

    @JsonProperty("rover_id")
    public void setRoverId(Integer roverId) {
        this.roverId = roverId;
    }

    public String getFullName() {
        return fullName;
    }

    @JsonProperty("full_name")
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public CameraName getName() {
        return name;
    }

    public void setName(CameraName name) {
        this.name = name;
    }
}
