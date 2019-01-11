package com.esliceu.dwes;


import com.esliceu.dwes.model.CameraName;
import com.esliceu.dwes.model.Photos;
import com.esliceu.dwes.model.RoverName;
import org.springframework.web.client.RestTemplate;

import java.text.MessageFormat;
import java.util.Arrays;
import java.util.List;


public class RoversApi implements Rovers {

    public RoversApi(RestTemplate restTemplate,String urlBase,String apiKey){
        this.restTemplate = restTemplate;
        this.urlBase = urlBase;
        this.apiKey = apiKey;
    }

    private RestTemplate restTemplate;
    private String urlBase;
    private String apiKey;

    public void setUrlBase(String urlBase) {
        this.urlBase = urlBase;
    }

    public Photos getPhotos(RoverName roverName, Integer sol, CameraName camera){
       return getPhotos(roverName,sol,camera,null);

    }

    public Photos getPhotos(RoverName roverName, Integer sol, CameraName camera, Integer page) {
        StringBuilder url = new StringBuilder();
        url.append(MessageFormat.format(urlBase,roverName.toString().toLowerCase(),sol,apiKey));
        if (camera != null) url.append("&camera=").append(camera.name());
        if (page != null) url.append("&page=").append(page);

        return restTemplate.getForObject(url.toString(), Photos.class);
    }

    public List<CameraName> getAllCameraNames(){
        return Arrays.asList(CameraName.values());
    }

    public List<RoverName> getAllRoverNames(){
        return Arrays.asList(RoverName.values());
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }
}
