package xyz.vaith.app.domain;

import java.util.*;
import javax.persistence.*;

@Entity
@Table(name="event_inf")
public class MyEvent {

	@Id @Column(name="event_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	private String title;

	private Date happenDate;

	@ManyToMany(targetEntity=Person.class , mappedBy="myEvents")
	private Set<Person> actors
		= new HashSet<>();


	public void setId(Integer id)
	{
		this.id = id;
	}
	public Integer getId()
	{
		return this.id;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}
	public String getTitle()
	{
		return this.title;
	}

	public void setHappenDate(Date happenDate)
	{
		this.happenDate = happenDate;
	}
	public Date getHappenDate()
	{
		return this.happenDate;
	}

	public void setActors(Set<Person> actors)
	{
		this.actors = actors;
	}
	public Set<Person> getActors()
	{
		return this.actors;
	}
}