package com.esliceu.dwes;

import com.esliceu.dwes.model.CameraName;
import com.esliceu.dwes.model.Photos;
import com.esliceu.dwes.model.RoverName;

import java.util.List;

public interface Rovers {

    Photos getPhotos(RoverName roverName, Integer sol, CameraName camera);

    Photos getPhotos(RoverName roverName, Integer sol, CameraName camera, Integer page);

    List<CameraName> getAllCameraNames();

    List<RoverName> getAllRoverNames();
}
