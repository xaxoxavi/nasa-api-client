package com.esliceu.dwes;

import com.esliceu.dwes.model.CameraName;
import com.esliceu.dwes.model.Photos;
import com.esliceu.dwes.model.RoverName;

import java.util.List;

public interface Rovers {

    Photos getPhotos(RoverName roverName, Integer sol, CameraName camera);

    List<CameraName> getAllCameraNames();

    List<RoverName> getAllRoverNames();
}
