package br.com.marcell.main;
import com.google.maps.DirectionsApi;
import com.google.maps.GeoApiContext;
import com.google.maps.model.DirectionsResult;

public class Main {
	public static void main(String[] args) throws Exception {
//		GeoApiContext context = new GeoApiContext().setApiKey("AIzaSyBoXdjkcMpc-bnwKfzb6XTPwD2799B1Mio");
//		String[] origins = {"Rua Petrarca Grisi 174 Cristo Redentor João Pessoa Paraiba"};
//		String[] destinations = {"Avenida Governador Argemiro de Figueiredo 1741 Jardim Oceania João Pessoa Paraiba"};
//		DistanceMatrix results =  DistanceMatrixApi.getDistanceMatrix(context, origins, destinations).awaitIgnoreError();
//		System.out.println(results.rows[0].elements[0].distance);
		
		

		GeoApiContext context = new GeoApiContext().setApiKey("AIzaSyBoXdjkcMpc-bnwKfzb6XTPwD2799B1Mio");
		String origin = "Rua Petrarca Grisi 174 Cristo Redentor João Pessoa Paraiba";
		String destination = "Avenida Governador Argemiro de Figueiredo 1741 Jardim Oceania João Pessoa Paraiba";
		String point1 = "Rua Juarez Távora Centro Santa Rita Paraiba";
		String point2 = "Rod. BR-230 27 KM Esplanada João Pessoa Paraiba";
		DirectionsResult results =  DirectionsApi.newRequest(context).origin(origin).destination(destination).optimizeWaypoints(true)
				.waypoints(point1, point2).awaitIgnoreError();
		for (int string : results.routes[0].waypointOrder) {
			System.out.println(string);
		}
	}
}
