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
@Table(name="enrolment_inf")
public class Enrolment

{
	// �����ʶ����
	@Id @Column(name="enrolment_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer enrolmentId;
	// ����ѡ�μ�¼������ѧ��
	private int year;
	
// ����ѡ�μ�¼������ѧ��
	private int semester;
	// ����ѡ�μ�¼������ѧ��ʵ��
	@ManyToOne(targetEntity=Student.class)
	@JoinColumn(name="student_id")
	private Student student;
	// ����ѡ�μ�¼�����Ŀγ�ʵ��
	@ManyToOne(targetEntity=Course.class)
	@JoinColumn(name="course_code")
	private Course course;

	// enrolmentId��setter��getter����
	public void setEnrolmentId(Integer enrolmentId)
	{
		this.enrolmentId = enrolmentId;
	}
	public Integer getEnrolmentId()
	{
		return this.enrolmentId;
	}

	// year��setter��getter����
	public void setYear(int year)
	{
		this.year = year;
	}
	public int getYear()
	{
		return this.year;
	}

	// semester��setter��getter����
	public void setSemester(int semester)
	{
		this.semester = semester;
	}
	public int getSemester()
	{
		return this.semester;
	}

	// student��setter��getter����
	public void setStudent(Student student)
	{
		this.student = student;
	}
	public Student getStudent()
	{
		return this.student;
	}

	// course��setter��getter����
	public void setCourse(Course course)
	{
		this.course = course;
	}
	public Course getCourse()
	{
		return this.course;
	}
}