package com.Controller;

import com.Service.StudentService;

public class StudentController {
	
	public static void main(String[] args) {
		StudentService ss=new StudentService();
//	ss.InsertData();
//		ss.UpdateData();
//	ss.DeleteData();
//	ss.FetchAllRecord();
	ss.GetSingleRecord();
	}

}
