package com.Controller;

import com.Service.ProductService;

public class ProductController {

	public static void main(String[] args) {
		ProductService ps=new ProductService();
//		ps.InsertData();
//	    ps.GetSingleRecord();
//		ps.DeleteData();
//		ps.UpdateData();
	    ps.FetchAll();

	}

}
