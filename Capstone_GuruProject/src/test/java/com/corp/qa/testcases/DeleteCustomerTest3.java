package com.corp.qa.testcases;

import java.io.IOException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.corp.qa.base.Base;
import Delete_Customer.DeleteCustomer;

public class DeleteCustomerTest3 extends Base {
public DeleteCustomer dc;
public DeleteCustomerTest3() throws IOException {
super();
// TODO Auto-generated constructor stub
}
@BeforeMethod
public void SSetUp() throws IOException, InterruptedException {
dc = new DeleteCustomer();
}
@Test
public void validateDelete() throws IOException {
dc.deleteOperation( prop.getProperty("invalidId")); }
}