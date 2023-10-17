	
	Feature: User Roles
	  Admin role: Manage products, categories, and user accounts.
	  Customer role: Browse products, make purchases, and view orders.
	  Installer role: View installation requests and schedule appointments

 ##Admin Roles
 
 ##1
 Scenario: Admin adds a new product to the catalog
  Given an admin is logged into their account
  When the admin clicks on the Add New Product button
  And adds a new product with details
  Then the product is added to the catalog
  And users can see the new product in the main page
  
  ##2
  Scenario: Admin edits an existing product
  Given an admin is logged into their account
  When the admin clicks on the edit product button
  And selects an existing product for editing
  And updates the product details
  Then the product's information is updated
  
  ##3
  Scenario: Admin deletes a product from the catalog
  Given an admin is logged into their account
  When the admin clicks on the delete button
  And selects a product for deletion
  Then the product is removed from the catalog
  And users can no longer see the deleted product
  
  ##4
  Scenario: Admin edits an existing category
  Given an admin is logged into their account
  When the admin navigates to the category management section
  And selects an existing category for editing
  And updates the category name
  Then the category's information is updated
  
  ##5
  Scenario: Admin deletes a category from the system
  Given an admin is logged into their account
  When the admin navigates to the category management section
  And selects a category for deletion
  Then the category is removed from the list of product categories
  
  ##6
  Scenario: Admin manages user accounts
  Given an admin is logged into their account
  When the admin accesses the user account management section
  And creates a new user account
  Then the user account is created
  And the admin can edit or delete user accounts
  
  
  ##Customer Roles 
  
  ##1
	Scenario: Customer views detailed product information
	  Given a customer is logged into their account
	  When the customer clicks on a specific product in the catalog
	  Then the customer can see detailed information about the selected product
	  And can read product descriptions, view images, and check pricing and availability
  
  ##2
	Scenario: Customer Adds Products to Cart and Completes Purchase
		Given a customer is logged into their account and has products in the catalog
		When the customer adds selected products to their shopping cart, proceeds to checkout,provides shipping and payment information, and confirms the purchase
		Then the selected products are added to the customer's cart, and the order is confirmed.
	 
  ##3
 	Scenario: Customer checks their order history
	  Given a customer is logged into their account
	  When the customer visits their account dashboard
	  And selects the "Order History" section
	  Then the customer can see a list of their previous orders
	  And can click on an order to view its details
	  
  
  ## Installer role
  
	 Scenario: As an installer, I want to view installation requests and schedule appointments.
	
	  Given an installer is logged into their account
	  When the installer accesses the installation requests section
	  Then the installer can view a list of pending installation requests
	  And can click on a specific request to view its details
	  And the installer can schedule an appointment for the installation request
	  And confirm the appointment scheduling
	  Then the appointment is added to the installer's schedule
  
  
  
  
  
  