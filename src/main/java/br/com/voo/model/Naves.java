package br.com.voo.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Naves {

	private long id;
	@SerializedName("name")
	@Expose
	private String name;
	@SerializedName("model")
	@Expose
	private String model;
	@SerializedName("manufacturer")
	@Expose
	private String manufacturer;
	@SerializedName("cost_in_credits")
	@Expose
	private String costInCredits;
	@SerializedName("length")
	@Expose
	private String length;
	@SerializedName("max_atmosphering_speed")
	@Expose
	private String maxAtmospheringSpeed;
	@SerializedName("crew")
	@Expose
	private String crew;
	@SerializedName("passengers")
	@Expose
	private String passengers;
	@SerializedName("cargo_capacity")
	@Expose
	private String cargoCapacity;
	@SerializedName("consumables")
	@Expose
	private String consumables;
	@SerializedName("hyperdrive_rating")
	@Expose
	private String hyperdriveRating;
	@SerializedName("MGLT")
	@Expose
	private String mGLT;
	@SerializedName("starship_class")
	@Expose
	private String starshipClass;
	@SerializedName("pilots")
	@Expose
	private List<Object> pilots = null;
	@SerializedName("films")
	@Expose
	private List<String> films = null;
	@SerializedName("created")
	@Expose
	private String created;
	@SerializedName("edited")
	@Expose
	private String edited;
	@SerializedName("url")
	@Expose
	private String url;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public Naves() {
	}

	/**
	 * 
	 * @param edited
	 * @param model
	 * @param cargoCapacity
	 * @param crew
	 * @param films
	 * @param url
	 * @param starshipClass
	 * @param passengers
	 * @param pilots
	 * @param created
	 * @param consumables
	 * @param hyperdriveRating
	 * @param manufacturer
	 * @param costInCredits
	 * @param mGLT
	 * @param name
	 * @param length
	 * @param maxAtmospheringSpeed
	 */
	public Naves(String name, String model, String manufacturer, String costInCredits, String length,
			String maxAtmospheringSpeed, String crew, String passengers, String cargoCapacity, String consumables,
			String hyperdriveRating, String mGLT, String starshipClass, List<Object> pilots, List<String> films,
			String created, String edited, String url) {
		super();
		this.name = name;
		this.model = model;
		this.manufacturer = manufacturer;
		this.costInCredits = costInCredits;
		this.length = length;
		this.maxAtmospheringSpeed = maxAtmospheringSpeed;
		this.crew = crew;
		this.passengers = passengers;
		this.cargoCapacity = cargoCapacity;
		this.consumables = consumables;
		this.hyperdriveRating = hyperdriveRating;
		this.mGLT = mGLT;
		this.starshipClass = starshipClass;
		this.pilots = pilots;
		this.films = films;
		this.created = created;
		this.edited = edited;
		this.url = url;
	}

	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getmGLT() {
		return mGLT;
	}

	public void setmGLT(String mGLT) {
		this.mGLT = mGLT;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getCostInCredits() {
		return costInCredits;
	}

	public void setCostInCredits(String costInCredits) {
		this.costInCredits = costInCredits;
	}

	public String getLength() {
		return length;
	}

	public void setLength(String length) {
		this.length = length;
	}

	public String getMaxAtmospheringSpeed() {
		return maxAtmospheringSpeed;
	}

	public void setMaxAtmospheringSpeed(String maxAtmospheringSpeed) {
		this.maxAtmospheringSpeed = maxAtmospheringSpeed;
	}

	public String getCrew() {
		return crew;
	}

	public void setCrew(String crew) {
		this.crew = crew;
	}

	public String getPassengers() {
		return passengers;
	}

	public void setPassengers(String passengers) {
		this.passengers = passengers;
	}

	public String getCargoCapacity() {
		return cargoCapacity;
	}

	public void setCargoCapacity(String cargoCapacity) {
		this.cargoCapacity = cargoCapacity;
	}

	public String getConsumables() {
		return consumables;
	}

	public void setConsumables(String consumables) {
		this.consumables = consumables;
	}

	public String getHyperdriveRating() {
		return hyperdriveRating;
	}

	public void setHyperdriveRating(String hyperdriveRating) {
		this.hyperdriveRating = hyperdriveRating;
	}

	public String getMGLT() {
		return mGLT;
	}

	public void setMGLT(String mGLT) {
		this.mGLT = mGLT;
	}

	public String getStarshipClass() {
		return starshipClass;
	}

	public void setStarshipClass(String starshipClass) {
		this.starshipClass = starshipClass;
	}

	public List<Object> getPilots() {
		return pilots;
	}

	public void setPilots(List<Object> pilots) {
		this.pilots = pilots;
	}

	public List<String> getFilms() {
		return films;
	}

	public void setFilms(List<String> films) {
		this.films = films;
	}

	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public String getEdited() {
		return edited;
	}

	public void setEdited(String edited) {
		this.edited = edited;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(name).append(model).append(manufacturer).append(costInCredits)
				.append(length).append(maxAtmospheringSpeed).append(crew).append(passengers).append(cargoCapacity)
				.append(consumables).append(hyperdriveRating).append(mGLT).append(starshipClass).append(pilots)
				.append(films).append(created).append(edited).append(url).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Naves) == false) {
			return false;
		}
		Naves rhs = ((Naves) other);
		return new EqualsBuilder().append(name, rhs.name).append(model, rhs.model)
				.append(manufacturer, rhs.manufacturer).append(costInCredits, rhs.costInCredits)
				.append(length, rhs.length).append(maxAtmospheringSpeed, rhs.maxAtmospheringSpeed)
				.append(crew, rhs.crew).append(passengers, rhs.passengers).append(cargoCapacity, rhs.cargoCapacity)
				.append(consumables, rhs.consumables).append(hyperdriveRating, rhs.hyperdriveRating)
				.append(mGLT, rhs.mGLT).append(starshipClass, rhs.starshipClass).append(pilots, rhs.pilots)
				.append(films, rhs.films).append(created, rhs.created).append(edited, rhs.edited).append(url, rhs.url)
				.isEquals();
	}

}