Feature: Registratio n page
Scenario: Verifyerrormsg
#Given browser is lanuched
#And application is launched successfully in browser
When user fild entire form with invalid mobile number
And click submit button
Then user should gert error masg
 