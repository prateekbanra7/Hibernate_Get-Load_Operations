package in.abc.main;

import java.io.IOException;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import in.abc.Model.Employee;
import in.abc.util.HibernateUtil;

public class SelectRecordUsingLoad {

	public static void main(String[] args) throws IOException {

		Session session = HibernateUtil.getSession();
		Employee employee = null;
		int id = 7;

		try {
			if (session != null)
				employee = session.load(Employee.class, id);
			if (employee != null) {
				System.out.println("EID    is :: " + employee.getEmpId());
				System.in.read();
				System.out.println("Name   is :: " + employee.getEmpName());
				System.out.println("Salary is :: " + employee.getEmpSal());
			} else
				System.out.println("Employee record not available for the given id ::" + id);
		} catch (HibernateException e) {
			System.out.println(employee);
			System.out.println("Employee record not found for the given id ::" + id);
		}
	}
}
