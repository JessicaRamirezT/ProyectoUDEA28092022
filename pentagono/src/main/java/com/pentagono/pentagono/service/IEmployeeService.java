package com.pentagono.pentagono.service;

import com.pentagono.pentagono.model.Employee;

import java.util.List;

public interface IEmployeeService extends ICRUD<Employee, Long> {

  List<Employee> getAllEmployees();

  Employee saveEmployee(Employee employee);
  Employee getEmployeeById(long id);
  void deleteEmployeeById(Long id);


  Employee createEmployee(Employee employee);

  boolean saveOrUpdateEmpleado(Employee empl);

  boolean deleteEmployee(Long id);

  List<Employee> obtenerPorEmpresa(Long idEmployee);

  Employee createUser(Employee employee);
}
