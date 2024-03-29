package de.test.openapishowcase;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

@Path("zoo")
public class ZooResource {
	@Schema(description = "JSON wrapper for a list of animals")
	public static class JsonAnimalList extends JsonData<JsonItems<Animal>> {
		public JsonAnimalList(List<Animal> items, int totalItems) {
			super(new JsonItems<Animal>(items, totalItems));
		}
	}

	@GET
	public JsonAnimalList loadAnimals() {
		List<Animal> animals = new ArrayList<>();
		animals.add(new Animal("Leo the tiger", 7));
		animals.add(new Animal("Joe the wolf", 11));

		return new JsonAnimalList(animals, animals.size());
	}
}
