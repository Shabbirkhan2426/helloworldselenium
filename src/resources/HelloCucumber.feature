#This is a feature file
  Feature: Login feature

  #This is a Scenario
  Scenario: Login with valid credential

    #These are the steps

      Given  navigate to "https://demo.broadleafcommerce.org/"
      When title of login page is "HEATClINIC"
      And User clicks on the "LOGIN" button
      When User  enter email and password
      And click on "Sign in" button
      Then User should be on Homepage


  Scenario: Login with invalid email with valid password

    Given  navigate to "https://demo.broadleafcommerce.org/"
    And  Click on the "LOGIN" button
    When Enter invalid email and valid password
    And click on "Sign in" button
    Then System  should throw  an  error message"Invalid Credential"


    Scenario: Login with innvalid password and valid email

      Given  navigate to LOGIN" button
      When Enter valid email and invalid password
      And click on "Sign in" button
      Then System  should throw  an  error message "Invalid Credential"

    Scenario: Login with innvalid email and invalid password

      Given  navigate to "https://demo.broadleafcommerce.org/"
      And  Click on the "LOGIN" button
      When Enter invalid email and invalid password
      And click on "Sign in" button
      Then System  should throw  an  error message "Invalid Credential"


      Scenario:Select product from homepage

        Given  navigate to "https://demo.broadleafcommerce.org/"
      And  logged into homepage
      When clicked on "preferable product"
      Then System should take user to "Add to Cart page".

    Scenario:View in Cart pop up window should open when clicking on Add to Cart button

      Given  navigate to "https://demo.broadleafcommerce.org/"
      And  logged into homepage
      When  clicked on "preferable product"
      And System should take me to "Add to Cart" page.
      When click on "Add to Cart" button
      Then System should pop up "View In Cart" window

    Scenario:Shopping Cart page should open when clicking on View in Cart button

      Given  navigate to "https://demo.broadleafcommerce.org/"
      And  logged into homepage
      When  clicked on "preferable product"
      And System should take user to "Add to Cart" page.
      When Iclick on "Add to Cart" button
      And  System should pop up "View In Cart" window
      When  click on "View in Cart"
      Then System should take user to "Shopping Cart" page

    Scenario:Checkout page should open when clicking on checkout  button

      Given  navigate to "https://demo.broadleafcommerce.org/"
      And  logged into homepage
      When clicked on "preferable product"
      And System should take user to "Add to Cart" page.
      When click on "Add to Cart" button
      And  System should pop up "View In Cart" window
      When click on "View in Cart"
      And System should take user to "Shopping Cart" page
      When Clicking on "CheckOut" button
      Then System should take user to the "CheckOut" Page

    Scenario:Checkout page should open when clicking on checkout  button

      Given  navigate to "https://demo.broadleafcommerce.org/"
      And  logged into homepage
      When clicked on "preferable product"
      And System should take user to "Add to Cart" page.
      When click on "Add to Cart" button
      And  System should pop up "View In Cart" window
      When click on "View in Cart"
      And System should take user to "Shopping Cart" page
      When Clicking on "CheckOut" button
      And  System should take user to the "CheckOut" Page
      When user enter all the necessary information and click on "Continue" button
      Then System should take user to the "CheckOut" page where user asked to enter the the payment information







