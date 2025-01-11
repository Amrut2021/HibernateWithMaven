package com.Service;

import com.Dao.StudentDao;

public class StudentService {
	
	public void InsertData() {
	StudentDao sd=new StudentDao();
	sd.InsertData();
	}
	
	public void UpdateData() {
		StudentDao sd=new StudentDao();
		sd.UpdateData();
		
	}
	
	public void DeleteData() {
		StudentDao sd=new StudentDao();
		sd.DeleteData();
	
	}
	
	public void GetSingleRecord() {
		StudentDao sd=new StudentDao();
		sd.GetSingleRecord();
		
	}
	
	public void FetchAllRecord() {
		StudentDao sd=new StudentDao();
		sd.FetchAllRecord();
		
	}

}
