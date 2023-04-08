import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import {Employee} from '../employee';
import { EmployeeService } from '../employee.service';
 @Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent implements OnInit{
  
   employees: Observable<Employee[]>;

  constructor(private employeeService: EmployeeService,private router: Router){
    
  }
  ngOnInit(): void {
    this.getEmployees();
  }

   getEmployees(){
    this.employees = this.employeeService.getEmployeesList();
      
    }

    employeeDetails(id: number){
      this.router.navigate(['employee-details',id]);
    }

    updateEmployee(id: number){
      this.router.navigate(['update-employee',id]);

    }

    deleteEmployee(id: number){
      this.employeeService.deleteEmployee(id).subscribe( data => {
        console.log(data);
        this.getEmployees();
      })
    }

}
