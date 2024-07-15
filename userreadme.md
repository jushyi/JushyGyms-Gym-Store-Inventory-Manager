# User Guide for Running the Application from a User Perspective
## Introduction
This guide will walk users through the application functions and how to use them.

### Main Screen
Once the user navigates to the website this will be the first page they will see. Here users can see the part and product information and have options for adding, updating, or deleting parts and products. Users can also filter through or search for parts and products.


#### Adding a Part
1. To add a part, select either “Add In House Part” to add an in-house part or “Add Outsourced Part” to add an outsourced part. The processes for these two parts are very similar so we will discuss them as one and explain the small difference as we go along.
2. Once one option has been selected you will be redirected to the form for the parts. The only difference between the two forms is that the outsourced part form has an extra field for the company name where the part was sourced from.
3. Once all of the fields in the form have been filled out, select “Submit”. To go back to the main screen select “Back to Main Screen”. WARNING: If you select “Back to Main Screen” the information you typed in will not be saved.

NOTE: There are a couple of validations in the form that will not allow you to submit and save the part. If the “Amount in Inventory” number is lower than the “Minimum Amount in Inventory” number you will get a warning. If the “Minimum Amount in Inventory” number is bigger than the “Maximum Amount in Inventory” you will get a warning. Please ensure these fields are correct. These validations ensure accurate data is presented on the main screen and are used in the validation of the product data.
4. Once you select “Submit” you will be redirected to a confirmation page. This page will automatically redirect you to the main screen after 2 seconds, or you can click “Back to Main Screen” to go back to the main screen.

#### Updating a Part
1. From the main screen find the part you would like to update and select the “Update” button. To help find a part use the search feature. Type in the keyword in the “Filter:” box and select “Search”.
2. Once “Update” has been selected you will be redirected to the form for the part. This form will show you the information for the current part. If you select “Back to Main Screen” you will be taken back to the main screen and the part will not be updated.  Update the form as needed and select “Submit” to save the updated information.

NOTE: There are a couple of validations in the form that will not allow you to submit and save the part. If the “Amount in Inventory” number is lower than the “Minimum Amount in Inventory” number you will get a warning. If the “Minimum Amount in Inventory” number is bigger than the “Maximum Amount in Inventory” you will get a warning. Please ensure these fields are correct. These validations ensure accurate data is presented on the main screen and are used in the validation of the product data.
3. Once you select “Submit” you will be redirected to a confirmation page. This page will automatically redirect you to the main screen after 2 seconds, or you can click “Back to Main Screen” to go back to the main screen.

#### Delete a Part
1. From the main screen find the part you would like to delete and select the “Delete” button. To help find a part use the search feature. Type in the keyword in the “Filter:” box and select “Search”.
2. A popup will ask you to confirm that you want to delete this part. If you are sure select “OK” and you will be taken to the delete confirmation page. This page will automatically redirect you to the main screen after 2 seconds, or you can click “Back to Main Screen” to go back to the main screen.
3. On the main screen, you will see that the part is no longer listed.

NOTE: There is a validation for deleting a part. If the part is currently associated with a product, you will be taken to the error screen stating you cannot delete a part used in a product.

#### Adding a Product
1. To add a product, select the “Add Product” button on the main screen.
2. This will take you to the add product form.

3. On the form the first thing you must do is set the name, price, and stock amount for this product.  To go back to the main screen select “Back to Main Screen”. WARNING: If you select “Back to Main Screen” the information you typed in will not be saved.
4. Click “Submit” to save this product. You will be redirected to a confirmation page. This page will automatically redirect you to the main screen after 2 seconds, or you can click “Back to Main Screen” to go back to the main screen.

NOTE: You cannot associate parts with a product before saving. To associate parts with a product see the instructions for updating a product below.

#### Updating a Product
1. From the main screen find the product you would like to update and select the “Update” button. To help find a product use the search feature. Type in the keyword in the “Filter:” box and select “Search”.
2. Once “Update” has been selected you will be redirected to the form for the product. This form will show you the information for the current part. If you select “Back to Main Screen” you will be taken back to the main screen and the product will not be updated.  
3. To associate parts with a product, find the part you want to associate in the “Available Parts” table and select “Add”. This will move the part into the “Associated Parts” table. To un-associate a part with a product, find the part you want to un-associate in the “Associated Parts” table and select “Remove”.
4. To save changes, select “Submit” and you will be taken to a confirmation page. This page will automatically redirect you to the main screen after 2 seconds, or you can click “Back to Main Screen” to go back to the main screen.
   
NOTE: When updating a product's inventory to a higher number, the parts associated with the product will be decremented by the number added. If the part inventory of the associated part goes below its minimum, you will not be able to update the stock of the product. Please ensure an adequate inventory of parts before adding stock to a product.

NOTE: The price of the product must be greater than the total of the parts associated with it. Otherwise, you will not be able to save the product.

#### Deleting a Product
1. From the main screen find the product you would like to delete and select the “Delete” button. To help find a part use the search feature. Type in the keyword in the “Filter:” box and select “Search”.
2. A popup will ask you to confirm that you want to delete this product. If you are sure select “OK” and you will be taken to the delete confirmation page. This page will automatically redirect you to the main screen after 2 seconds, or you can click “Back to Main Screen” to go back to the main screen.
3. On the main screen, you will see that the product is no longer listed.

#### Ordering a Product
1. From the main screen find the product you would like to order and select the “Order” button. To help find a part use the search feature. Type in the keyword in the “Filter:” box and select “Search”.
2. If there is adequate stock of the product, you will be taken to the product order confirmation page. This page will automatically redirect you to the main screen after 2 seconds, or you can click “Back to Main Screen” to go back to the main screen.
3. On the main screen, you will that the stock of the product you just ordered has decremented by 1.

NOTE: If the product has no stock you will get an error message when ordering. Ensure there is adequate stock before ordering. 
