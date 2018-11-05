package com.emc.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.emc.models.EduEmployee;
import com.emc.models.Employee;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

@Component
public class FilesUtil {
	private FilesUtil() {
	}
	final static private Logger logger = org.apache.log4j.LogManager.getLogger(FilesUtil.class);
	final static String fileName = "C:/Users/penumr/Documents/City-Parish_Employee_Annual_Salaries.csv";

	List<String> linesList = new ArrayList<>();
	static Set<EduEmployee> employees = new HashSet<>();

	public static Set<EduEmployee> getEmployees() {
		if (employees.size() == 0) {
			synchronized (employees) {
				if (employees.size() == 0) {
					employees = readEmployeesStream();
				}
			}
		}

		return employees;
	}

	public static void main(String[] args) {
		System.out.println("-- main---");
		new FilesUtil().readEmployeesStream();
	}

	private static EduEmployee readEmployeeStream(final String employeeNum) {
		logger.debug("employeeNum : " + employeeNum);
		logger.debug("employees size : " + employees.size());
		Optional<EduEmployee> eduEmployee = null;

		Stream<EduEmployee> s = employees.stream().filter((e) -> {

			return e.getEmployeeNum().equals(employeeNum);
		});

		eduEmployee = s.findFirst();
		return eduEmployee.get();
	}

	public static Set<EduEmployee> readEmployeesStream() {
		logger.info("START readFilewithStream ");
		 
		try (Stream<String> lines = Files.lines(Paths.get(fileName))) {

			lines.skip(1).forEach((s) -> {
				int count = 0;
				String[] words = s.split(",");
				EduEmployee employee = new EduEmployee(words[count++], words[count++], words[count++], words[count++],
						words[count++], words[count++], words[count++], words[count++], words[count++], words[count++],
						words[count++], words[count++], words[count++], words[count++], words[count++], words[count++],
						words[count++], words[count++], words[count++], words[count++], words[count++], words[count++],
						words[count++]

				);

//				logger.debug(employee.toString());
				employees.add(employee);

			});
			logger.debug("employees Size: " + employees.size());

		} catch (IOException e) {

		}
		logger.info("END readFilewithStream ");
		return employees;
	}

	public List<String> readCarsStream() {
		logger.info("START readFilewithStream ");

		try (Stream<String> lines = Files.lines(Paths.get(fileName))) {

			lines.skip(1).forEach((s) -> {
				int count = 0;
				String[] words = s.split(",");
				Employee employee = new Employee(words[count++], words[count++], words[count++], words[count++],
						words[count++], words[count++], words[count++], words[count++], words[count++], words[count++],
						words[count++], words[count++], words[count++], words[count++], words[count++], words[count++],
						words[count++], words[count++], words[count++], words[count++], words[count++], words[count++],
						words[count++]);

				logger.debug(employee.toString());

			});
			logger.debug("Size: " + employees.size());

		} catch (IOException e) {

		}
		logger.info("END readFilewithStream ");
		return linesList;
	}

	public List<String> readFileWithBufferedReader() {
		logger.info("START readFileWithBufferedReader ");

		try (BufferedReader bufferedReader = Files.newBufferedReader(Paths.get(fileName))) {
			linesList = bufferedReader.lines().collect(Collectors.toList());
		} catch (Exception e) {
			logger.error("ERROR while reading file in readFileWithBufferedReader");
		}
		logger.info("END readFileWithBufferedReader ");
		return linesList;
	}

	public List<String> readFileWithScaner() {
		logger.info("START readFileWithScaner ");
		try (Scanner scanner = new Scanner(new File(fileName))) {
			while (scanner.hasNextLine()) {
				linesList.add(scanner.nextLine());
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		logger.info("END readFileWithScaner ");
		return linesList;
	}

}
