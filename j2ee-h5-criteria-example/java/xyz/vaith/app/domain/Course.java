package xyz.vaith.app.domain;

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
@Table(name="course_inf")
public class Course
{
	// ����γ̱�ŵĳ�Ա����������Ϊ��ʶ����
	@Id @Column(name="course_code")
	private String courseCode;
	// ����γ�����Ա����
	private String name;

	// �޲����Ĺ�����
	public Course()
	{
	}
	// ��ʼ��ȫ����Ա�����Ĺ�����
	public Course(String courseCode , String name)
	{
		this.courseCode = courseCode;
		this.name = name;
	}

	// courseCode��setter��getter����
	public void setCourseCode(String courseCode)
	{
		this.courseCode = courseCode;
	}
	public String getCourseCode()
	{
		return this.courseCode;
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

}