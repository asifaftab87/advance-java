package org.mysql.conn.main;

import java.util.List;

import org.mysql.conn.model.Address;
import org.mysql.conn.model.Emp;
import org.mysql.conn.util.SqlUtil;

public class EmpAddMain {

	public static void main(String[] args) {
		
		SqlUtil.connectionOpen();
		
		List<Emp> list = SqlUtil.read();
		
		if(list!=null && !list.isEmpty()) {
			
			for(Emp emp : list) {
				System.out.println("id: "+emp.getId()+"    name: "+emp.getName()+"         age: "+emp.getAge());
				Address address = emp.getAddress();
				
				if(address!=null) {
					System.out.println("address: "+address.getId()+"  "+address.getEmpId()+"   " +address.getCity()+"  "+address.getState()+"  "+address.getCountry());
				}
			}
		}
		else {
			System.out.println("no emp found");
		}
	}
}
