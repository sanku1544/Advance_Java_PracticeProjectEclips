package com.tka.feb_11;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	
		@Id
		private int eid;
		private String name;
		private String ctg;
		private double sal;
		public Employee() {
			// TODO Auto-generated constructor stub
		}
		public Employee(int eid, String name, String ctg, double sal) {
			super();
			this.eid = eid;
			this.name = name;
			this.ctg = ctg;
			this.sal = sal;
		}
		public int getEid() {
			return eid;
		}
		public void setEid(int eid) {
			this.eid = eid;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getCtg() {
			return ctg;
		}
		public void setCtg(String ctg) {
			this.ctg = ctg;
		}
		public double getSal() {
			return sal;
		}
		public void setSal(double sal) {
			this.sal = sal;
		}
		@Override
		public String toString() {
			return "Employee [eid=" + eid + ", name=" + name + ", ctg=" + ctg + ", sal=" + sal + "]";
		}
		
}
