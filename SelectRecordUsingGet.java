package in.abc.main;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import in.abc.Model.Employee;
import in.abc.util.HibernateUtil;

public class SelectRecordUsingGet {

	public static void main(String[] args) {

		Session session = HibernateUtil.getSession();
		Employee employee = null;
		int id = 10;

		try {
			if (session != null)
				employee = session.get(Employee.class, id);
			if (employee != null)
				System.out.println(employee);
			else
				System.out.println("Employee record not available for the given id ::" + id);
		} catch (HibernateException e) {
			System.out.println(employee);
			System.out.println("Employee record not found for the given id ::" + id);
		}
	}
}
