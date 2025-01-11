package com.Service;

import com.Dao.ProductDao;

public class ProductService {
	
	public void InsertData() {
	 ProductDao pd=new ProductDao();
	 pd.InsertData();
	
	}
	public void GetSingleRecord() {
		ProductDao pd=new ProductDao();
		 pd.GetSingleRecord();
	}
	
	public void DeleteData() {
		ProductDao pd=new ProductDao();
		 pd.DeleteData();
	}
	
	public void UpdateData() {
		ProductDao pd=new ProductDao();
		 pd.UpdateData();
		
	}
	
	public void FetchAll() {
		ProductDao pd=new ProductDao();
		 pd.FetchAll();
	}

}





