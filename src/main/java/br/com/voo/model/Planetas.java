package br.com.voo.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Planetas {
    private long id;
	@SerializedName("name")
	@Expose
	private String name;
	@SerializedName("rotation_period")
	@Expose
	private String rotationPeriod;
	@SerializedName("orbital_period")
	@Expose
	private String orbitalPeriod;
	@SerializedName("diameter")
	@Expose
	private String diameter;
	@SerializedName("climate")
	@Expose
	private String climate;
	@SerializedName("gravity")
	@Expose
	private String gravity;
	@SerializedName("terrain")
	@Expose
	private String terrain;
	@SerializedName("surface_water")
	@Expose
	private String surfaceWater;
	@SerializedName("population")
	@Expose
	private String population;
	@SerializedName("residents")
	@Expose
	private List<Object> residents = null;
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
	public Planetas() {
	}

	/**
	 * 
	 * @param edited
	 * @param terrain
	 * @param diameter
	 * @param orbitalPeriod
	 * @param films
	 * @param url
	 * @param created
	 * @param rotationPeriod
	 * @param name
	 * @param surfaceWater
	 * @param climate
	 * @param gravity
	 * @param population
	 * @param residents
	 */
	public Planetas(String name, String rotationPeriod, String orbitalPeriod, String diameter, String climate,
			String gravity, String terrain, String surfaceWater, String population, List<Object> residents,
			List<String> films, String created, String edited, String url) {
		super();
		this.name = name;
		this.rotationPeriod = rotationPeriod;
		this.orbitalPeriod = orbitalPeriod;
		this.diameter = diameter;
		this.climate = climate;
		this.gravity = gravity;
		this.terrain = terrain;
		this.surfaceWater = surfaceWater;
		this.population = population;
		this.residents = residents;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRotationPeriod() {
		return rotationPeriod;
	}

	public void setRotationPeriod(String rotationPeriod) {
		this.rotationPeriod = rotationPeriod;
	}

	public String getOrbitalPeriod() {
		return orbitalPeriod;
	}

	public void setOrbitalPeriod(String orbitalPeriod) {
		this.orbitalPeriod = orbitalPeriod;
	}

	public String getDiameter() {
		return diameter;
	}

	public void setDiameter(String diameter) {
		this.diameter = diameter;
	}

	public String getClimate() {
		return climate;
	}

	public void setClimate(String climate) {
		this.climate = climate;
	}

	public String getGravity() {
		return gravity;
	}

	public void setGravity(String gravity) {
		this.gravity = gravity;
	}

	public String getTerrain() {
		return terrain;
	}

	public void setTerrain(String terrain) {
		this.terrain = terrain;
	}

	public String getSurfaceWater() {
		return surfaceWater;
	}

	public void setSurfaceWater(String surfaceWater) {
		this.surfaceWater = surfaceWater;
	}

	public String getPopulation() {
		return population;
	}

	public void setPopulation(String population) {
		this.population = population;
	}

	public List<Object> getResidents() {
		return residents;
	}

	public void setResidents(List<Object> residents) {
		this.residents = residents;
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
		return new HashCodeBuilder().append(name).append(rotationPeriod).append(orbitalPeriod).append(diameter)
				.append(climate).append(gravity).append(terrain).append(surfaceWater).append(population)
				.append(residents).append(films).append(created).append(edited).append(url).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Planetas) == false) {
			return false;
		}
		Planetas rhs = ((Planetas) other);
		return new EqualsBuilder().append(name, rhs.name).append(rotationPeriod, rhs.rotationPeriod)
				.append(orbitalPeriod, rhs.orbitalPeriod).append(diameter, rhs.diameter).append(climate, rhs.climate)
				.append(gravity, rhs.gravity).append(terrain, rhs.terrain).append(surfaceWater, rhs.surfaceWater)
				.append(population, rhs.population).append(residents, rhs.residents).append(films, rhs.films)
				.append(created, rhs.created).append(edited, rhs.edited).append(url, rhs.url).isEquals();
	}

}
