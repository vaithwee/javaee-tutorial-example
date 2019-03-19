package xyz.vaith.app.domain;

import java.util.*;
import javax.persistence.*;

@Entity
@Table(name = "person_inf")
public class Person
{
	@Id
	@Column(name = "person_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String name;

	private int age;

	@ManyToMany(targetEntity=MyEvent.class)
	@JoinTable(name = "person_event" ,
		joinColumns = @JoinColumn(name = "person_id"
			, referencedColumnName="person_id"),
        inverseJoinColumns = @JoinColumn(name = "event_id"
			, referencedColumnName="event_id")
	)
	private Set<MyEvent> myEvents
		= new HashSet<>();

	@ElementCollection(targetClass = String.class)
	@CollectionTable(name="email_inf",
		joinColumns=@JoinColumn(name="person_id" , nullable=false))
	@Column(name="email_detail" , nullable=false, length = 100)
	private Set<String> emails
		= new HashSet<>();

	public void setId(Integer id)
	{
		this.id = id;
	}
	public Integer getId()
	{
		return this.id;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}

	public void setAge(int age)
	{
		this.age = age;
	}
	public int getAge()
	{
		return this.age;
	}

	public void setMyEvents(Set<MyEvent> myEvents)
	{
		this.myEvents = myEvents;
	}
	public Set<MyEvent> getMyEvents()
	{
		return this.myEvents;
	}

	public void setEmails(Set<String> emails)
	{
		this.emails = emails;
	}
	public Set<String> getEmails()
	{
		return this.emails;
	}

	@Override
	public String toString() {
		return "Person{" +
				"id=" + id +
				", name='" + name + '\'' +
				", age=" + age +
				", myEvents=" + myEvents +
				", emails=" + emails +
				'}';
	}
}