package org.liferayasif.service;

import org.liferayasif.model.Task;
import org.liferayasif.repository.*;
import java.sql.Date;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;


public class TaskService {

	public TaskService() {
		TaskRepository.ConnectionOpen();
	}
	
	public static List<Task> read() {

		List<Task> taskList = TaskRepository.read();

		for (Task task : taskList) {

			Date dob = task.getDob();
			int age = getAgeFromDate(dob);
			task.setAge(age);
		}
		return taskList;
	}

	public static int getAgeFromDate(Date dob) {

		Calendar calendar = new GregorianCalendar();
		calendar.setTime(dob);

		int year = calendar.get(Calendar.YEAR);
		// Add one to month {0 - 11}
		int month = calendar.get(Calendar.MONTH) + 1;
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		// convert date to age
		LocalDate birth = LocalDate.of(year, month, day);
		LocalDate current = LocalDate.now();

		int age = Period.between(birth, current).getYears();
		return age;
	}

	public void create(Task task) {
		TaskRepository.create(task);
	}

	public static void delete() {
		TaskRepository.delete();
	}

	public static void update() {
		TaskRepository.update();
	}

	public static List<Task> filter() {
		// age >= 30
		List<Task> taskList = TaskRepository.read();
		List<Task> filterList = new ArrayList<>();
		for (Task task : taskList) {
			if (task.getAge() > 25 && task.getGender()) {
				filterList.add(task);
			}
		}
		return filterList;
	}

	
}