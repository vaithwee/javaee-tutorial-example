package xyz.vaith.app.domain;

import java.util.*;
import javax.persistence.*;
/**
 * Description:
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br/>Copyright (C), 2001-2018, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
@Entity
@Table(name="student_inf")
public class Student
{
	// ����ѧ��ѧ�ŵĳ�Ա����������Ϊ��ʶ����
	@Id @Column(name="student_id")
	private Integer studentNumber;
	// ����ѧ�������ĳ�Ա����
	private String name;
	// ��ѧ��������ѡ�μ�¼��Ӧ�Ĺ���ʵ��
	@OneToMany(targetEntity=Enrolment.class
		, mappedBy="student" , cascade=CascadeType.REMOVE)
	private Set<Enrolment> enrolments
		= new HashSet<>();

	// �޲����Ĺ�����
	public Student()
	{
	}
	// ��ʼ��ȫ����Ա�����Ĺ�����
	public Student(Integer studentNumber , String name)
	{
		this.studentNumber = studentNumber;
		this.name = name;
	}

	// studentNumber��setter��getter����
	public void setStudentNumber(Integer studentNumber)
	{
		this.studentNumber = studentNumber;
	}
	public Integer getStudentNumber()
	{
		return this.studentNumber;
	}

	// name��setter��getter����
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}

	// enrolments��setter��getter����
	public void setEnrolments(Set<Enrolment> enrolments)
	{
		this.enrolments = enrolments;
	}
	public Set<Enrolment> getEnrolments()
	{
		return this.enrolments;
	}
}