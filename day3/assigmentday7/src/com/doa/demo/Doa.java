package com.doa.demo;

public interface Doa {
	public Emp findEmpById(int id);

	public String save(Emp e);

	public String update(Emp e);

	public String delete(int empId);

	public List<Emp> listAll();
}
