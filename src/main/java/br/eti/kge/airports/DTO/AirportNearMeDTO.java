/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.eti.kge.airports.DTO;

import br.eti.kge.projections.AirportNearMeProjection;

/**
 *
 * @author DIT2B
 */
public class AirportNearMeDTO {
    private long id;
    private String name;
     private String city;
      private String iataCode;
       private double latitude;
       private double longitude;
       private double altitude;
       private double distanciaKM;
    
       public AirportNearMeDTO () {
       }
       
       public AirportNearMeDTO(AirportNearMeProjection airportProjection) {
           this.id = airportProjection.getId();
            this.name = airportProjection.getName();
            this.city= airportProjection.getCity();
            this.iataCode = airportProjection.getIataCode();
            this.latitude= airportProjection.getLatitude();
            this.longitude= airportProjection.getLongitude();
            this.altitude= airportProjection.getAltitude();
            this.distanciaKM= airportProjection.getDistanciaKM();      
       }
       
       public long getId() {
           return id;
       }
}
