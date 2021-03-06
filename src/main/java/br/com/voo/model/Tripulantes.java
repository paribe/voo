package br.com.voo.model;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Tripulantes {

	private long id;
	@SerializedName("name")
	@Expose
	private String name;
	@SerializedName("height")
	@Expose
	private String height;
	@SerializedName("mass")
	@Expose
	private String mass;
	@SerializedName("hair_color")
	@Expose
	private String hairColor;
	@SerializedName("skin_color")
	@Expose
	private String skinColor;
	@SerializedName("eye_color")
	@Expose
	private String eyeColor;
	@SerializedName("birth_year")
	@Expose
	private String birthYear;
	@SerializedName("gender")
	@Expose
	private String gender;
	@SerializedName("homeworld")
	@Expose
	private String homeworld;
	@SerializedName("films")
	@Expose
	private List<String> films = null;
	@SerializedName("species")
	@Expose
	private List<String> species = null;
	@SerializedName("vehicles")
	@Expose
	private List<String> vehicles = null;
	@SerializedName("starships")
	@Expose
	private List<String> starships = null;
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
	public Tripulantes() {
	}

	/**
	 * 
	 * @param edited
	 * @param starships
	 * @param birthYear
	 * @param species
	 * @param films
	 * @param hairColor
	 * @param skinColor
	 * @param url
	 * @param mass
	 * @param height
	 * @param created
	 * @param eyeColor
	 * @param name
	 * @param gender
	 * @param homeworld
	 * @param vehicles
	 */
	public Tripulantes(String name, String height, String mass, String hairColor, String skinColor, String eyeColor,
			String birthYear, String gender, String homeworld, List<String> films, List<String> species,
			List<String> vehicles, List<String> starships, String created, String edited, String url) {
		super();
		this.name = name;
		this.height = height;
		this.mass = mass;
		this.hairColor = hairColor;
		this.skinColor = skinColor;
		this.eyeColor = eyeColor;
		this.birthYear = birthYear;
		this.gender = gender;
		this.homeworld = homeworld;
		this.films = films;
		this.species = species;
		this.vehicles = vehicles;
		this.starships = starships;
		this.created = created;
		this.edited = edited;
		this.url = url;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getMass() {
		return mass;
	}

	public void setMass(String mass) {
		this.mass = mass;
	}

	public String getHairColor() {
		return hairColor;
	}

	public void setHairColor(String hairColor) {
		this.hairColor = hairColor;
	}

	public String getSkinColor() {
		return skinColor;
	}

	public void setSkinColor(String skinColor) {
		this.skinColor = skinColor;
	}

	public String getEyeColor() {
		return eyeColor;
	}

	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}

	public String getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(String birthYear) {
		this.birthYear = birthYear;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getHomeworld() {
		return homeworld;
	}

	public void setHomeworld(String homeworld) {
		this.homeworld = homeworld;
	}

	public List<String> getFilms() {
		return films;
	}

	public void setFilms(List<String> films) {
		this.films = films;
	}

	public List<String> getSpecies() {
		return species;
	}

	public void setSpecies(List<String> species) {
		this.species = species;
	}

	public List<String> getVehicles() {
		return vehicles;
	}

	public void setVehicles(List<String> vehicles) {
		this.vehicles = vehicles;
	}

	public List<String> getStarships() {
		return starships;
	}

	public void setStarships(List<String> starships) {
		this.starships = starships;
	}

	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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
		return new HashCodeBuilder().append(name).append(height).append(mass).append(hairColor).append(skinColor)
				.append(eyeColor).append(birthYear).append(gender).append(homeworld).append(films).append(species)
				.append(vehicles).append(starships).append(created).append(edited).append(url).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Tripulantes) == false) {
			return false;
		}
		Tripulantes rhs = ((Tripulantes) other);
		return new EqualsBuilder().append(name, rhs.name).append(height, rhs.height).append(mass, rhs.mass)
				.append(hairColor, rhs.hairColor).append(skinColor, rhs.skinColor).append(eyeColor, rhs.eyeColor)
				.append(birthYear, rhs.birthYear).append(gender, rhs.gender).append(homeworld, rhs.homeworld)
				.append(films, rhs.films).append(species, rhs.species).append(vehicles, rhs.vehicles)
				.append(starships, rhs.starships).append(created, rhs.created).append(edited, rhs.edited)
				.append(url, rhs.url).isEquals();
	}

}
